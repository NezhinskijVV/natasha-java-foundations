package ru.itsjava.core;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@RunWith(JUnitPlatform.class)
@DisplayName("Класс Cat должен:")
public class CatTest {

    public static final String DEFAULT_NAME = "Barsik";
    public static final double DEFAULT_WEIGHT = 10.0;
    public static final double UPDATED_WEIGHT = 20.0;
    private Cat cat;

//    @BeforeEach
    public static void beforeAllTest() {
        Cat cat = new Cat(DEFAULT_NAME, DEFAULT_WEIGHT);
    }

    @Test
    @DisplayName(" корректно создаваться конструктором")
    public void shouldHaveCorrectConstructor() {
        Cat cat = new Cat(DEFAULT_NAME, DEFAULT_WEIGHT);
//        assertEquals(DEFAULT_NAME, cat.getNickname());
//        assertEquals(DEFAULT_WEIGHT, cat.getWeight());
        Assertions.assertAll(() -> assertEquals(DEFAULT_NAME, cat.getNickname()),
                () -> assertEquals(DEFAULT_WEIGHT, cat.getWeight()));
    }

    @Test
    @DisplayName(" корректно изменять поле вес")
    public void shouldHaveCorrectUpdateWeight() {
        Cat cat = new Cat(DEFAULT_NAME, DEFAULT_WEIGHT);
        cat.setWeight(UPDATED_WEIGHT);
        assertEquals(UPDATED_WEIGHT, cat.getWeight());
    }
}