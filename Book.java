public class Book
{
    int BKId;
    String BKName;
    String BKAuthor;

    public Book(int BKId, String BKName, String BKAuthor) {
        this.BKId = BKId;
        this.BKName = BKName;
        this.BKAuthor = BKAuthor;
    }
    public void BKUpdateDetails(String name,int id,String author)
    {
        BKId = id;
        BKName = name;
        BKAuthor = author;

    }
    public void BKDisplay()
    {
        System.out.println("Book ID = "+BKId+"\nBook Name ="+BKName+"\nBook Author ="+BKAuthor);
    }
}
