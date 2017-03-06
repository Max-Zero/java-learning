/**题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
 * Created by Zero on 2017/3/2.
 */
public class demo_3 {
    public static void main(String args[]){

        for(int i=100;i<1000;i++){
            int a=i/100;
            int b=(i-a*100)/10;
            int c=i-a*100-b*10;
            int d=a*a*a+b*b*b+c*c*c;
            if(i==d){
                System.out.println("水仙数:"+i);
            }
        }
    }
}
