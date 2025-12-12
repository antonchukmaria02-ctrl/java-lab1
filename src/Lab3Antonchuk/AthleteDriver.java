package Lab3Antonchuk;

import java.io.IOException;

/**
 * Клас {@code HumanDriver} демонструє використання класу {@code Human}.
 */
public class AthleteDriver {
    /**
     * Головний метод, що виконує демонстрацію функціоналу класу {@code Human}.
     *
     * @param args аргументи командного рядка (не використовуються).
     */
    public static void main(String[] args) {
        try {
            Athlete athlete = new Athlete(
                    new Name("Володимир", "Кличко"),
                    new Address("Київ", "Спортивна", "1"),
                    new Passport("BB123456", 2020, 1976),
                    "Бокс",
                    "Team Klitschko"
            );

            athlete.train();
            athlete.compete();
            athlete.addMedal();
            System.out.println("Тип спорту: " + athlete.getSportType());
            System.out.println("Професія: " + athlete.getOccupation());
            System.out.println(athlete.getInfo());
            System.out.println("Спеціалізація: " + athlete.getSpecialization());
            System.out.println("Кількість медалей: " + athlete.getMedalsCount());
        }catch (IOException e){
            // Обробка помилок, що виникають під час запису в файл.
            throw new RuntimeException("Сталася помилка при записі в файл: " + e.getMessage());
        }
    }
}


