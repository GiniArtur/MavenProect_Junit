import org.example.SpliterFormatException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;  // Импортируем все АССЕРТЫ

public class StringCalculatorTest {
    private StringCalculator stringCalculator;

    @BeforeEach
    public void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
    @DisplayName("Test method add")
    public void testAdd() {
        try {
            // kata 1
            assertEquals(0, StringCalculator.add(null));
            assertEquals(0, StringCalculator.add(""));
            assertEquals(0, StringCalculator.add(" "), "Поставлен пробел");
            assertEquals(1, StringCalculator.add("1"));
            assertEquals(3, StringCalculator.add(" 1, 2 "));
            assertEquals(4, StringCalculator.add("4,"));
            // kata 2
            assertEquals(6, StringCalculator.add("1,2,3"));
            assertEquals(4, StringCalculator.add("1,1,1,1"));
            assertEquals(3, StringCalculator.add("1,2"));
            assertEquals(66, StringCalculator.add("11,22,33"));
            // kata 3
            assertEquals(6, StringCalculator.add("1 \n2,3"));
            assertEquals(15, StringCalculator.add("4\n5\n6"));
            assertEquals(77, StringCalculator.add("77\n"));
            // kata 4
            assertEquals(1, StringCalculator.add("1, 1001"));
            assertEquals(2, StringCalculator.add("1002,\n 2"));
            assertEquals(1001, StringCalculator.add("1, 1000"));
            assertEquals(2000, StringCalculator.add("1000, 1000"));
            assertEquals(0, StringCalculator.add("1001\n1001"));
            // kata 5 task *1 -3*
            assertEquals(3, StringCalculator.add("//;\n1; 2"));
            assertEquals(5, StringCalculator.add("//, \n2,3"));
            assertEquals(7, StringCalculator.add("//#\n3# 4"));
            // Kata 6
            /*
            Необходимо сделать, чтобы разделители между числами
            могли бы быть любой длины в следующем формате:
                      "// [разделитель] \n".
             */
           // assertEquals(6, StringCalculator.add( "//[***]\n1 *** 2 *** 3"));


        }
        catch (SpliterFormatException e) {
            throw new RuntimeException(e);
        }
        // kata 5 task *4-5*
        assertThrows(SpliterFormatException.class,()->StringCalculator.add("//1\n1 1 1"));
        assertThrows(SpliterFormatException.class,()->StringCalculator.add("//;\n1#2"));

    }
}
