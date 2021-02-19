package operation;

import book.BookList;

//查找书籍
public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("查找书籍");
    }
}
