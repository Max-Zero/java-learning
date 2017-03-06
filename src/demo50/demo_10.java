/**有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 * Created by Zero on 2017/3/4.
 */
public class demo_10 {
    public static void main(String args[]){
        int m=0;
        for(int i=1;i<5;i++){
            for(int j=1;j<5;j++){
                for(int k=1;k<5;k++){
                    if(i!=j&&i!=k&&j!=k){
                        m++;
                        System.out.println(i*100+j*10+k);
                    }
                }
            }
        }
        System.out.println("个数："+m);
    }
}
