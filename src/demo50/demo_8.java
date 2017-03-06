/**题目：一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3.编程 找出1000以内的所有完数。
 * Created by Zero on 2017/3/4.
 */
import java.util.ArrayList;
public class demo_8 {
    public static void main(String args[]){

        for(int i=1;i<1001;i++){
            int sum=0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    sum+=j;
                }
            }
            if(sum==i){
                System.out.println("完数："+i);
            }
        }
    }
}
