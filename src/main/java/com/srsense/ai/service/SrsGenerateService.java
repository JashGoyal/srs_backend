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

        Map<String, Object> srsData = new HashMap<>();
        SrsResponse response = new SrsResponse();

        String finalPrompt = promptProvider.getSrsPrompt(request.getPrompt());
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
