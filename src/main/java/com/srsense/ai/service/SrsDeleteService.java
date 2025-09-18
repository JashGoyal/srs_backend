package com.srsense.ai.service;

import com.srsense.ai.repository.SrsRepository;
import org.springframework.stereotype.Service;

@Service
public class SrsDeleteService {

    private final SrsRepository srsRepository;

    public SrsDeleteService(SrsRepository srsRepository) {
        this.srsRepository = srsRepository;
    }

    public boolean deleteSrsById(String id) {
        if (srsRepository.existsById(id)) {
            srsRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
