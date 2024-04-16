public class Start {
    public static void main(String[] args) {
        BookShop bs = new BookShop();
        StoryBook sb1 = new StoryBook("1234", "The Alchemist", "Xenon Colt", 500, 10, "Adventure");
        StoryBook sb2 = new StoryBook("5678", "12 Love", "Xenon Colt", 700, 5, "Mystery");
        TextBook tb1 = new TextBook("4321", "Math", "John Wick", 300, 20, 5);
        TextBook tb2 = new TextBook("8765", "Science", "John Wick", 400, 15, 6);
        bs.insertStoryBook(sb1);
        bs.insertStoryBook(sb2);
        bs.insertTextBook(tb1);
        bs.insertTextBook(tb2);
        bs.showAllStoryBooks();
        bs.showAllTextBooks();
        System.out.println(bs.searchStoryBook("1234").getBookTitle());
        System.out.println(bs.searchTextBook("4321").getBookTitle());
        bs.removeStoryBook(sb1);
        bs.removeTextBook(tb1);
        bs.showAllStoryBooks();
        bs.showAllTextBooks();
    }
}
