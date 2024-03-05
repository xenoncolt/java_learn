package custom.take;

import java.util.Scanner;

public class input {

    public static int intInput() {
        Scanner num = new Scanner(System.in);
        int value = num.nextInt();
        num.close();
        return value;
    }

    public static String textInput() {
        Scanner text = new Scanner(System.in);
        String value = text.nextLine();
        text.close();
        return value;
    }
}
