/**题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
 * Created by Zero on 2017/3/2.
 */
import java.util.*;
public class demo_5 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter two positive integer:");
        int m=input.nextInt();
        int n=input.nextInt();
        Divisor a=new Divisor();
        System.out.println("The greatest common divisor:"+a.GCDivisor(m,n));
        System.out.println("The minimum common divisor:"+a.MCMutiple(m,n));
    }

    static class Divisor {
        int lastresult;

        int GCDivisor(int newm, int newn) {
            if (newm < newn) {
                int temp = newn;
                newn = newm;
                newm = temp;

            }

            if (newm % newn == 0) {
                return newn;
            } else {
                newm %= newn;
                return GCDivisor(newm, newn);
            }
        }

        int MCMutiple(int newm, int newn) {
            if (newm < newn) {
                int temp = newn;
                newn = newm;
                newm = temp;

            }
            int MCMutiple = newm;
            int i = 1;
            while (MCMutiple % newn != 0) {
                MCMutiple *= i;
                i++;
            }
            return MCMutiple;
        }
    }
}

