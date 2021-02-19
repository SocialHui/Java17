package operation;

import book.BookList;

//还书
public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("归还书籍");
    }
}
