/**题目：求1+2!+3!+...+20!的和
 * Created by Zero on 2017/3/4.
 */
public class demo_16 {
    public static void main(String args[]){
        int num=1;
        int sum=0;
        for(int i=1;i<21;i++){
            num=num*i;
            sum+=num;
        }
        System.out.println(sum);
    }
}
