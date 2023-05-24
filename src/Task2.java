//.Пусть дан список сотрудников:
//Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        //считываем из файла
        File file = new File("test.txt");
        Scanner scann = new Scanner(file);
        //складываем данные в список
        List<String> listOfStrings = new ArrayList<>();
        String str;
        while (scann.hasNextLine()) {
            str = scann.next();
            listOfStrings.add(str);
        }
        //находим повторения
        Map<String, Integer> repetitions = new HashMap<>();
        for (int i = 0; i < listOfStrings.size(); i++) {
            int count = 1;
            for (int j = i + 1; j < listOfStrings.size(); j++) {
                if (listOfStrings.get(i).equals(listOfStrings.get(j))) count += 1;
            }
            if (!repetitions.containsKey(listOfStrings.get(i))) repetitions.put(listOfStrings.get(i), count);
        }
        for (var item : repetitions.entrySet()) {
            if (item.getValue() > 1) {
                System.out.printf("%s: %d \n", item.getKey(), item.getValue());
            }
        }
    }
}

