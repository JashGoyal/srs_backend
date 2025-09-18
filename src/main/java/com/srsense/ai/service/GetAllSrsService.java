package com.srsense.ai.service;

import com.srsense.ai.model.SrsDocument;
import com.srsense.ai.repository.SrsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllSrsService {

    private final SrsRepository srsRepository;

    public GetAllSrsService(SrsRepository srsRepository) {
        this.srsRepository = srsRepository;
    }

    public List<SrsDocument> getAllSrs() {
        return srsRepository.findAll();
    }
}
