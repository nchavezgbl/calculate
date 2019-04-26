package io.client.calculate;

import io.client.calculate.Operation.OperationType;

public class CalculateEntryInMemory implements CalculateEntryContract {

  @Override
  public double add(double inputX, double inputY) {
    double result = inputX + inputY;
    CalculateEntry addition = new CalculateEntry(inputX, inputY, OperationType.ADDITION);
    addition.setResult(result);
    return result;
  }

  @Override
  public double subtract(double inputX, double inputY) {
    return 0;
  }

  @Override
  public double multiply(double inputX, double inputY) {
    return 0;
  }

  @Override
  public double divide(double inputX, double inputY) {
    return 0;
  }
}
