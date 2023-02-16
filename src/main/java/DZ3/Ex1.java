package DZ3;

import java.util.ArrayList;
import java.util.Random;

//Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)
public class Ex1 {
    public static void main(String[] args) {
        deleteEvenNumber();
    }

    private static void deleteEvenNumber() {
        ArrayList<Integer> resultList = new ArrayList<>();
        Random random = new Random();
        int ListSize = 10;
        for (int i = 0; i < ListSize; i++) {
            resultList.add(random.nextInt(1,11));
        }
        System.out.printf("Сформированный список элементов %s\n",resultList);

        int i = 0;
        while (i < resultList.size()) {
            if (resultList.get(i) % 2 == 0){
                resultList.remove(i);
            }
            else {
                i++;
            }
        }
        System.out.printf("Список с удаленными четными числами %s",resultList);
    }
}
