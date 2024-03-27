public class tracing2 {

        public static int a = 5;
        public String msg;
    
        public tracing2() {
            a = a + 5;
            System.out.println("programming is exciting!");
        }
    
        public tracing2(String msg) {
            System.out.println("Understanding is the key");
            this.msg = msg;
            a = 10;
        }
    
        public void cut(int start, int end) {
    
            System.out.println(msg.substring(start, end));
            this.a = 7;
    
        }
    
        static {
    
            System.out.println("Greetings!");
        }
    
        public void findings(String s) {
            System.out.println(s.indexOf('e'));
            System.out.println(s.charAt(5));
            a = a + 15;
        }
    
        public static void main(String[] args) {
    
            tracing2 person1 = new tracing2("Learning is essential!");
            tracing2 person2 = new tracing2();
            tracing2[] peopleArray = new tracing2[] { person1, person2 };
            person1.cut(3, 8);
            peopleArray[1].findings("Be honest!");
            System.out.println(person1.a);
            System.out.println(person2.a);
            System.out.println(peopleArray[0].msg);
            for (int i = 0; i < 1; i++) {
                peopleArray[0] = new tracing2();
            }
    
        }
    
}



