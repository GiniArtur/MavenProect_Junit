package org.example;

import static org.junit.jupiter.api.Assertions.*;  // Импортируем все АССЕРТЫ


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private App app = new App();

//    @BeforeEach       //!!! - Эта аннотация для Выполнения в первую очередь перед началом выполнения тестовых методов
//    public void setUp() {
//        app = new App();
//    }

    @Test
    @DisplayName("Test sum a and b")  // Имя для этого теста
    public void testSum() {
        assertEquals(5, app.sum(2, 3));    // ставим *5* - такой результат должен появится, а в метод app.sum (два числа *2* и *3*)
    }

    @Test
    @DisplayName("Test difference a and b")  // Имя для этого теста
    public void testDifference() {
        assertEquals(10, App.difference(20, 10));
    }

}