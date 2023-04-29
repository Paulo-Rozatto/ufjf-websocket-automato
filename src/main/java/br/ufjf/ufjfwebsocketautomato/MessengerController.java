package br.ufjf.ufjfwebsocketautomato;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import lombok.val;

@Controller
public class MessengerController {

  @MessageMapping("/hello")
  @SendTo("/data/greetings")
  public Messenger greeting(Greeting greeting) throws Exception {
    Thread.sleep(1000); // simulated delay
    return new Messenger(greeting.greet());
  }

  @MessageMapping("/sample")
  @SendTo("/data/sample")
  public Messenger getExample(Greeting greeting) {
    var res = "";

    try {
      val fileName = "automata/" + greeting.getName() + ".json";
      val is = new ClassPathResource(fileName).getInputStream();
      res = IOUtils.toString(is, "UTF-8");
    } catch (IOException e) {
      res = "Not found";
    }
    
    return new Messenger(res);
  }

}
