package com.example.springapi.dto;

import lombok.Data;

@Data
public class MessageDTO {
  private long id;
  private String title;
  private String content;
}
