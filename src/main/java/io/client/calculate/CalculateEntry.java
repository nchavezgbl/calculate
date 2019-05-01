package io.client.calculate;

import io.client.calculate.Operation.OperationType;
import java.util.Objects;

public class CalculateEntry {

  private long id;
  private double inputX;
  private double inputY;
  private OperationType operationType;
  private double result;

  public CalculateEntry() {

  }

  public CalculateEntry(double inputX, double inputY, double result,
      OperationType operationType) {
    this.inputX = inputX;
    this.inputY = inputY;
    this.result = result;
    this.operationType = operationType;
  }

  public CalculateEntry(int id, double inputX, double inputY, double result,
      OperationType operationType) {
    this.id = id;
    this.inputX = inputX;
    this.inputY = inputY;
    this.result = result;
    this.operationType = operationType;
  }

    public CalculateEntry(double userInputX, double userInputY, double result) {
      this.inputX = inputX;
      this.inputY = inputY;
      this.result = result;
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

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public OperationType getOperationType() {
    return operationType;
  }

  public void setOperationType(OperationType operationType) {
    this.operationType = operationType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalculateEntry that = (CalculateEntry) o;
    return id == that.id &&
        Double.compare(that.inputX, inputX) == 0 &&
        Double.compare(that.inputY, inputY) == 0 &&
        Double.compare(that.result, result) == 0 &&
        operationType == that.operationType;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, inputX, inputY, result, operationType);
  }

  @Override
  public String toString() {
    return "CalculateEntry{" +
        "id=" + id +
        ", inputX=" + inputX +
        ", inputY=" + inputY +
        ", result=" + result +
        ", operationType=" + operationType +
        '}';
  }
}
