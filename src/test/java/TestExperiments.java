import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Should pass the method parameters provided by the test-data-data.csv file")
public class TestExperiments {
    @DisplayName("Should calculate the correct sum on all lines")
    @ParameterizedTest(name = "{index} => a={0}, b={1}, sum={2}")
    @CsvFileSource(resources = "test-data",numLinesToSkip = 1-2)
    void sumAll(int a, int b, int sum) {
        assertEquals(sum, a + b);
    }
    @DisplayName("Should calculate the correct sum on secondo")
    @ParameterizedTest(name = "{index} => a={0}, b={1}, sum={2}")
    @CsvFileSource(resources = "test-data")
    void sumarraysShouldSumOnlyFirstElements(String a, String b, int c)
    {
        int []ar=Arrays.stream(a.substring(1, a.length()-1).split(","))
                .map(String::trim).mapToInt(Integer::parseInt).toArray();
        int []br=Arrays.stream(b.substring(1, b.length()-1).split(","))
                .map(String::trim).mapToInt(Integer::parseInt).toArray();
        assertEquals(ar[0]+br[0],3);
    }    @Test

    void mathtest() {
        Math.round(1 / 2);
        Math.ceil(1 / 2);
        BigDecimal rawValue = new BigDecimal(1.5);

    }
}
