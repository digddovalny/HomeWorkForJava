package DZ4;

import java.util.ArrayDeque;
import java.util.Random;
import java.util.Scanner;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
public class Ex2 {
    public static ArrayDeque<Integer> getReversDeque(int count) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        ArrayDeque<Integer> reverseDeque = new ArrayDeque<>();
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            int rand = random.nextInt(0,101);
            deque.addFirst(rand);
        }
        System.out.println(deque);

        for (int i = 0; i < count; i++) {
            reverseDeque.addFirst(deque.getFirst());
            deque.removeFirst();
        }
        return reverseDeque;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер коллекции: ");
        int count = scanner.nextInt();
        System.out.println(getReversDeque(count));

    }

}
