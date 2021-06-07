package date0607;

public class BookAction {
    private Book[] books;

    public Book[] getBooks(){
        return books;
    }

    public void initBooks(int length){
        books = new Book[length];
        for (int i = 0; i < length; i++){
            books[i] = new Book();
        }
    }

    public void replenishBooks(int index, int count){
        books[index].repertory += count;
    }

    public void saleBooks(int index, int count){
        books[index].repertory -= count;
    }

    public boolean checkRepertory(int index, int count){
        return books[index].repertory >= count;
    }

    public String showBook(int index){
        return "书籍名称:" + books[index].name + "\t书籍价格:" + books[index].price +
                "\t作者:" + books[index].author + "\t库存:" + books[index].repertory;
    }

    public void showBooks(){
        for (int i = 0; i < books.length; i++){
            System.out.println(showBook(i));
        }
    }
}
