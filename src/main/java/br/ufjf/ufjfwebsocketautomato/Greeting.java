package br.ufjf.ufjfwebsocketautomato;

import org.springframework.web.util.HtmlUtils;

import lombok.Getter;
import lombok.Setter;

public class Greeting {
    @Getter
    @Setter
    private String name;

    public Greeting() {}

    public Greeting(String name) {
        this.name = name;
    }

    public String greet() {
        return "Hello, " + HtmlUtils.htmlEscape(this.name) + "!";
    }
}
