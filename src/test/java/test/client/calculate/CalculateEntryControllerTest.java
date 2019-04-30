package test.client.calculate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import io.client.calculate.*;
import io.client.calculate.Operation.OperationType;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


public class CalculateEntryControllerTest {
  private CalculateEntryContract calculateEntryContract;
  private CalculateEntryController calculateEntryController;


  @Before
  public void SetUp() throws Exception{
    calculateEntryContract = mock(CalculateEntryContract.class);
    calculateEntryController = new CalculateEntryController(calculateEntryContract);

  }

  @Test
  public void testAdd() throws Exception{
    double inputX = 1;
    double inputY = 2;
    int id =1;
    int result = 3;
    CalculateEntry expectedResult = new CalculateEntry(id, inputX, inputY, result, Operation.OperationType.ADDITION);
    doReturn(expectedResult)
            .when(calculateEntryContract)
            .add(any(Double.class), any(Double.class));
    ResponseEntity response = calculateEntryController.add(inputX,inputY);
    verify(calculateEntryContract).add(inputX,inputY);
    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.CREATED);
    assertThat(response.getBody()).isEqualTo(expectedResult);
  }

  @Test
  public void testSubtract() throws Exception{
    double inputX = 2;
    double inputY = 1;
    int id =1;
    int result = 1;
    CalculateEntry expectedResult = new CalculateEntry(id, inputX, inputY, result, OperationType.SUBTRACTION);
    doReturn(expectedResult)
            .when(calculateEntryContract)
            .subtract(any(Double.class), any(Double.class));
    ResponseEntity response = calculateEntryController.subtract(inputX,inputY);
    verify(calculateEntryContract).subtract(inputX,inputY);
    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.CREATED);
    assertThat(response.getBody()).isEqualTo(expectedResult);
  }
  @Test
  public void testMultiply() throws Exception{
    double inputX = 5;
    double inputY = 3;
    int id =1;
    int result = 15;
    CalculateEntry expectedResult = new CalculateEntry(id, inputX, inputY, result, OperationType.MULTIPLICATION);
    doReturn(expectedResult)
            .when(calculateEntryContract)
            .multiply(any(Double.class), any(Double.class));
    ResponseEntity response = calculateEntryController.multiply(inputX,inputY);
    verify(calculateEntryContract).multiply(inputX,inputY);
    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.CREATED);
    assertThat(response.getBody()).isEqualTo(expectedResult);
  }

  @Test
  public void testDivide() throws Exception{
    double inputX = 15;
    double inputY = 3;
    int id =1;
    int result = 5;
    CalculateEntry expectedResult = new CalculateEntry(id, inputX, inputY, result, OperationType.DIVISION);
    doReturn(expectedResult)
            .when(calculateEntryContract)
            .divide(any(Double.class), any(Double.class));
    ResponseEntity response = calculateEntryController.divide(inputX,inputY);
    verify(calculateEntryContract).divide(inputX,inputY);
    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.CREATED);
    assertThat(response.getBody()).isEqualTo(expectedResult);
  }




}
