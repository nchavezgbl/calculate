package io.client.calculate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculate")
public class CalculateEntryController {
  private final CalculateEntryContract calculateEntryContract;

  public CalculateEntryController(CalculateEntryContract calculateEntryContract){
    this.calculateEntryContract = calculateEntryContract;
  }
  @PostMapping("/add/{inputX}/{inputY}")
  public ResponseEntity add(@PathVariable double inputX, @PathVariable double inputY){
    CalculateEntry result = calculateEntryContract.add(inputX, inputY);
    return new ResponseEntity<CalculateEntry>(result, HttpStatus.CREATED);
  }
  @PostMapping("/subtract/{inputX}/{inputY}")
  public ResponseEntity subtract(@PathVariable double inputX, @PathVariable double inputY){
    CalculateEntry result = calculateEntryContract.subtract(inputX, inputY);
    return new ResponseEntity<CalculateEntry>(result, HttpStatus.CREATED);
  }
  @PostMapping("/multiply/{inputX}/{inputY}")
  public ResponseEntity multiply(@PathVariable double inputX, @PathVariable double inputY){
    CalculateEntry result = calculateEntryContract.multiply(inputX, inputY);
    return new ResponseEntity<CalculateEntry>(result, HttpStatus.CREATED);
  }
  @PostMapping("/divide/{inputX}/{inputY}")
  public ResponseEntity divide(@PathVariable double inputX, @PathVariable double inputY){
    CalculateEntry result = calculateEntryContract.divide(inputX, inputY);
    return new ResponseEntity<CalculateEntry>(result, HttpStatus.CREATED);
  }

}
