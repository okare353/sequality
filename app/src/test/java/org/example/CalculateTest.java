package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testAverage() {
    Calculate calculate = new Calculate();
    double expected = 2.5;
    assertEquals(expected, calculate.average(calculate.sum(2, 3), 2), 0.01);
  }

  @Test
  public void testSumRange() {
    Calculate calculate = new Calculate();
    int expected = 55;
    assertEquals(expected, calculate.sumRange(1, 10));
  }

  @Test
  public void testSumEven() {
    Calculate calculate = new Calculate();
    int expected = 30;
    assertEquals(expected, calculate.sumEven(1, 10));
  }

  @Test
  public void testSumOdd() {
    Calculate calculate = new Calculate();
    int expected = 25;
    assertEquals(expected, calculate.sumOdd(1, 10));
  }
}
