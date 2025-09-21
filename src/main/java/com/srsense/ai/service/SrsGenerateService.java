package com.srsense.ai.service;

import com.srsense.ai.client.OpenAiClient;
import com.srsense.ai.dto.PromptRequest;
import com.srsense.ai.dto.SrsResponse;
import com.srsense.ai.prompt.PromptProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class SrsGenerateService {

    private final PromptProvider promptProvider;
    private final OpenAiClient openAiClient;

    public SrsGenerateService(PromptProvider promptProvider, OpenAiClient openAiClient) {
        this.promptProvider = promptProvider;
        this.openAiClient = openAiClient;
    }

    public SrsResponse generate(PromptRequest request) {
        log.info("Generating SRS for prompt: {}", request.getPrompt());
        log.info("Generating SRS for format: {}", request.getFormat());

        Map<String, Object> srsData = new HashMap<>();
        SrsResponse response = new SrsResponse();

        String format = request.getFormat();
        String finalPrompt = " ";

        if (format != null) {
            format = format.trim();
        }

        if ("IEEE830".equalsIgnoreCase(format)) {
            finalPrompt = promptProvider.getSrsPrompt1(request.getPrompt());
        } else if ("IEEE29148".equalsIgnoreCase(format)) {
            finalPrompt = promptProvider.getSrsPrompt2(request.getPrompt());
        } else if ("Volere".equalsIgnoreCase(format)) {
            finalPrompt = promptProvider.getSrsPrompt3(request.getPrompt());
        } else if ("Agile".equalsIgnoreCase(format)) {
            finalPrompt = promptProvider.getSrsPrompt4(request.getPrompt());
        } else if ("ISO".equalsIgnoreCase(format)) {
            finalPrompt = promptProvider.getSrsPrompt5(request.getPrompt());
        } else if ("FURPS".equalsIgnoreCase(format)) {
            finalPrompt = promptProvider.getSrsPrompt6(request.getPrompt());
        } else if ("CMMI".equalsIgnoreCase(format)) {
            finalPrompt = promptProvider.getSrsPrompt7(request.getPrompt());
        } else if ("BRD".equalsIgnoreCase(format)) {
            finalPrompt = promptProvider.getSrsPrompt8(request.getPrompt());
        } else {
            log.warn("Unknown format: {}", format);
        }

        log.info("Final Prompt : {}", finalPrompt);

        String aiResponse = openAiClient.generateCompletion(finalPrompt);

        if (aiResponse == null) {
            log.error("Failed to generate SRS for prompt: {}", request.getPrompt());
            response.setStatus("error");
            srsData.put("aiPromptUsed", finalPrompt);
            srsData.put("error", "Failed to generate SRS. Please try again later !!!");
        } else {
            srsData.put("title", "SRS for: " + request.getPrompt());
            srsData.put("aiPromptUsed", finalPrompt);
            srsData.put("aiResponse", aiResponse);
            response.setStatus("success");
        }

        response.setSrsData(srsData);
        log.info("Exiting from SrsGenerateService with aiResponse: {}", srsData.get("aiResponse"));

        return response;
    }
}
