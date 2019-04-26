package io.client.calculate;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {
  private String message;
  public CalculateController(
      @Value("${welcome.message}") String str
  ) {
    this.message = str;
  }
  @GetMapping("/")
  public String sayHello() {
    return message;
  }

}
