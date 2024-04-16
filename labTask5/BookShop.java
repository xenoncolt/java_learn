public class BookShop {
    String name;
    TextBook textBook[] = new TextBook[100];
    StoryBook storyBook[] = new StoryBook[100];

    public BookShop() {

    }

    public BookShop(String name) {
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean insertTextBook(TextBook tb) {
        for (int i = 0; i < storyBook.length; i++) {
            if (textBook[i] == null) {
                textBook[i] = tb;
                return true;
            }
        }
        return false;
    }

    public boolean removeTextBook(TextBook tb) {
        for (int i = 0; i < storyBook.length; i++) {
            if (textBook[i] == tb) {
                textBook[i] = null;
                return true;
            }
        }
        return false;
    }

    public TextBook searchTextBook(String isbn) {
        for (int i = 0; i < storyBook.length; i++) {
            if (textBook[i].getIsbn().equals(isbn)) {
                return textBook[i];
            }
        }
        return null;
    }

    public void showAllTextBooks() {
        for (int i = 0; i < storyBook.length; i++) {
            if (textBook[i] != null) {
                System.out.println("Text Book ISBN: " + textBook[i].getIsbn());
                System.out.println("Text Book Title: " + textBook[i].getBookTitle());
                System.out.println("Text Book Author: " + textBook[i].getAuthorName());
                System.out.println("Text Book Price: " + textBook[i].getPrice());
                System.out.println("Text Book Quantity: " + textBook[i].getAvailableQuantity());
                System.out.println("Text Book Standard: " + textBook[i].getStandard());
            }
        }
    }

    public boolean insertStoryBook(StoryBook sb) {
        for (int i = 0; i < storyBook.length; i++) {
            if (storyBook[i] == null) {
                storyBook[i] = sb;
                return true;
            }
        }
        return false;
    }

    public boolean removeStoryBook(StoryBook sb) {
        for (int i = 0; i < storyBook.length; i++) {
            if (storyBook[i] == sb) {
                storyBook[i] = null;
                return true;
            }
        }
        return false;
    }

    public StoryBook searchStoryBook(String isbn) {
        for (int i = 0; i < storyBook.length; i++) {
            if (storyBook[i].getIsbn().equals(isbn)) {
                return storyBook[i];
            }
        }
        return null;
    }

    public void showAllStoryBooks() {
        for (int i = 0; i < storyBook.length; i++) {
            if (storyBook[i] != null) {
                System.out.println("Story Book ISBN: " + storyBook[i].getIsbn());
                System.out.println("Story Book Title: " + storyBook[i].getBookTitle());
                System.out.println("Story Book Author: " + storyBook[i].getAuthorName());
                System.out.println("Story Book Price: " + storyBook[i].getPrice());
                System.out.println("Story Book Quantity: " + storyBook[i].getAvailableQuantity());
                System.out.println("Story Book Category: " + storyBook[i].getCategory());
            }
        }
    }
}
