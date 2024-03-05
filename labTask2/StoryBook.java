public class StoryBook {
    private String isbn;
    private String bookTitle;
    private String authorName;
    private double price;
    private int availableQuantity;
    private String category;
    private static double discountRate;

    public StoryBook() {

    }

    public StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, String category) {
        setIsbn(isbn);
        setBookTitle(bookTitle);
        setAuthorName(authorName);
        setPrice(price);
        setAvailableQuantity(availableQuantity);
        setCategory(category);
    }

    public static void setDiscountRate(double rate) {
            discountRate = rate > 0 ? rate : -rate;
    }

    public static double getDiscountRate() {
        return discountRate;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setPrice(double price) {
        this.price = price >= 0 ? price : -price;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity >= 0 ? availableQuantity : -availableQuantity;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public double getPrice() {
        price = price - (discountRate * price / 100);
        return price;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public String getCategory() {
        return category;
    }

    public void addQuantity(int amount) {
        availableQuantity += amount > 0 ? amount : -amount;
    }

    public void sellQuantity(int amount) {
        if (availableQuantity >= amount) {
            availableQuantity -= amount > 0 ? amount : -amount;
        } else {
            System.out.println("Insufficient Story book.");
        }
    }

    public void showDetails() {
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Story Book Name: " + getBookTitle());
        System.out.println("Writer Name: " + getAuthorName());
        System.out.println("Genre: " + getCategory());
        System.out.println("Book price: $" + getPrice());
        System.out.println("Available Books: " + getAvailableQuantity());
        System.out.println("--------------------------------------------");
    } 
}
