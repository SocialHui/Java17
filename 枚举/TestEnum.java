public enum  TestEnum {

    RED("red",1),BLUE("blue",2),WHITE("white",3);
    private String name;
    private int age;

    //枚举的构造函数默认是私有的！！！
    private TestEnum(String name,int age){
        this.age = age;
        this.name = name;
    }

    public static TestEnum getEnumKey(int key) {
        for (TestEnum t : TestEnum.values()) {
            if (t.age == key) {
                return t;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(getEnumKey(3));
    }

}
