package contact;

import java.util.Scanner;

/**
 * Created by guodont on 15/12/17.
 */
public class ScannerTest {
    public static void main(String [] args) {
        // Scanner 定界符的使用
        String input = "1 , 2 , red , blue ,new";
        Scanner s = new Scanner(input).useDelimiter("\\s*,\\s*");
//        System.out.println(s.nextInt());
//        System.out.println(s.nextInt());
        System.out.println(s.next());
        System.out.println(s.next());
        s.close();
    }

}
