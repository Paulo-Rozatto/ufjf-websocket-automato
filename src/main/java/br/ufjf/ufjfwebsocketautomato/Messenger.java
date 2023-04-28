package br.ufjf.ufjfwebsocketautomato;

import lombok.Getter;

public class Messenger {
    @Getter
    private String content;
  
    public Messenger() {
    }
  
    public Messenger(String content) {
      this.content = content;
    }
  }
