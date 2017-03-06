/**打出菱形
 * Created by Zero on 2017/3/4.
 */
public class demo_15 {
    public static void main(String args[]){
        int i,j,k;
        for(i=0;i<5;i++)    //控制行
        {
            for(j=0;j<5-i;j++)   //控制空格
                System.out.print(" ");
            for(k=0;k<2*i-1;k++)   //控制*号输出
                System.out.print("*");
            System.out.println();
        }
        for(i=3;i>0;i--)
        {
            for(j=0;j<5-i;j++)
                System.out.print(" ");
            for(k=0;k<2*i-1;k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
