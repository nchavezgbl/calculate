package io.client.calculate;

public interface CalculateEntryContract {
  public CalculateEntry add(double inputX, double inputY);
  public CalculateEntry subtract(double inputX, double inputY);
  public CalculateEntry multiply(double inputX, double inputY);
  public CalculateEntry divide(double inputX, double inputY);
}
