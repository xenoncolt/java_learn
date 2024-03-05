
public class first{
    private static void bolo(String text) {
        System.out.println(text);
    }

    private static void bolo(int text) {
        System.out.println(text);
    }

    private static void bolo(float text) {
        System.out.println(text);
    }

    private static void bolo(double text) {
        System.out.println(text);
    }

    public static void main(String[] args) {
        bolo("Xenon Colt");
        System.out.print("Hi, \n I guess it will create new line.");
        bolo(2 * 2);

        String name = "Xenon";
        String lastName = "Colt";
        String fullName = name + lastName;
        bolo(fullName);

        float floatNum = 3.55f;
        bolo(floatNum);
        int num = 64;
        num++;
        num += 1;
        num--;

        float cngNum = num;
        char letter = (char) cngNum;
        bolo(letter);
        System.out.println(num < 1);
        int nameSize = name.length();
        bolo(nameSize);
        String capName = name.toUpperCase();
        String smlName = lastName.toLowerCase();


        bolo(capName + " " + smlName);
        bolo(capName.concat(" ").concat(lastName));
        bolo("This is so cool \"Java\" you know.");
        bolo(Math.max(num, nameSize));
        bolo((int)(Math.random() * 101));
        

        int fullNameSize = nameSize + lastName.length(); 
        bolo((fullNameSize <= num) ? "Verified" : "Please write name under 64 word.");

        String[] fewWords = {"Xenon", "Colt", "Haque", "Shahriar"};
        for (String words : fewWords) {
            bolo(words);
        }

        String[][] names = {{"Xenon", "Shahriar", "Fahim"}, {"Colt", "Haque"}};
        bolo(names[0][1]);
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names.length; j++) {
                bolo(names[i][j]);
            }
        }

        bolo(sum(10));

        

    }

    private static int sum(int num) {
        if (num > 0) {
            return num + sum(num - 1); 
        } else {
            return 0;
        }
    }

    double x = 5;
    int y = (int) x;

    Nabeeha manus = new Nabeeha();

    


    
}