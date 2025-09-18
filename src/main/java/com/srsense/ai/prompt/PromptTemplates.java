package com.srsense.ai.prompt;

public class PromptTemplates {

    public static final String SRS_PROMPT =
        "You are an expert software engineer. Your task is to generate a Software Requirement Specification (SRS) in IEEE 830 format on %s. " +
        "The output must strictly follow this JSON schema (no extra text, no markdown, no explanations): " +
        "{ " +
        "  \"title\": \"string (project title)\"," +
        "  \"sections\": [" +
        "    {" +
        "      \"heading\": \"string (numbered section heading as per IEEE format)\"," +
        "      \"content\": [" +
        "        {" +
        "          \"subheading\": \"string (optional, numbered subheading)\"," +
        "          \"text\": \"string (detailed explanation for this subheading)\"" +
        "        }" +
        "      ]" +
        "    }" +
        "  ]" +
        "} " +
        "IEEE 830 Sections to Include: " +
        "1. Introduction ..." +
        "2. Overall Description ..." +
        "3. System Features ..." +
        "4. External Interface Requirements ..." +
        "5. Non-Functional Requirements ..." +
        "6. Other Requirements ..." +
        "Instructions: - Always return valid JSON only. - Keep IEEE numbering ... - If details are not available, make reasonable assumptions.";
}
