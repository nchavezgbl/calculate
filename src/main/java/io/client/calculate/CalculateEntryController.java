package io.client.calculate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculations")
public class CalculateEntryController {
  private final CalculateEntryContract calculateEntryContract;

  public CalculateEntryController(CalculateEntryContract calculateEntryContract){
    this.calculateEntryContract = calculateEntryContract;
  }
  @PostMapping("/add/{inputX}/{inputY}")
  public ResponseEntity add(@PathVariable double inputX, @PathVariable double inputY){
    double result = calculateEntryContract.add(inputX, inputY);
    return new ResponseEntity<Double>(result, HttpStatus.OK);
  }

}
