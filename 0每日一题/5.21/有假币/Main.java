import java.util.*;
public class Main {
	    public static void main(String args[]) {
	        Scanner scan = new Scanner(System.in);
	        
	        while (true) {
                int n = scan.nextInt();
	            if (n == 0) {
	                break;
	            }
	            int count = 0;
	            while (n != 1) {
                    count++;
                    if (n%3 == 0) {
                        n /= 3;
                    } else {
                        n = n/3+1;
                    }
                }
                System.out.println(count);
	        }
	    }
	}


//https://hestyle.blog.csdn.net/article/details/104689962