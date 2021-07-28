 public enum TestEnum{
        RED,GREEN,BLACK,WHITE;

        public static void main(String[] args) {
            TestEnum[] testEnums = TestEnum.values();
            for (int i = 0; i < testEnums.length; i++) {
                System.out.println(testEnums[i]+" "+testEnums[i].ordinal());
            }

            System.out.println("======================");
            System.out.println(TestEnum.valueOf("WHITE"));


            TestEnum testEnum = TestEnum.BLACK;
            TestEnum testEnum1 = TestEnum.WHITE;
            System.out.println(testEnum.compareTo(testEnum1));   //compareTo前面的值-后面的值，就是最终的结果
        }
    }