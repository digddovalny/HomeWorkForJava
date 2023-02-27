package DZ3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        GenerateList();
    }

    private static void GenerateList() {
        ArrayList<Integer> genList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int value = random.nextInt(1,101);
            genList.add(value);
        }

        System.out.println(genList);

        int max = Collections.max(genList);
        int min = Collections.min(genList);

        int sumList = 0;
        float averageList = 0;

        for (int item : genList){
            sumList += item;
        }

        averageList = (float)sumList/genList.size();

        System.out.printf("максимальный элемент %s\n", max);
        System.out.printf("минимальный элемент %s\n", min);
        System.out.printf("среденее арифметическое %s\n", averageList);
    }
}