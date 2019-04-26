package io.client.calculate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {
  @GetMapping("/")
  public String sayHello() {
    return "hi from calculator";
  }

}
