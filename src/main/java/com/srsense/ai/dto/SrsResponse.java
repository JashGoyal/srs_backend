package com.srsense.ai.dto;

import lombok.Data;
import java.util.Map;

@Data
public class SrsResponse {
  private String status;
  private Map<String, Object> srsData;
}
