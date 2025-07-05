package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double average(int sum, int cnt) {
    return (double) sum / cnt;
  }

  public int sumRange(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      sum += i;
    }
    return sum;
  }

  public int sumEven(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    return sum;
  }

  public int sumOdd(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 == 1) {
        sum += i;
      }
    }
    return sum;
  }

}
