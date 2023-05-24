//. Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
// что 1 человек может иметь несколько телефонов.
//Добавить функции 1) Добавление номера
//2) Вывод всего

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("введите фамилию абонента:   ");
        String surname = scan.next();
        System.out.print("введите номер абонента:   ");
        long phoneNumber = scan.nextLong();
        System.out.println("введите: 1 - добавление номера,  2 - вывод данных.");
        int action = scan.nextInt();

        Map<String, Long> data = new HashMap<>();
        data.put(surname, phoneNumber);

        if (action == 2) System.out.println(surname +" :"+ data.get(surname) );
        if(action == 1) {
            System.out.print("введите следующий номер абонента:   ");
            long numNext = scan.nextLong();
            if (numNext == phoneNumber) {
                System.out.println("вы ввели существующий номер!");
            }
            if(numNext != phoneNumber){
                System.out.println(surname + " : " + data.get(surname) + " , " + numNext);
            }
        }
    }
}

