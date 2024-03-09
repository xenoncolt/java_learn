public class Start {
    public static void main(String[] args) {
        StoryBook stBook1 = new StoryBook("23-51-2133-23", "The Hobbit", "J.R.R Tolkien", 36.87, 2, "Fantasy");
        StoryBook stBook2 = new StoryBook("55-213-41-21-32", "Marry My Husband", "Xenon Colt", 49.99, 40, "Romantic");

        stBook1.showDetails();
        stBook2.showDetails();

        System.out.println("Add 3 more \"" + stBook1.getBookTitle() + "\" books.");
        stBook1.addQuantity(3);
        System.out.println("--------------------------------------------");
        System.out.println("Sold 5 \"" + stBook2.getBookTitle() + "\" books.");
        stBook2.sellQuantity(5);
        System.out.println("--------------------------------------------");

        stBook1.showDetails();
        stBook2.showDetails();

        System.out.println("25% off now for Story Books");
        StoryBook.setDiscountRate(25);
        System.out.println("--------------------------------------------");

        stBook1.showDetails();
        stBook2.showDetails();

        TextBook txtBook1 = new TextBook("973-541-02-231", "The Rust Programming Language", "Steve Klabnik", 29.99, 10, 10);
        TextBook txtBook2 = new TextBook("541-233-12-441", "Physics for Engineers", "Jane Smith", 44.99, 30, 12);

        txtBook1.showDetails();
        txtBook2.showDetails();

        System.out.println("Add 40 more \"" + txtBook1.getBookTitle() + "\" books.");
        txtBook1.addQuantity(40);
        System.out.println("--------------------------------------------");
        System.out.println("Sold 23 \"" + txtBook2.getBookTitle() + "\" books.");
        txtBook2.sellQuantity(23);
        System.out.println("--------------------------------------------");

        txtBook1.showDetails();
        txtBook2.showDetails();

        System.out.println("15% off now on Text Books");
        System.out.println("--------------------------------------------");
        TextBook.setDiscountRate(15);

        txtBook1.showDetails();
        txtBook2.showDetails();
    }
}
