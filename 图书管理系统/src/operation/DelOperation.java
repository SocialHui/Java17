package operation;

import book.BookList;

//删除书籍
public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除书籍");
    }
}
