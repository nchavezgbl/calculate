package io.client.calculate;

import io.client.calculate.Operation.OperationType;

public class CalculateEntry {
  private double inputX;
  private double inputY;
  private double result;
  private OperationType operationType;

  public CalculateEntry() {

  }

  public CalculateEntry(double inputX, double inputY,
      OperationType operationType) {
    this.inputX = inputX;
    this.inputY = inputY;
    this.operationType = operationType;
  }

  public double getInputX() {
    return inputX;
  }

  public void setInputX(double inputX) {
    this.inputX = inputX;
  }

  public double getInputY() {
    return inputY;
  }

  public void setInputY(double inputY) {
    this.inputY = inputY;
  }

  public double getResult() {
    return result;
  }

  public void setResult(double result) {
    this.result = result;
  }

  public OperationType getOperationType() {
    return operationType;
  }

  public void setOperationType(OperationType operationType) {
    this.operationType = operationType;
  }
}
