package com.srsense.ai.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import jakarta.annotation.PostConstruct;

import java.util.*;



@Component
public class OpenAiClient {

    @Value("${openrouter.api.key}")
private String apiKey;

@PostConstruct
public void init() {
    if (apiKey == null || apiKey.isEmpty()) {
        throw new RuntimeException("API key is missing!");
    }
}
    // private final String apiKey;
    private final String apiUrl;
    private final RestTemplate restTemplate;

    public OpenAiClient(
            @Value("${openrouter.api.key}") String apiKey,
            @Value("${openrouter.api.url}") String apiUrl) {
        this.apiKey = apiKey;
        this.apiUrl = apiUrl;
        this.restTemplate = new RestTemplate();
    }

    public String generateCompletion(String prompt) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setBearerAuth(apiKey);

            Map<String, Object> body = new HashMap<>();
            body.put("model", "gpt-4o-mini");
            body.put("messages", Arrays.asList(
                    Map.of("role", "system", "content", "You are a helpful assistant that returns ONLY valid JSON."),
                    Map.of("role", "user", "content", prompt)
            ));
            body.put("temperature", 0);

            HttpEntity<Map<String, Object>> request = new HttpEntity<>(body, headers);
            ResponseEntity<Map> response = restTemplate.exchange(apiUrl, HttpMethod.POST, request, Map.class);

            if (response.getBody() != null) {
                List<Map<String, Object>> choices = (List<Map<String, Object>>) response.getBody().get("choices");
                if (choices != null && !choices.isEmpty()) {
                    Map<String, Object> message = (Map<String, Object>) choices.get(0).get("message");
                    return message.get("content").toString();
                }
            }
        } catch (Exception e) {
            System.err.println("API call failed: " + e.getMessage());
        }
        return null;
    }
}
