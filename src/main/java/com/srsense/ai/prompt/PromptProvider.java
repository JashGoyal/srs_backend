package com.srsense.ai.prompt;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class PromptProvider {

    public String getSrsPrompt1(String projectDescription) {
        log.info("Generating SRS for format IEEE830");
        String formatted = String.format(PromptTemplates.IEEE830, projectDescription);
        return formatted;
    }

    public String getSrsPrompt2(String projectDescription) {
        log.info("Generating SRS for format: IEEE29148 ");
        return String.format(PromptTemplates.IEEE29148, projectDescription);
    }

    public String getSrsPrompt3(String projectDescription) {
        log.info("Generating SRS for format: Volere");
        return String.format(PromptTemplates.Volere, projectDescription);
    }

    public String getSrsPrompt4(String projectDescription) {
        log.info("Generating SRS for format: Agile");
        return String.format(PromptTemplates.Agile, projectDescription);
    }

    public String getSrsPrompt5(String projectDescription) {
        log.info("Generating SRS for format: ISO");
        return String.format(PromptTemplates.ISO, projectDescription);
    }

    public String getSrsPrompt6(String projectDescription) {
        log.info("Generating SRS for format: FURPS");
        return String.format(PromptTemplates.FURPS, projectDescription);
    }

    public String getSrsPrompt7(String projectDescription) {
        log.info("Generating SRS for format: CMMI");
        return String.format(PromptTemplates.CMMI, projectDescription);
    }

    public String getSrsPrompt8(String projectDescription) {
        log.info("Generating SRS for format: BRD");
        return String.format(PromptTemplates.BRD, projectDescription);
    }

}
