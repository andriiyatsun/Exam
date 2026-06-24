package ua.edu.ukma;

import jdk.jfr.Name;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {

    private final Service service = new Service();

    @Test
    @DisplayName("Проходить: - валідний рядок")
    void testIsValidInputWithValidString() {
        assertTrue(service.isValidInput("System Architecture"), "Сервіс має приймати валідні рядки");
    }

    @Test
    @DisplayName("Не Проходить: - порожній рядок")
    void testIsValidInputWithEmptyString() {
        assertFalse(service.isValidInput(""), "Сервіс має відхиляти порожні рядки");
    }

    @Test
    @DisplayName("Не Проходить: - рядок складається лише з пробілів")
    void testIsValidInputWithBlankString() {
        assertFalse(service.isValidInput("   "), "Сервіс має відхиляти рядки лише з пробілами");
    }


    @Test
    @DisplayName("Не Проходить: - об'єкт рядка null")
    void testIsValidInputWithNull() {
        assertFalse(service.isValidInput(null), "Сервіс має коректно обробляти null без викидання винятків");
    }
}
