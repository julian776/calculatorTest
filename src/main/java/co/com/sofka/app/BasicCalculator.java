package co.com.sofka.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator{
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    public Long minus(Long number1, Long number2){
        logger.info( "Minus {} - {}", number1, number2 );
        return number1 - number2;
    }

    public Long multiply(Long number1, Long number2){
        logger.info("Multiply {} * {}", number1, number2);
        return number1 * number2;
    }

    public Long division(Long number1, Long number2){
        logger.info("Division {} / {}",number1, number2);
        Long divResult;
        try {
            divResult = number1/number2;
        }catch (Exception e){
            throw new RuntimeException("Not possible division by 0");
        }
        return divResult;
    }
}