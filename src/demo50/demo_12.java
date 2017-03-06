/**题目：输入三个整数x,y,z，请把这三个数由小到大输出
 * Created by Zero on 2017/3/4.
 */
import java.util.Scanner;
public class demo_12 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter three integers:");
        int x=input.nextInt();
        int y=input.nextInt();
        int z=input.nextInt();
        if(x>y){
            int temp1=y;
            y=x;
            x=temp1;
        }
        if(x>z){
            int temp2=z;
            z=x;
            x=temp2;
        }
        if(y>z){
            int temp3=z;
            z=y;
            y=temp3;
        }
        if(x>y){
            int temp4=y;
            y=x;
            x=temp4;
        }
        System.out.print(x+"  ");
        System.out.print(y+"  ");
        System.out.print(z+"  ");
    }
}
