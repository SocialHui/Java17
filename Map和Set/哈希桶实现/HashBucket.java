public class HashBucket {
    public class Node{
        private int key;
        private int value;
        private Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public Node() {

        }
    }

    private static final double LOAD_FACTOR = 0.75;
    private Node[] array;
    private int size;

    public int put(int key,int value) {
        int index = key%array.length;
        /*if (array[index] != null) {
            array[index] = new Node(key,value);
            return
        }*/
        //判断这个key是否存在，如果存在，则更新value的值并返回之前的value的值
        for (Node cur = array[index]; cur != null; cur = cur.next) {
            if (key == cur.key) {
                int oldValue = cur.value;
                cur.value = value;
                return oldValue;
            }
        }
        //头插法将数据存在表中
        Node node = new Node(key,value);
        node.next = array[index];
        array[index] = node;
        this.size++;

        if (loadFactor() >= LOAD_FACTOR) {
            resize();
        }

        return -1;
    }

    private double loadFactor() {
        return this.size*1.0/array.length;
    }

    //扩容
    private void resize() {
        Node[] newArray = new Node[array.length*2];
        for (int i = 0; i < array.length; i++) {
            Node next;
            for (Node cur = array[i]; cur!= null; cur = next) {
                next = cur.next;
                int index = cur.key%newArray.length;
                cur.next = newArray[index];
                newArray[index] = cur;
            }
        }
        array = newArray;
    }

    public HashBucket() {
        this.array = new Node[8];
        this.size = 0;
    }

    //查找
    public int get(int key) {
        int index = key%array.length;
        Node cur = array[index];
        while (cur != null) {
            if (cur.key == key) {
                return cur.value;
            }
        }
        return -1;
    }
}
