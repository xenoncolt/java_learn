public class Player {
    private int id;
    private String name;
    private double salary;

    Player() {

    }

    Player(int id, String name, double salary) {
        setId(id);
        setName(name);
        setSalary(salary);
    }

    public void setId (int id) {
        this.id = (id > 0) ? id : -id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = (salary > 0) ? salary : -salary;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    double getSalary() {
        return salary;
    }

    void showInfo() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }
}
