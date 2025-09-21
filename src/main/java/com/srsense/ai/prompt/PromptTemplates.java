package com.srsense.ai.prompt;

public class PromptTemplates {

    public static final String IEEE830 = "You are an expert software engineer. Your task is to generate a Software Requirement Specification (SRS) in IEEE 830 format on %s. "
            +
            "The output must strictly follow this JSON schema (no extra text, no markdown, no explanations): " +
            "{ " +
            "  \"title\": \"string (project title)\"," +
            "  \"  \\\"format\\\": \\\"string (project format like ieee 830)\\\",\"" +
            "  \\\"keyFeatures\\\": \\\"string\\\"," +
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

    public static final String IEEE29148 = "\"You are an expert software engineer. Your task is to generate a Software Requirement Specification (SRS) in IEEE 29148 format on %s. \" + \r\n"
            + //
            "\"The output must strictly follow this JSON schema (no extra text, no markdown, no explanations): \" + \r\n"
            + //
            "\"{ \" + \r\n" + //
            "\"  \\\\\\\"title\\\\\\\": \\\\\\\"string (project title)\\\\\\\",\" + \r\n" + //
            "  \"  \\\"format\\\": \\\"string (project format like ieee 29148)\\\",\"" +
            "  \\\"keyFeatures\\\": \\\"string\\\"," +
            "\"  \\\\\\\"sections\\\\\\\": [\" + \r\n" + //
            "\"    {\" + \r\n" + //
            "\"      \\\\\\\"heading\\\\\\\": \\\\\\\"string (numbered section heading as per IEEE 29148 format)\\\\\\\",\" + \r\n"
            + //
            "\"      \\\\\\\"content\\\\\\\": [\" + \r\n" + //
            "\"        {\" + \r\n" + //
            "\"          \\\\\\\"subheading\\\\\\\": \\\\\\\"string (optional, numbered subheading)\\\\\\\",\" + \r\n" + //
            "\"          \\\\\\\"text\\\\\\\": \\\\\\\"string (detailed explanation for this subheading)\\\\\\\"\" + \r\n"
            + //
            "\"        }\" + \r\n" + //
            "\"      ]\" + \r\n" + //
            "\"    }\" + \r\n" + //
            "\"  ]\" + \r\n" + //
            "\"} \" + \r\n" + //
            "\"IEEE 29148 Sections to Include: \" + \r\n" + //
            "\"1. Scope ... \" + \r\n" + //
            "\"2. Referenced Documents ... \" + \r\n" + //
            "\"3. Definitions and Acronyms ... \" + \r\n" + //
            "\"4. Overview ... \" + \r\n" + //
            "\"5. System Overview ... \" + \r\n" + //
            "\"6. System Context ... \" + \r\n" + //
            "\"7. Stakeholder Requirements ... \" + \r\n" + //
            "\"8. System Requirements ... \" + \r\n" + //
            "\"9. Verification & Validation ... \" + \r\n" + //
            "\"10. Traceability ... \" + \r\n" + //
            "\"Instructions: - Always return valid JSON only. - Keep IEEE numbering ... - If details are not available, make reasonable assumptions.\"\r\n"
            + //
            "";

    public static final String Volere = "You are an expert software engineer. Your task is to generate a Software Requirement Specification (SRS) in the Volere Requirements Specification Template format on %s. "
            +
            "The output must strictly follow this JSON schema (no extra text, no markdown, no explanations): " +
            "{ " +
            "  \\\"title\\\": \\\"string (project title)\\\"," +
            "  \"  \\\"format\\\": \\\"string (project format like volere fullname)\\\",\"" +
            "  \\\"keyFeatures\\\": \\\"string\\\"," +
            "  \\\"sections\\\": [" +
            "    {" +
            "      \\\"heading\\\": \\\"string (numbered section heading as per Volere format)\\\"," +
            "      \\\"content\\\": [" +
            "        {" +
            "          \\\"subheading\\\": \\\"string (optional, numbered subheading)\\\"," +
            "          \\\"text\\\": \\\"string (detailed explanation for this subheading)\\\"" +
            "        }" +
            "      ]" +
            "    }" +
            "  ]" +
            "} " +
            "Volere Sections to Include: " +
            "1. Project Drivers ... " +
            "2. Project Constraints ... " +
            "3. Functional Requirements ... " +
            "4. Non-Functional Requirements ... " +
            "5. Business Requirements ... " +
            "6. Project Issues ... " +
            "7. Glossary ... " +
            "Instructions: - Always return valid JSON only. - Keep Volere numbering ... - If details are not available, make reasonable assumptions.";

    public static final String Agile = "You are an expert agile analyst. Your task is to generate an Agile-style Software Requirement Specification (SRS) using user stories and acceptance criteria on %s. "
            +
            "The output must strictly follow this JSON schema (no extra text, no markdown, no explanations): " +
            "{ " +
            "  \\\"title\\\": \\\"string (project title)\\\"," +
            "  \"  \\\"format\\\": \\\"string (project format like agile fullname)\\\",\"" +
            "  \\\"keyFeatures\\\": \\\"string\\\"," +
            "  \\\"sections\\\": [" +
            "    {" +
            "      \\\"heading\\\": \\\"string (numbered section heading as per Agile SRS)\\\"," +
            "      \\\"content\\\": [" +
            "        {" +
            "          \\\"subheading\\\": \\\"string (optional, numbered subheading)\\\"," +
            "          \\\"text\\\": \\\"string (detailed explanation for this subheading)\\\"" +
            "        }" +
            "      ]" +
            "    }" +
            "  ]" +
            "} " +
            "Agile SRS Sections to Include: " +
            "1. User Stories ... " +
            "2. Acceptance Criteria ... " +
            "3. Non-Functional Requirements ... " +
            "4. Constraints ... " +
            "5. Definitions / Glossary ... " +
            "Instructions: - Always return valid JSON only. - Keep Agile format structure ... - If details are not available, make reasonable assumptions.";

    public static final String ISO = "You are an expert systems engineer. Your task is to generate a Software Requirement Specification (SRS) in the ISO/IEC/IEEE 12207 / 15289 format on %s. "
            +
            "The output must strictly follow this JSON schema (no extra text, no markdown, no explanations): " +
            "{ " +
            "  \\\"title\\\": \\\"string (project title)\\\"," +
            "  \"  \\\"format\\\": \\\"string (project format like iso fullform)\\\",\"" +
            "  \\\"keyFeatures\\\": \\\"string\\\"," +
            "  \\\"sections\\\": [" +
            "    {" +
            "      \\\"heading\\\": \\\"string (numbered section heading as per ISO/IEC/IEEE 15289 format)\\\"," +
            "      \\\"content\\\": [" +
            "        {" +
            "          \\\"subheading\\\": \\\"string (optional, numbered subheading)\\\"," +
            "          \\\"text\\\": \\\"string (detailed explanation for this subheading)\\\"" +
            "        }" +
            "      ]" +
            "    }" +
            "  ]" +
            "} " +
            "ISO/IEC/IEEE 15289 Sections to Include: " +
            "1. Identification ... " +
            "2. Scope ... " +
            "3. Context of Use ... " +
            "4. Functional Requirements ... " +
            "5. Non-Functional Requirements ... " +
            "6. Constraints ... " +
            "7. Compliance Requirements ... " +
            "8. Risk Considerations ... " +
            "9. Traceability ... " +
            "Instructions: - Always return valid JSON only. - Keep ISO section structure ... - If details are not available, make reasonable assumptions.";

    public static final String FURPS = "You are an expert requirements analyst. Your task is to generate a Software Requirement Specification (SRS) based on the FURPS model for the project \"%s\". "
            +
            "The output must strictly follow this JSON schema (no extra text, no markdown, no explanations): " +
            "{ " +
            "  \\\"title\\\": \\\"string (project title)\\\"," +
            "  \"  \\\"format\\\": \\\"string (project format like Functionality, Usability, Reliability, Performance, Supportability)\\\",\"" +
            "  \\\"keyFeatures\\\": \\\"string\\\"," +
            "  \\\"sections\\\": [" +
            "    {" +
            "      \\\"heading\\\": \\\"string (FURPS category: Functional, Usability, Reliability, etc.)\\\"," +
            "      \\\"content\\\": [" +
            "        {" +
            "          \\\"subheading\\\": \\\"string (optional subheading for specific requirement)\\\"," +
            "          \\\"text\\\": \\\"string (detailed explanation for this subheading)\\\"" +
            "        }" +
            "      ]" +
            "    }" +
            "  ]" +
            "} " +
            "FURPS Categories to Include: " +
            "1. Functional Requirements ... " +
            "2. Usability Requirements ... " +
            "3. Reliability Requirements ... " +
            "4. Performance Requirements ... " +
            "5. Supportability Requirements ... " +
            "Instructions: - Always return valid JSON only. - Use FURPS as top-level headings ... - If details are not available, make reasonable assumptions.";

    public static final String CMMI = "You are a process-oriented software engineer. Your task is to generate a Software Requirement Specification (SRS) in alignment with CMMI practices for \"%s\". "
            +
            "The output must strictly follow this JSON schema (no extra text, no markdown, no explanations): " +
            "{ " +
            "  \\\"title\\\": \\\"string (project title)\\\"," +
            "  \"  \\\"format\\\": \\\"string (project format like Capability Maturity Model Integration)\\\",\"" +
            "  \\\"keyFeatures\\\": \\\"string\\\"," +
            "  \\\"sections\\\": [" +
            "    {" +
            "      \\\"heading\\\": \\\"string (CMMI-aligned SRS section name)\\\"," +
            "      \\\"content\\\": [" +
            "        {" +
            "          \\\"subheading\\\": \\\"string (optional subheading)\\\"," +
            "          \\\"text\\\": \\\"string (detailed explanation for this subheading)\\\"" +
            "        }" +
            "      ]" +
            "    }" +
            "  ]" +
            "} " +
            "CMMI-Aligned Sections to Include: " +
            "1. Requirements Management ... " +
            "2. Requirements Development ... " +
            "3. Stakeholder Needs ... " +
            "4. Product Requirements ... " +
            "5. Verification and Validation ... " +
            "6. Traceability ... " +
            "Instructions: - Always return valid JSON only. - Use CMMI-aligned structure ... - If details are not available, make reasonable assumptions.";

    public static final String BRD = "You are a business analyst. Your task is to generate a Software Requirement Specification (SRS) in the format of a Business Requirements Document (BRD) based on the BABOK guide for \"%s\". "
            +
            "The output must strictly follow this JSON schema (no extra text, no markdown, no explanations): " +
            "{ " +
            "  \\\"title\\\": \\\"string (project title)\\\"," +
            "  \"  \\\"format\\\": \\\"string (project format like brd fullform)\\\",\"" +
            "  \\\"keyFeatures\\\": \\\"string\\\"," +
            "  \\\"sections\\\": [" +
            "    {" +
            "      \\\"heading\\\": \\\"string (numbered BRD section heading)\\\"," +
            "      \\\"content\\\": [" +
            "        {" +
            "          \\\"subheading\\\": \\\"string (optional subheading)\\\"," +
            "          \\\"text\\\": \\\"string (detailed explanation for this subheading)\\\"" +
            "        }" +
            "      ]" +
            "    }" +
            "  ]" +
            "} " +
            "BRD Sections to Include: " +
            "1. Executive Summary ... " +
            "2. Business Objectives ... " +
            "3. Scope ... " +
            "4. Stakeholders ... " +
            "5. Functional Requirements ... " +
            "6. Non-Functional Requirements ... " +
            "7. Assumptions and Constraints ... " +
            "8. Glossary ... " +
            "Instructions: - Always return valid JSON only. - Use BRD structure and numbering ... - If details are not available, make reasonable assumptions.";

}
