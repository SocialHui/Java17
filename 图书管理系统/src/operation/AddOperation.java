package operation;

import book.BookList;

//添加书籍
public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("添加书籍");
    }
}
