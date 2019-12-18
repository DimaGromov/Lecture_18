/*
        Нужно написать программу, которая подсчитывает количество слов (разделённых пробелом) в предложении (в строке).

        После этого выводит статистику.
 */

import java.util.*;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считаем строку из консоли.
        System.out.print("Введите предложение: ");
        //String base_str = scanner.nextLine();
        String base_str = "один два три четыре пять один два шесть";

        List<String> arrayString = new ArrayList<>(Arrays.asList(base_str.trim().split(" ")));




        // Создадим Map для хранения слов.
        Map<String, Integer> word_map = new TreeMap<>();

        for (String str: arrayString) {
            if(!(word_map.containsKey(str))){
                word_map.put(str, 1);
            } else {
                word_map.put(str, word_map.get(str) + 1);
            }
        }


//        // Переменные хранящие индексы начала и конца слова в строке
//        int begin_word = 0;
//        int end_word = 0;
//        for (int i = 0; str.charAt(i) != '0'; i++) {
//            if (str.charAt(i) != '@') {
//                end_word++;
//            } else {
//                String sub_str = str.substring(begin_word, end_word);
//                if (!(word_map.containsKey(sub_str))) {
//                    word_map.put(sub_str, 1);
//                } else {
//                    word_map.put(sub_str, word_map.get(sub_str) + 1);
//                }
//                end_word++;
//                begin_word = end_word;
//            }
//        }

        System.out.println(word_map);


    }
}
