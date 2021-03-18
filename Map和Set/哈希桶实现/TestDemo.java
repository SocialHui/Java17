public class TestDemo {
    public static void main(String[] args) {
        HashBucket hashBucket = new HashBucket();
        hashBucket.put(10,4);
        hashBucket.put(20,5);
        hashBucket.put(40,3);
        hashBucket.put(30,3);
        System.out.println(hashBucket.get(10));
    }
}
