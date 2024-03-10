import ab.exExExtendsAbstract;
import custom.out.*;
import custom.take.input;
import secret.key;

public class index {
    int num;
    String dog;

    public index(int text, String name) {
        num = text;
        dog = name;
    }
    public static void main(String[] args) {
        index newObj = new index(6, "kutta");
        // index anotherObj = new index();
        // output outputObj = new output();

        int sum = newObj.num + newObj.num;
        output.bolo(sum + " " + newObj.dog);



        // Abstract Class | Method
        
        exExExtendsAbstract abstracting = new exExExtendsAbstract();

        abstracting.abName();
        abstracting.abUni();
        output.bolo(abstracting.abNum);
        output.bolo(abstracting.multiple(4, 4));



        // Encapsulation

        key newKey = new key();

        newKey.setToken("YAU682DA26@HAH34");
        newKey.setNum(abstracting.multiple(3, 8));

        output.bolo(newKey.getToken() + "\n" + newKey.getNum());

        String value = input.textInput();
        output.bolo(value);
    }
}