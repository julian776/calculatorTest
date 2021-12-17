package co.com.sofka.app;

import org.junit.jupiter.Test;

public class BasicCalculatorTest {
    private final BasicCalculator calculator = new BasicCalculator();

    @Test
    private void sum(){
        //Arrange
        Long number1 = 5L;
        Long number2 = 2L;

        //Act
        Long resultSum = calculator.sum(number1, number2);

        //Assert
        assertEquals(2.5, resultSum);
    }
}