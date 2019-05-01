package test.client.calculate;

import com.jayway.jsonpath.DocumentContext;
import io.client.calculate.CalculateApplication;
import io.client.calculate.CalculateEntry;
import io.client.calculate.Operation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static com.jayway.jsonpath.JsonPath.parse;
import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CalculateApplication.class, webEnvironment = RANDOM_PORT)
public class CalculateEntryApiTest {

    @Autowired
    private TestRestTemplate restTemplate;

    double userInputX = 0;
    double userInputY = 0;
     double result = -1;
    CalculateEntry calculateEntry = new CalculateEntry(userInputX,userInputY, result);


    @Test
    public void testAdd() throws Exception{
        userInputX =5;
        userInputY = 7;
        result = 12;
        calculateEntry.setInputX(userInputX);
        calculateEntry.setInputY(userInputY);
        calculateEntry.setOperationType(Operation.OperationType.ADDITION);
        calculateEntry.setResult(result);
        String url = "/calculate/add/" +userInputX + "/" +userInputY;
        ResponseEntity<String> addResponse = restTemplate.postForEntity(url,calculateEntry, String.class);
        assertThat(addResponse.getStatusCode()).isEqualTo(HttpStatus.CREATED);
        DocumentContext createJson = parse(addResponse.getBody());
        assertThat(createJson.read("$.id", Long.class)).isGreaterThan(0);
        assertThat(createJson.read("$.result", Double.class)).isEqualTo(result);
        assertThat(createJson.read("$.operationType", String.class)).isEqualTo(Operation.OperationType.ADDITION.toString());

    }

    @Test
    public void testSubtract() throws Exception{
        userInputX =7;
        userInputY = 5;
        result = 2;
        calculateEntry.setInputX(userInputX);
        calculateEntry.setInputY(userInputY);
        calculateEntry.setOperationType(Operation.OperationType.SUBTRACTION);
        calculateEntry.setResult(result);
        String url = "/calculate/subtract/" +userInputX + "/" +userInputY;
        ResponseEntity<String> subtractResponse = restTemplate.postForEntity(url,calculateEntry, String.class);
        assertThat(subtractResponse.getStatusCode()).isEqualTo(HttpStatus.CREATED);
        DocumentContext createJson = parse(subtractResponse.getBody());
        assertThat(createJson.read("$.id", Long.class)).isGreaterThan(0);
        assertThat(createJson.read("$.result", Double.class)).isEqualTo(result);
        assertThat(createJson.read("$.operationType", String.class)).isEqualTo(Operation.OperationType.SUBTRACTION.toString());

    }

    @Test
    public void testMultiply() throws Exception{
        userInputX =7;
        userInputY = 5;
        result = 35;
        calculateEntry.setInputX(userInputX);
        calculateEntry.setInputY(userInputY);
        calculateEntry.setOperationType(Operation.OperationType.MULTIPLICATION);
        calculateEntry.setResult(result);
        String url = "/calculate/multiply/" +userInputX + "/" +userInputY;
        ResponseEntity<String> multiplyResponse = restTemplate.postForEntity(url,calculateEntry, String.class);
        assertThat(multiplyResponse.getStatusCode()).isEqualTo(HttpStatus.CREATED);
        DocumentContext createJson = parse(multiplyResponse.getBody());
        assertThat(createJson.read("$.id", Long.class)).isGreaterThan(0);
        assertThat(createJson.read("$.result", Double.class)).isEqualTo(result);
        assertThat(createJson.read("$.operationType", String.class)).isEqualTo(Operation.OperationType.MULTIPLICATION.toString());

    }

    @Test
    public void testDivide() throws Exception{
        userInputX =35;
        userInputY = 5;
        result = 7;
        calculateEntry.setInputX(userInputX);
        calculateEntry.setInputY(userInputY);
        calculateEntry.setOperationType(Operation.OperationType.DIVISION);
        calculateEntry.setResult(result);
        String url = "/calculate/divide/" +userInputX + "/" +userInputY;
        ResponseEntity<String> multiplyResponse = restTemplate.postForEntity(url,calculateEntry, String.class);
        assertThat(multiplyResponse.getStatusCode()).isEqualTo(HttpStatus.CREATED);
        DocumentContext createJson = parse(multiplyResponse.getBody());
        assertThat(createJson.read("$.id", Long.class)).isGreaterThan(0);
        assertThat(createJson.read("$.result", Double.class)).isEqualTo(result);
        assertThat(createJson.read("$.operationType", String.class)).isEqualTo(Operation.OperationType.DIVISION.toString());

    }


}
