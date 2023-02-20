package DZ4;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

//Реализовать консольное приложение, которое:
//Принимает от пользователя и “запоминает” строки.
//Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//Если введено revert, удаляет предыдущую введенную строку из памяти.
public class Ex1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        while (true) {
            String text = inputText();
            if (text.equalsIgnoreCase("print")){
                for (String s : arrayDeque){
                    System.out.println(s);
                }
            } else if (text.equalsIgnoreCase("revert")) {
                arrayDeque.removeFirst();
            } else if (text.equalsIgnoreCase("stop")) {
                break;
            } else {
                arrayDeque.addFirst(text);
            }
        }
    }

    private static String inputText() {
        String text = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите запрос: ");
        try {
            text = scanner.nextLine();
        } catch (Exception e ){
            e.printStackTrace();
        }
        return text;
    }
}
