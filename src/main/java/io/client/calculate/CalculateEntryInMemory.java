package io.client.calculate;

import io.client.calculate.Operation.OperationType;
import java.util.HashMap;

public class CalculateEntryInMemory implements CalculateEntryContract {

  private HashMap<Long, CalculateEntry> calculateEntries = new HashMap<Long, CalculateEntry>();
  private long currentCalculateId = 1L;

  @Override
  public CalculateEntry add(double inputX, double inputY) {
    double result = inputX + inputY;
    CalculateEntry additionEntry = new CalculateEntry(inputX, inputY, result, OperationType.ADDITION);
    calculateEntries.put(currentCalculateId, additionEntry);
    currentCalculateId++;
    return additionEntry;
  }

  @Override
  public CalculateEntry subtract(double inputX, double inputY) {
    double result = inputX + inputY;
    CalculateEntry subtractionEntry = new CalculateEntry(inputX, inputY, result, OperationType.SUBTRACTION);
    calculateEntries.put(currentCalculateId, subtractionEntry);
    currentCalculateId++;
    return subtractionEntry;
  }

  @Override
  public CalculateEntry multiply(double inputX, double inputY) {
    double result = inputX + inputY;
    CalculateEntry multiplyEntry = new CalculateEntry(inputX, inputY, result, OperationType.MULTIPLICATION);
    calculateEntries.put(currentCalculateId, multiplyEntry);
    currentCalculateId++;
    return multiplyEntry;
  }

  @Override
  public CalculateEntry divide(double inputX, double inputY) {
    double result = inputX + inputY;
    CalculateEntry divideEntry = new CalculateEntry(inputX, inputY, result, OperationType.DIVISION);
    calculateEntries.put(currentCalculateId, divideEntry);
    currentCalculateId++;
    return divideEntry;
  }
}
