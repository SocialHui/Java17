/*
//正常的方法
public class TestDemo {
    public static void login (String userName, String password) {
        if (!TestDemo.userName.equals(userName)) {
            //处理用户名错误
        }
        if (!TestDemo.password.equals(password)) {
            //处理密码错误
        }
        System.out.println("登录成功");
    }

    private static String userName = "ShengHui";
    private static String password = "123456";

    public static void main(String[] args) {
        login ("ShengHui","123456");
    }

}*/

/*
public class TestDemo {
    private static String userName = "ShengHui";
    private static String password = "123456";

    class UserException extends Exception {
        public UserException (String message) {
            super(message);
        }
    }

    class passwordException extends Exception {
        public passwordException (String message) {
            super(message);
        }
    }

    public static void login (String userName, String password) throws UserException ,passwordException{
        if (!TestDemo.userName.equals(userName)) {
            throw new UserException("用户名错误");
        }
        if (!password.equals(password)) {
            throw new passwordException("密码错误");
        }
        System.out.println("登陆成功");
    }

    public static void main(String[] args) {
        try {
            login ("ShengHui","123456");
        } catch (UserException e) {
            e.printStackTrace();
        } catch (passwordException n) {
            n.printStackTrace();
        }

    }
}*/


public class TestDemo {

    private static String userName = "shenghui";
    private static String passWard = "123456";

    class userNameException extends Exception {
        public userNameException (String message) {
            super(message);
        }
    }

    class passWardException extends Exception {
        public passWardException (String message) {
            super(message);
        }
    }

    public static void main(String[] args) throws userNameException,passWardException{
        if (!userName.equals(userName)) {
            try {
                throw new userNameException ("用户名错误");
            } catch (userNameException e) {
                e.printStackTrace();
            }

        }
        if (!passWard.equals(passWard)) {
            try {
                throw new passWardException ("密码错误");
            } catch (passWardException n) {
                n.printStackTrace();
            }

        }
        System.out.println("登陆成功");
    }
}
