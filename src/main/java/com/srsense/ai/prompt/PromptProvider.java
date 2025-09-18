package com.srsense.ai.prompt;

import org.springframework.stereotype.Component;

@Component
public class PromptProvider {

    public String getSrsPrompt(String projectDescription) {
        return String.format(PromptTemplates.SRS_PROMPT, projectDescription);
    }
    
}
