package sem_3;

import java.util.ArrayList;
import java.util.List;

public class task_4 {
    public static void main(String[] args) {
        ex0();
    }

    static void ex0() {
        /*
        Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
        Вывести название каждой планеты и количество его повторений в списке.
        */
        List<String> planets = List.of("Марс", "Венера", "Земля", "Юпитер", "Уран",
                "Нептун", "Плутон", "Меркурий", "Сатурн");
        List<String> listPlanets = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            listPlanets.add(planets.get((int) (Math.random() * planets.size())));
        }
        System.out.println(listPlanets);
        for (String planet : planets) {
            int count = 0;
            for (String item : listPlanets) {
                if (planet.equals(item)) {
                    count++;
                }
            }
            System.out.println(planet + ": " + count);
        }
    }
}
