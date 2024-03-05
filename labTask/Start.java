public class Start {
    public static void main(String[] args) {
        Teacher person1 = new Teacher("Xenon Colt", 20000);
        Teacher person2 = new Teacher();

        person2.setName("Abir Al Hassan");
        person2.setSalary(-2000.13);

        
        person1.display();
        person2.display();


        System.out.println(person1.getName());
        System.out.println(person2.getSalary());
    }
}
