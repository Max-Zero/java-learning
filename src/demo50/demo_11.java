/**题目：一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
 * Created by Zero on 2017/3/4.
 */
public class demo_11 {
    public static void main(String args[]){

        for(int i=1;;i++){
            int m,n;
            m=i+100;
            n=m+168;
            if(isFullSquare(m)==0&&isFullSquare(n)==0){
                System.out.println(i);
            }
        }


    }

    static int isFullSquare(int j){
        double k=Math.sqrt(j);
        int k1=(int)k;
        if(k-k1==0){
            return 0;
        }
        else
            return 1;
    }
}

