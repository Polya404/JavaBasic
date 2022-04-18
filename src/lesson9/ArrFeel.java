package lesson9;

import java.util.Scanner;

public class ArrFeel {
    private static final String[] feel = new String[]{"anger", "awe", "joy", "love", "grief"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(words(line));
    }

    static int[] getFreqMap(String word) {
        int[] freq = new int[26]; // массив всех английских букв

        // заполняем массив в соответствии с порядком букв алфавита
        for (char c : word.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                freq[c - 'a']++;
            }
        }
        return freq;
    }

    static int words(String line) {
        int[] inputFreq = getFreqMap(line); // получаем массив частоты букв введеной строки
        int count = 0;
        for (String word : feel) {
            int[] wordFreq = getFreqMap(word); //массив частоты букв слов из массива feel
            boolean ok = true;

            // сравниваем два массива по частоте букв
            for (int i = 0; ok && i < inputFreq.length; i++) {
                if (wordFreq[i] > inputFreq[i]) {
                    ok = false; // если не совпадают возвращаем false и не заходим в цикл
                }
            }
            if (ok) {
                count++;
            }
        }
        return count;
    }
}
