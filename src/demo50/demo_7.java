/**题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
 * Created by Zero on 2017/3/4.
 */
import java.util.Scanner;
public class demo_7 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the digit(0-9):");
        int digit=input.nextInt();
        System.out.println("Enter the number of digits:");
        int numberofdigits=input.nextInt();
        int []arraynumber=new int[numberofdigits];
        int sum=digit;
        arraynumber[0]=digit;
        for(int i=1;i<numberofdigits;i++){
            arraynumber[i]=arraynumber[i-1]*10+2;
            sum+=arraynumber[i];
        }
        System.out.println("The result:"+sum);

    }

}
