import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            String str = sc.next();
/*
            int n = sc.nextInt();  //歌曲总数
            String str = sc.next();   //操作
*/

            //队列用来存储当前页展示的歌曲
            Queue<Integer> queue = new LinkedList<>();  // 最终存放歌单的队列
            Queue<Integer> queue1 = new LinkedList<>();


            if (n <= 4) {
                //直接将所有的歌曲输出
                for (int i = 0; i < n; i++) {
                    if (i != n - 1) {
                        System.out.print((i + 1) + " ");
                    } else {
                        System.out.println(i + 1);
                    }
                }
                int num = 1;
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == 'U') {
                        num--;
                        //上一首
                        if (num <= 0) {
                            num = n;
                        }
                    } else {
                        num++;
                        if (num > n) {
                            num = 1;
                        }
                    }
                }
                System.out.println(num);
            } else {
                //先将首页的四首歌曲放在queue
                for (int i = 0; i < 4; i++) {
                    queue.offer(i + 1);
                }

                int num = 1;   //光标所在的位置
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == 'U') {
                        //上一首
                        num--;
                        if (!queue.contains(num)) {
                            if (num == 0) {  //代表是
                                //先将queue里面的数字清理出去
                                queue.clear();

                                //然后将最后的四个数字放进来
                                for (int j = n - 3; j <= n; j++) {
                                    queue.offer(j);
                                }

                                num = n;   //现在的光标位置是最后一首歌曲
                            } else {
                                //正常的上一首歌曲
                                //queue最后出去一个，头进来最后一个

                                queue1.offer(num);
                                //将除了最后一个数字的所有的数字都放在queue1里面
                                while (queue.size() != 1) {
                                    queue1.offer(queue.poll());
                                }
                                queue.poll();   //将最后一个数字扔掉

                                //再将数据都读取到queue里面
                                while (!queue1.isEmpty()) {
                                    queue.offer(queue1.poll());
                                }

                            }
                        }
                    } else {
                        num++;
                        //下一首
                        if (!queue.contains(num)) {
                            if (num == n + 1) {
                                //queue存储前4首歌曲
                                queue.clear();

                                for (int j = 1; j <= 4; j++) {
                                    queue.offer(j);
                                }

                                num = 1;
                            } else {
                                //queue前面出去一个，最后进来一个
                                queue.poll();
                                queue.offer(num);
                            }
                        }
                    }
                }

                while (!queue.isEmpty()) {
                    if (queue.size() != 1) {
                        System.out.print(queue.poll() + " ");
                    } else {
                        System.out.println(queue.poll());
                    }
                }
                System.out.println(num);

            }
        }
    }
}