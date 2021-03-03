package pro.edu;
/*
  @author   george
  @project   vsemHw
  @class  Palindrom
  @version  1.0.0 
  @since 03.03.2021 - 18.34
*/

import java.util.Locale;

public class Palindrom {

    public static void main(String[] args) {
        System.out.println("Hello palindrom");

        int a = 2;
        int b = 3;
        System.out.println(a + b);
        double c = 6;
        System.out.println(c + a);
        char d ='5';
        char e ='9';
        System.out.println('5' + '9');
        String f = "5";
        String g = "9";
        System.out.println( a + f);

        int h = 115;
/*
        char i = (char) h;
        System.out.println(i);
*/

        int j = 3482;
        String str = String.valueOf(j);
        System.out.println(str);
        System.out.println(str.length());
        String str2 = "0065";
        int k = Integer.valueOf(str2);
        System.out.println(k);
        // + - * /
        System.out.println(31/2);
        System.out.println(16 % 10);

        a = 5;
        b = 2;
        System.out.println( ((double) a) / 2   );

        System.out.println(    (3 > 2) || (a == 5 )       )     ;

        a = a + 2;  // increment
    //    System.out.println(a);
        a = a + 1;
        a++;
        a+=1;
        ++a;

        String word2 = "abcdca";
        String word3 = "abcddcba";
        String word4 = "bcdcba";
        //  поп  потоп  шалаш топот

 /*       boolean result = true;
        int length = word1.length();
        for (int i = 0; i < word1.length(); i++) {
           if (  word1.charAt(i) != word1.charAt(length - 1 -i)      ) {
               result = false;
               break;
           }
        }
        System.out.println(result);
        */
        // 2nd way
        String word1 = "А в Енисее – синева";
        word1 = word1.toLowerCase();
        word1 = word1.replaceAll(" ","");
        word1 = word1.replaceAll("!","");
        word1 = word1.replaceAll(",","");
        word1 = word1.replaceAll("\\.","");
        word1 = word1.replaceAll("–","");
        StringBuilder builder = new StringBuilder(word1);
        String reversed = builder.reverse().toString();
        System.out.println(reversed);

        if (word1.equals(reversed)) {
            System.out.println( word1 + " - palindrom ");
        }else{
            System.out.println(" No");
        }


    }

}
