package operation;

import book.BookList;

//退出
public class ExitOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统");
    }
}
