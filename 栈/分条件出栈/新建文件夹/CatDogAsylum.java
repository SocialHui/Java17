import java.util.*;

public class CatDogAsylum {
    public ArrayList<Integer> asylum(int[][] ope) {
        // write code here
        ArrayList<Integer> list = new ArrayList<>();   //存放所有的数据
        ArrayList<Integer> list1 = new ArrayList<>();    //存放目的数据
        for (int i = 0; i < ope.length; i++) {
            switch(ope[i][0]) {
                case 1:{
                    list.add(ope[i][1]);
                    break;
                }
                case 2:{
                    if (ope[i][1] == 0) {
                        list1.add(list.get(0));
                        list.remove(0);
                    } else if (ope[i][1] == 1) {
                        for (int j = 0; j < list.size(); j++) {
                            if (list.get(j) > 0) {
                                list1.add(list.get(j));
                                list.remove(j);
                                break;
                            }
                        }
                    } else {
                        for (int j = 0; j < list.size(); j++) {
                            if (list.get(j) < 0) {
                                list1.add(list.get(j));
                                list.remove(j);
                                break;
                            }
                        }
                    }
                    break;
                }
            }
        }
        return list1;
    }
}
