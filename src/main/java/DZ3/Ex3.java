package DZ3;

import java.util.*;


// Написать прогрумму, которая подсчитывает кол-во планет в коллекции
// Удалить повторяющиеся элементы
public class Ex3 {
    public static void main(String[] args) {
        List<String> planets = new ArrayList<>();
        HashMap<String, Integer> planetCount = new HashMap<>();
        Random random = new Random();

        String[] solarSystemPlanets = {"Mercury","Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        for (int i = 0; i < 10; i++) {
            int randIndex = random.nextInt(solarSystemPlanets.length);
            planets.add(solarSystemPlanets[randIndex]);
        }
        System.out.println(planets);

//        for (String planet : planets) {
//            System.out.printf("%s\t%s", planet, Collections.frequency(planets, planet));
//        }

        for (String planet : planets){
            if (planetCount.containsKey((planet))){
                planetCount.put(planet, planetCount.get(planet)+1);
            } else {
                planetCount.put(planet, 1);
            }
        }

        for (String planet : planetCount.keySet()){
            System.out.printf("%s\t%s\n",planet, planetCount.get(planet));
        }

        //Удаление дубликатов
        List<String> WithOutDuplicatePlanets = new ArrayList<>(new HashSet<>(planets));
        System.out.println(WithOutDuplicatePlanets);
    }
}
