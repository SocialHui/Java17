import java.util.Comparator;
import java.util.PriorityQueue;

//实现Comparable接口通过rank基表实现堆排序
class Card implements Comparable<Card>{
    public int rank;
    public String suit;
    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Card{" +
                "rank=" + rank +
                ", suit='" + suit + '\'' +
                '}';
    }

    @Override
    public int compareTo(Card o) {
        //小堆排序，按照rank比较
        return this.rank - o.rank;
    }
}

//对应通过比较器实现，实现代码见main1函数中qu2的new  Comparator<Card2>
class Card2 {
    public int rank;
    public String suit;
    public Card2(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Card{" +
                "rank=" + rank +
                ", suit='" + suit + '\'' +
                '}';
    }
}

class RankComparator implements Comparator<Card2> {
    @Override
    public int compare(Card2 o1, Card2 o2) {
        return o1.rank - o2.rank;
    }
}

public class TestDemo {


    public static void main(String[] args) {
        //存放整形的数据不需要自己实现Comparable接口是因为Integer底部实现了比较的接口
        //自己定义的类型需要实现比较接口才可以进行比较
        PriorityQueue<Integer> qu = new PriorityQueue<>();
        qu.offer(1);
        qu.offer(2);
        qu.offer(3);
    }

    public static void main2(String[] args) {
        Card2 card11 = new Card2(1,"♦");
        Card2 card22 = new Card2(2,"♦");
        Card2 card33 = new Card2(3,"♦");
        PriorityQueue<Card2> qu2 = new PriorityQueue<>(new RankComparator());
        qu2.offer(card33);
        qu2.offer(card11);
        qu2.offer(card22);
        System.out.println(qu2);
    }




    public static void main1(String[] args) {
        Card card1 = new Card(1,"♦");
        Card card2 = new Card(2,"♦");
        Card card3 = new Card(3,"♦");
        PriorityQueue<Card> qu = new PriorityQueue<>();
        qu.offer(card1);
        qu.offer(card2);
        System.out.println(qu);

        PriorityQueue<Card2> qu2 = new PriorityQueue<>(new Comparator<Card2>() {  //通过比较器实现比较
            @Override
            public int compare(Card2 o1, Card2 o2) {
                return o1.rank - o2.rank; //o1.rank - o2.rank是小堆存储
            }
        });
        Card2 card11 = new Card2(1,"♦");
        Card2 card22 = new Card2(2,"♦");
        Card2 card33 = new Card2(3,"♦");
        qu2.offer(card22);
        qu2.offer(card33);
        qu2.offer(card11);
        System.out.println(qu2);
    }

}
