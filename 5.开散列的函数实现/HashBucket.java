public class HashBucket {
    /**
     * 发生哈希冲突的时候的解决方式
     * 开散列，也就是链地址法的实现
     *
     * 当发生哈希冲突的时候，将发生哈希冲突的放在一个桶里面
     * 当负载因子超过0.75的时候，对数组进行扩容
     */

    private class Node {
        private int key;
        private int value;
        Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node[] array;
    private int size;
    public static final double LOAD_FACTOR = 0.75;    //超过这个值就要进行扩容

    public HashBucket() {
        array = new Node[8];   //初始化数组的大小为8
        size = 0;
    }

    //扩容
    private void resize() {
        Node[] newArray = new Node[array.length*2];
        for (int i = 0; i < array.length; i++) {
            for (Node node = array[i]; node != null; node = node.next) {
                int index = node.key % newArray.length;  //在新的数组里面的位置
                Node cur = new Node(node.key,node.value);
                cur.next = newArray[index];
                newArray[index] = cur;
            }
        }
        array = newArray;
    }

    public int put(int key, int value) {
        //插入数据的时候先看数据应该插在那个数组下标里面
        int index = key%array.length;
        //然后遍历这个数组下面的桶，看看里面有没有这个数据，如果有，更新value，如果没有，新建一个节点，然后将节点利用头插法插入数组
        for (Node node = array[index]; node != null; node=node.next) {
            if (node.key == key) {
                //代表桶里面有这个数据，不需要新建一个节点，直接更新value数据就可以了
                int oldValue = node.value;
                node.value = value;
                return oldValue;
            }
        }
        //到这里还没有返回代表桶里面没有这个数据，新建节点，头插
        Node node = new Node(key,value);
        node.next = array[index];
        array[index] = node;
        size++;

        //插入结束之后判断需不需要扩容
        if (size*1.0/array.length >= LOAD_FACTOR) {   //判断负载因子是不是大于0.75
            //进行扩容
            resize();
        }

        return -1;
    }

    //根据key值获得value的值
    public int get(int key) {
        int index = key % array.length;
        Node node = array[index];
        for (;node != null; node = node.next){
            if (node.key == key) {
                return node.value;
            }
        }
        return -1;
    }

}
