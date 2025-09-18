package com.srsense.ai.service;

import com.srsense.ai.dto.SrsSavedto;
import com.srsense.ai.model.SrsDocument;
import com.srsense.ai.repository.SrsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@Slf4j
public class SrsSaveService {

    private final SrsRepository srsRepository;

    public SrsSaveService(SrsRepository srsRepository) {
        this.srsRepository = srsRepository;
    }

    public SrsDocument saveSrs(SrsSavedto dto) {
        SrsDocument doc = new SrsDocument();
        doc.setAiResponse(dto.getAiResponse());
        doc.setCreatedAt(Instant.now());
        log.info("Saving SRS document");
        return srsRepository.save(doc);
    }
}
