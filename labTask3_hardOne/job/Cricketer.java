package job;
import sys.output;

public class Cricketer extends Player {
    private int matchPlayed;
    private int totalRun;
    private int totalWicket;

    public Cricketer() {

    }

    Cricketer(int id, String name, double salary, int matchPlayed, int totalRun, int totalWicket) {
        super(id, name, salary);
        setMatchPlayed(matchPlayed);
        setTotalRun(totalRun);
        setTotalWicket(totalWicket);
    }

    public void setMatchPlayed(int matchPlayed) {
        this.matchPlayed = (matchPlayed > 0) ? matchPlayed : -matchPlayed;
    }

    public void setTotalRun(int totalRun) {
        this.totalRun = (totalRun > 0) ? totalRun : -totalRun;
    }

    public void setTotalWicket(int totalWicket) {
        this.totalWicket = (totalWicket > 0) ? totalWicket : -totalWicket;
    }

    double avgRun() {
        double avg_run = (double) totalRun / (double) matchPlayed ;
        return avg_run; 
    }

    double avgWicket() {
        return (double) totalWicket / (double) matchPlayed;
    }

    double annualSalary() {
        return super.getSalary() * 12;
    }
    
    public void showInfo() {
        output.bolo("-------Player Information------");
        output.bolo("Player ID: " + super.getId());
        output.bolo("Player Name: " + super.getName());
        output.bolo("Player Salary: " + super.getSalary());

        output.bolo("Total Match Played: " + matchPlayed);
        output.bolo("Total run: " + totalRun);
        output.bolo("Total Wicked: " + totalWicket);

        output.bolo("Average Run: " + avgRun());
        output.bolo("Average Wicked: " + avgWicket());
        output.bolo("Annual Salary: " + annualSalary());
    }
}
