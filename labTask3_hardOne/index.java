import job.Cricketer;
import sys.in;
import sys.output;

public class index {
    public static void main(String[] args) {
        Cricketer player1 = new Cricketer();

        output.bolo("Write your ID: ");
        player1.setId(in.getInt());

        output.bolo("Write your Name: ");
        player1.setName(in.getString());

        output.bolo("Write your salary: ");
        player1.setSalary(in.getDouble());

        output.bolo("How many match you played?");
        player1.setMatchPlayed(in.getInt());

        output.bolo("What is your total run?");
        player1.setTotalRun(in.getInt());

        output.bolo("How many wicket you got?");
        player1.setTotalWicket(in.getInt());

        player1.showInfo();
    }
}