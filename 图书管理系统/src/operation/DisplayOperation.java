package operation;

import book.BookList;

//展示书籍
public class DisplayOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("展示书籍");
    }
}
