package org.example.expections;

public class ParametrosInvalidosException extends RuntimeException {
  public ParametrosInvalidosException(String message) {
    super(message);
  }
}
