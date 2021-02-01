import java.util.Objects;
import java.util.PriorityQueue;

class Card implements Comparable<Card> {
    public int rank;   //数值
    public String suit;   //花色

    public Card (int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    //重写toString方法
    @Override
    public String toString() {
        return "Card{" +
                "rank=" + rank +
                ", suit='" + suit + '\'' +
                '}';
    }

    @Override
    public int compareTo(Card o) {
        return this.rank - o.rank;
    }

    //重写equals方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return rank == card.rank &&
                Objects.equals(suit, card.suit);
    }

    //重写hashCode方法
    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Card card1 = new Card(1,"♥");
        Card card2 =  new Card(2,"♥");
        //自定义类型，不可以用> < 比较
        //System.out.println(card1 > card2);
        //之所以可以用compareTo方法进行比较是因为Card类实现了Comparable接口
        System.out.println(card1.compareTo(card2));   //两张牌所指向的内容相同则返回0,  card1比card2小则返回负数，相反返回正数

        //引用支持==比较
        System.out.println(card1 == card2);


        //比较引用所指向的对象是否相同
        System.out.println(card1.equals(card2));
        //但是即使两张牌花色相同，数值相同，调用equals方法进行比较返回的仍然是false
        //原因是自己没有重写equals方法，没有重写是父类的equals方法
    }
}
