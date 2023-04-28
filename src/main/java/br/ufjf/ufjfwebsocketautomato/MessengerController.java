package br.ufjf.ufjfwebsocketautomato;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessengerController {

  @MessageMapping("/hello")
  @SendTo("/data/greetings")
  public Messenger greeting(Greeting greeting) throws Exception {
    Thread.sleep(1000); // simulated delay
    return new Messenger(greeting.greet());
  }

}
