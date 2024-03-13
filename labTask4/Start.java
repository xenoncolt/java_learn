public class Start {
    public static void main(String[] args) {
        Book stBook1 = new Book("23-51590-2", "The Hobbit", "J.R.R Tolkien", 36.87, 2);
        Book stBook2 = new Book("23-51730-2", "Marry My Husband", "Xenon Colt", 49.99, 40);

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

        stBook1.showDetails();
        stBook2.showDetails();
    }
}
