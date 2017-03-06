/**题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
 * Created by Zero on 2017/3/4.
 */
public class demo_9 {
    public static void main(String args[]){
        double sum=100;
        double hight=sum/2;
        for(int i=2;i<11;i++){
            sum=sum+hight*2;
            hight/=2;
        }
        System.out.println("第十次落地共经过："+sum);
        System.out.println("第十次反弹："+hight);
    }
}
