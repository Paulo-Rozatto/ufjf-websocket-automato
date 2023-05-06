package br.ufjf.ufjfwebsocketautomato;

import lombok.Getter;
import lombok.Setter;

public class Request {
    @Getter
    @Setter
    private String name;

    public Request() {}

    public Request(String name) {
        this.name = name;
    }
}
