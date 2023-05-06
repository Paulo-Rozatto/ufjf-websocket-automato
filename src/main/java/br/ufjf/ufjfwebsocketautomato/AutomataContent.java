package br.ufjf.ufjfwebsocketautomato;

import lombok.Getter;

public class AutomataContent {
    @Getter
    private String content;
  
    public AutomataContent() {
    }
  
    public AutomataContent(String content) {
      this.content = content;
    }
  }
