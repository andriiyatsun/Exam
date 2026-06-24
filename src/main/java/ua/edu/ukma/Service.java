package ua.edu.ukma;

// клас для демонстрації CI/CD.
public class Service {

    /**
     * Валідує вхідний рядок.
     * Просто перевіряю си рядок не дорівнює нулю, або пустий.
     *
     * @param input рядок для перевірки
     * @return true, якщо рядок містить символи, відмінні від пробілів
     */
    public boolean isValidInput(String input) {
        return input != null && !input.trim().isEmpty();
    }
}
