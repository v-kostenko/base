package functions;

import java.util.Arrays;

public class StringsTest {
    public static void main(String[] args) {
        String s = "Hello !";
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        System.out.println(length("There are 5 cats and 7 dogs"));

        System.out.println(bol("There are  cats and  dogs"));

        printStringWithDigits(new String[]{"There are  cats and  dogs", "There are  ca323ts and3  dogs", "There are 4566788 cats and  dogs"});
        s = ""; // empty string
        s = 12 + s + 4;
        System.out.println(s);

        String result = stringWithoutDigits("NEW There are  ca323ts and3  dogs");
        System.out.println(result);

        System.out.println(digitsQntity(1578));

        System.out.println(doubleDigits(12.302));

        String[] s5 = test(new String[]{"There are 233 cats and  dogs", "There are  ca323ts and3  dogs", "There are 4566788 ca"});
        System.out.println(Arrays.toString(s5));

        System.out.println(separate("ThEEEere are 233 cats and  dogs"));

        String test44 = separate("!@#$%^QWERTYUIqwertyuiasdfghjk!@9");
        System.out.println(test44);

        String replace = replaceLetters("QwERtYuIIo#$%12345678pP123wertyTYUI");
        System.out.println(replace);

        printQuantity("QQQQwERtYuIIooooo#####$%1234pppppppp5678123wertyTYUI");


    }

    //ф-я принимает число типа дабл и возвращает сумму его цифр
    public static int doubleDigits(double x) {
        int sum = 0;
        String s = "" + x;
        char[] chars = s.toCharArray();
        System.out.println(Arrays.toString(chars));

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                sum += chars[i] - 48;
            }
        }
        return sum;
    }

    //ф-я принимает ммассив стрингов и возвращает его же но без цифр
    public static String[] test(String[] strings) {
        for (int i = 0; i < strings.length; i++) {

            char[] chars = strings[i].toCharArray();
            String empty = "";

            for (int j = 0; j < chars.length; j++) {
                if (chars[j] < '0' || chars[j] > '9') {
                    empty = empty + chars[j];
                }
            }
            strings[i] = empty;
        }
        return strings;

    }


    // фуф-я принимает целое число ии возвращает количество в нем цифр
    public static int digitsQntity(int x) {

        return ("" + x).length();
    }


    // ф-я принимает стринг и возвращает стринг но уже без цифр
    public static String stringWithoutDigits(String s) {

        char[] array = s.toCharArray();

        String empty = "";

        for (int i = 0; i < array.length; i++) {
            if (array[i] < '0' || array[i] > '9') {
                empty = empty + array[i];
            }
        }
        return empty;

    }



// ф-я принимает массив стрингов и печатает стринги у кот есть цифры

    public static void printStringWithDigits(String[] x) {

        for (int i = 0; i < x.length; i++) {
            char[] chars = x[i].toCharArray();

            for (int j = 0; j < chars.length; j++) {
                if (chars[j] >= '0' && chars[j] <= '9') {

                    System.out.println(x[i]);
                    break;
                }
            }

        }


    }

    // ф-я принимает сттринг и воззвр  тру если в нем нет цифр
    public static boolean bol(String s5) {
        char[] chars = s5.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                return false;
            }
        }
        return true;
    }


    // ф-я принимает стринг и возвращает колич   цифр в нем
    public static int length(String s) {
        char[] chars = s.toCharArray();

        int z = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9')
                z += 1;
        }
        return z;

    }

    // ф-я принимает стринг и возвращает стринг где сначала гласные, потом согласные, потом цифры
    public static String separate(String s) {

        char[] chars = s.toCharArray(); // {'1', '@', 'i', 1', 'y', 'O', 'E', 'I', 'U', 'Y'};
        String vowel = "";
        String concenent = "";
        String numbers = "";

        char[] dictionary = {'a', 'o', 'e', 'i', 'u', 'y', 'O', 'E', 'I', 'U', 'Y', 'A'};

        for (int i = 0; i < chars.length; i++) {

            if ((chars[i] >= 'a' && chars[i] <= 'z') || (chars[i] >= 'A' && chars[i] <= 'Z')) {

                boolean mark = false;
                for (int k = 0; k < dictionary.length; k++) {
                    if (chars[i] == dictionary[k]) {
                        vowel += chars[i];
                        mark = true;
                        break;
                    }
                }
                if (mark == false) {
                    concenent += chars[i];
                }
            }

            if (chars[i] >= '0' && chars[i] <= '9') {
                numbers += chars[i];
            }

        }

        return vowel + concenent + numbers;


    }

    //ф-я приинимает стринг ии возвращает стриинг где большие буквы заменяются маленькими и наоборот
    public static String replaceLetters(String string) {
        char[] chars = string.toCharArray();
// "Qwwer"   {'Q', 'w', 'w', 'e'}

        String str = ""; // q
        for (int i = 0; i < chars.length; i++) {

            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                str += (char) (chars[i] + 32);
            } else if (chars[i] >= 'a' && chars[i] <= 'z') {
                str += (char) (chars[i] - 32);
            } else {
                str += chars[i];
            }

        }
        return str;


    }

    //ф-я принииммает стринг и печатает количество каждого символа в нем
    public static void printQuantity(String string) {
        char[] chars = string.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            int counter = 0;
            boolean bool = false;

            for (int j = 0; j < i; j++) {
                if (chars[i] == chars[j])
                    bool = true;
            }
            if (bool){
                continue;
            }
            for (int j = i; j < chars.length; j++) {


                if (chars[i] == chars[j]) {
                    counter += 1;

                }

            }
            System.out.println("Quantity " + chars[i] + " = " + counter);


        }

    }


}
