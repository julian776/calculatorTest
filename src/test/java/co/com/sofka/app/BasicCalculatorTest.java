package co.com.sofka.app;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BasicCalculatorTest {

    private final BasicCalculator calculator = new BasicCalculator();

    @Test
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    private void sum(Long first, Long second, Long result){
        Long resultSum = calculator.sum(first, second);

        //Assert
        assertEquals(resultSum, result, () -> first + "+" + second + " should equal to " + result);
    }

    @Test
    @CsvSource({
            "6, 4, 2",
            "15, 5, 10",
            "200, 80, 120",
            "3, 1 , 2"
    })
    private void minus(Long first, Long second, Long result){
        Long resultMinus = calculator.minus(first, second);

        assertEquals(resultMinus, result, () -> first +"-"+ second + " should equal to " + result);
    }

    @Test
    @CsvSource({
            "4, 5, 20",
            "50, 2, 100",
            "3, 9, 27",
            "8, 4, 32"
    })
    private void multiply(Long first, Long second, Long result){
        Long resultMultiply = calculator.multiply(first, second);

        assertEquals(resultMultiply, result, () -> first +"*"+ second + " should equal to " + result);
    }

    @Test
    @CsvSource({
            "12, 4, 3",
            "15, 5, 3",
            "70, 10, 7",
            "36, 6, 6"
    })
    private void division(Long first, Long second, Long result){
        Long resultDivision = calculator.division(first, second);

        assertEquals(resultDivision, result, () -> first +"-"+ second + " should equal to " + result);
    }
}