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
  @GetMapping("/add/{inputX}/{inputY}")
  public ResponseEntity add(@PathVariable double inputX, @PathVariable double inputY){
    CalculateEntry result = calculateEntryContract.add(inputX, inputY);
    return new ResponseEntity<CalculateEntry>(result, HttpStatus.CREATED);
  }
  @GetMapping("/subtract/{inputX}/{inputY}")
  public ResponseEntity subtract(@PathVariable double inputX, @PathVariable double inputY){
    CalculateEntry result = calculateEntryContract.subtract(inputX, inputY);
    return new ResponseEntity<CalculateEntry>(result, HttpStatus.CREATED);
  }
  @GetMapping("/multiply/{inputX}/{inputY}")
  public ResponseEntity multiply(@PathVariable double inputX, @PathVariable double inputY){
    CalculateEntry result = calculateEntryContract.multiply(inputX, inputY);
    return new ResponseEntity<CalculateEntry>(result, HttpStatus.CREATED);
  }
  @GetMapping("/divide/{inputX}/{inputY}")
  public ResponseEntity divide(@PathVariable double inputX, @PathVariable double inputY){
    CalculateEntry result = calculateEntryContract.divide(inputX, inputY);
    return new ResponseEntity<CalculateEntry>(result, HttpStatus.CREATED);
  }

}
