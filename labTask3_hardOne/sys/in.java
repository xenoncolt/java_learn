package sys;
import java.util.Scanner;
public class in {
    private static Scanner usr_input = new Scanner(System.in);
    private static Scanner usr_input_string = new Scanner(System.in);
    
    public static int getInt() {

        int num = usr_input.nextInt();

        return num; 
    }
    public static double getDouble() {

        double num = usr_input.nextDouble();

        return num;
    }

    public static String getString() {

        String text = usr_input_string.nextLine();

        return text;
    }

    
        
}
