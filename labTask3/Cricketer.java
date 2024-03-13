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
        System.out.println("-------Player Information------");
        System.out.println("Player ID: " + super.getId());
        System.out.println("Player Name: " + super.getName());
        System.out.println("Player Salary: " + super.getSalary());

        System.out.println("Total Match Played: " + matchPlayed);
        System.out.println("Total run: " + totalRun);
        System.out.println("Total Wicked: " + totalWicket);

        System.out.println("Average Run: " + avgRun());
        System.out.println("Average Wicked: " + avgWicket());
        System.out.println("Annual Salary: " + annualSalary());
    }
}
