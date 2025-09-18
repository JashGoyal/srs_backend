package com.srsense.ai.controller;

import com.srsense.ai.dto.PromptRequest;
import com.srsense.ai.dto.SrsSavedto;
import com.srsense.ai.dto.SrsResponse;
import com.srsense.ai.model.SrsDocument;
import com.srsense.ai.service.GetAllSrsService;
import com.srsense.ai.service.SrsDeleteService;
import com.srsense.ai.service.SrsGenerateService;
import com.srsense.ai.service.SrsSaveService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*")
@Slf4j
@RestController
@RequestMapping("/api/srs")
public class SrsController {

    private final SrsGenerateService generateService;
    private final SrsSaveService saveService;
    private final GetAllSrsService getAllsrsService;
    private final SrsDeleteService deleteService;

    public SrsController(SrsGenerateService generateService, SrsSaveService saveService,
            GetAllSrsService getAllSrsService, SrsDeleteService deleteService) {
        this.generateService = generateService;
        this.saveService = saveService;
        this.getAllsrsService = getAllSrsService;
        this.deleteService = deleteService;
    }

    @PostMapping("/generate")
    public SrsResponse generateSrs(@RequestBody PromptRequest request) {
        log.info("----- In generateSrs Controller -----");
        SrsResponse response = generateService.generate(request);
        log.info("----- Out from generateSrs Controller -----");
        return response;
    }

    @PostMapping("/save")
    public Map<String, Object> saveSrs(@RequestBody SrsSavedto dto) {
        log.info("----- In saveSrs Controller -----");
        SrsDocument savedDoc = saveService.saveSrs(dto);

        Map<String, Object> response = new HashMap<>();
        if (savedDoc != null) {
            response.put("message", "SRS saved successfully.");
            response.put("data", savedDoc);
        log.info("----- Saved SRS -> Out from saveSrs Controller -----");
        } else {
            response.put("message", "Failed to save SRS.");
            response.put("data", null);
            log.info("----- Not able to Save SRS -> Out from saveSrs Controller -----");
        }
        return response;
    }

    @GetMapping("/getsrs")
    public List<SrsDocument> getAllSrs() {
        log.info("Fetching all saved SRS documents");
        return getAllsrsService.getAllSrs();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String, String>> deleteSrs(@PathVariable String id) {
        log.info("Deleting saved SRS documents with id: " + id);
        boolean deleted = deleteService.deleteSrsById(id);
        if (deleted) {
            log.info("SRS Deleted successfully with id: " + id);
            return ResponseEntity.ok(Map.of("message", "SRS deleted successfully."));
        } else {
            log.info("SRS Not found to delete with id: " + id);
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(Map.of("message", "SRS not found."));
        }
    }
}
