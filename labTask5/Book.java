public class Book {
    String isbn;
    String bookTitle;
    String authorName;
    double price;
    int availableQuantity;

    public Book() {

    }

    public Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity) {
        setIsbn(isbn);
        setBookTitle(bookTitle);
        setAuthorName(authorName);
        setPrice(price);
        setAvailableQuantity(availableQuantity);
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setPrice(double price) {
        if (price < 0) {
            this.price = -price;
        } else {
            this.price = price;
        }
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
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
        return price;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void addQuantity(int amount) {
        if (amount > 0) {
            availableQuantity += amount;
        }
    }

    public void sellQuantity(int amount) {
        if (amount > 0 && amount <= availableQuantity) {
            availableQuantity -= amount;
        }
    }

    public void showDetails() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author Name: " + authorName);
        System.out.println("Price: " + price);
        System.out.println("Available Quantity: " + availableQuantity);
    }
}