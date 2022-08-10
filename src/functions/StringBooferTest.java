package functions;

import java.util.Date;

public class StringBooferTest {
    public static void main(String[] args) {

        String s = "Hello";
        String s1 = s.replace('e', 'q');

        System.out.println(s1);

        StringBuilder stringBuilder = new StringBuilder(s);
        //StringBuffer stringBuffer = new StringBuffer();

        stringBuilder.append(" World ");
        stringBuilder.append(new Date());

        System.out.println(stringBuilder);

        stringBuilder.insert(0, '$');
        System.out.println(stringBuilder);

        stringBuilder.append(999).delete(1, 6);
        System.out.println(stringBuilder);

//        stringBuilder.reverse();
//        System.out.println(stringBuilder);

        int x = stringBuilder.lastIndexOf("N");
        System.out.println(x);

        String str1 = "Vasya";
        String str2 = new String("Vasya");
        String str3 = "Vasya";

        System.out.println(str1 == str3);

        String str4 = str1.substring(1);
        System.out.println(str4);

        String str5 = str1.substring(1, 3);
        System.out.println(str5);







    }

}
