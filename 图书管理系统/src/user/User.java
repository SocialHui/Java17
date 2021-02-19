package user;

import operation.IOperation;

//用户
abstract public class User {

    public String name;
    public IOperation operation[];

    public User(String name) {
        this.name = name;
    }

    abstract public int menu();

}
