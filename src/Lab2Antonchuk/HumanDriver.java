package Lab2Antonchuk;

import java.io.IOException;

/**
 * Клас {@code HumanDriver} демонструє використання класу {@code Human}.
 */
public class HumanDriver {
    /**
     * Головний метод, що виконує демонстрацію функціоналу класу {@code Human}.
     *
     * @param args аргументи командного рядка (не використовуються).
     */
    public static void main(String[] args) {
        try {
            Human person = new Human(
                    new Name("Іван", "Петренко"),
                    new Address("Київ", "Хрещатик", "1"),
                    new Passport("AA123456", 2015, 1990)
            );

            person.changeName(new Name("Костя", "Петренко"));
            person.changeAddress(new Address("Львів", "Степана Бандери", "3"));
            person.updatePassport(new Passport("AA123457", 2025, 1990));
            person.getFullName();
            person.getAge();
            person.isAdult();
            person.getFullAddress();
            person.needToUpdatePassport();
            person.getInfo();
            person.isPensioner();
        }catch (IOException e){
            // Обробка помилок, що виникають під час запису в файл.
            throw new RuntimeException("Сталася помилка при записі в файл: " + e.getMessage());
        }
    }
}

