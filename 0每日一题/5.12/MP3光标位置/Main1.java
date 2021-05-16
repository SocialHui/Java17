import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();  //总共有多少首歌曲
            String str = sc.next();  // 进行的操作
            Queue<Integer> q1 = new LinkedList<>();

            int num = 1;  //代表当前光标所在的位置
            if (n <= 4) {
                //可以直接输出几首歌曲
                for (int i = 1; i <= n; i++) {
                    if (i == n-1) {
                        System.out.print(i + " ");
                    } else {
                        System.out.println(i);
                    }
                }
                //接下来进行操作
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == 'U') {
                        //上一首
                        num--;
                        if (num == 0) {
                            num = n;
                        }
                    } else {
                        //下一首
                        num++;
                        if (num == n+1) {
                            num = 1;
                        }
                    }
                }

            } else {
                //将前四首放进来
                for (int i = 1; i <= 4; i++) {
                    q1.offer(i);
                }

                //操作
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == 'U') {
                        //上一首
                        num--;
                        if (!q1.contains(num)) {
                            if (num == 0) {
                                num = n;
                                //将队尾的一首删除
                                q1.clear();
                                //在队头进来num
                                for (int j = num-3; j <= num; j++) {
                                    q1.offer(j);
                                }
                            } else {
                                //正常的上一首
                                q1.clear();
                                for (int j = num; j < num+4; j++) {
                                    q1.offer(j);
                                }
                            }
                        }
                    } else {
                        //下一首
                        num++;
                        if (!q1.contains(num)) {
                            if (num == n+1) {
                                q1.clear();
                                num = 1;
                                for (int j = 1; j < 5; j++) {
                                    q1.offer(j);
                                }
                            } else {
                                //正常的下一首
                                q1.remove();
                                q1.offer(num);
                            }
                        }

                    }
                }

                while (q1.size()!= 1) {
                    System.out.print(q1.poll()+" ");
                }
                System.out.println(q1.poll());
            }
            System.out.println(num);  //输出当前光标所在的歌曲的位置
        }
    }
}