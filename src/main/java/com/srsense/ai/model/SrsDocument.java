package com.srsense.ai.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.Map;

@Data
@Document(collection = "srs_documents")
public class SrsDocument {
    @Id
    private String id;

    private Instant createdAt;

    private Map<String, Object> aiResponse; 
}
