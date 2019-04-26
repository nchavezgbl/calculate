package io.client.calculate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

public class CalculateEntryController {
  private final CalculateEntryContract calculateEntryContract;

  public CalculateEntryController(CalculateEntryContract calculateEntryContract){
    this.calculateEntryContract = calculateEntryContract;
  }

  public ResponseEntity add(double inputX, double inputY){
    CalculateEntry result = calculateEntryContract.add(inputX, 0);
    return new ResponseEntity<CalculateEntry>(result, HttpStatus.OK);
  }

  public ResponseEntity subtract(double inputX, double inputY){
    CalculateEntry result = calculateEntryContract.subtract(inputX, inputY);
    return new ResponseEntity<CalculateEntry>(result, HttpStatus.OK);
  }

}
