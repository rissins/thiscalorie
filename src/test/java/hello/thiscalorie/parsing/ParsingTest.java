package hello.thiscalorie.parsing;

import hello.thiscalorie.service.FoodApiParsing;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ParsingTest {

    @Test
    @DisplayName("api_파싱_테스트")
    void checkParsing(){
        FoodApiParsing foodApiParsing = new FoodApiParsing();
        foodApiParsing.FoodApiParsing1();
        System.out.println("foodApiParsing.FoodApiParsing1() = " + foodApiParsing.FoodApiParsing1());
    }
}
