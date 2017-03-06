/**题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 * Created by Zero on 2017/3/4.
 */
import java.util.Scanner;
public class demo_6 {
    public static void main(String args[]){
        int Englishnumber=0;
        int blanknumber=0;
        int number=0;
        int elsenumber=0;
        Scanner input=new Scanner(System.in);
        System.out.println("please input a string:");
        String str=input.nextLine();
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(Character.isLetter(ch[i])){
                Englishnumber++;
            }
            else if(Character.isDigit(ch[i])){
                number++;
            }
            else if(Character.isSpaceChar(ch[i])){
                blanknumber++;
            }
            else{
                elsenumber++;
            }
        }
        System.out.println("英文字母个数"+Englishnumber);
        System.out.println("空格个数"+blanknumber);
        System.out.println("数字个数"+number);
        System.out.println("其他字符个数"+elsenumber);
    }
}
