package com.srsense.ai.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.srsense.ai.model.SrsDocument;

public interface SrsRepository extends MongoRepository<SrsDocument, String> {
}
