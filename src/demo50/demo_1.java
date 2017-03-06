

/**題目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一
 *对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 * Created by Zero on 2017/3/2.
 */
public class demo_1 {
    public static void main(String args[]){
        long arr[]=new long[48];
        arr[0]=1;
        arr[1]=1;
        System.out.println("第1个月兔子："+"1对");
        System.out.println("第2个月兔子："+"1对");
        for(int i=2;i<48;i++){
            arr[i]=arr[i-1]+arr[i-2];
            System.out.println("第"+(i+1)+"个月兔子："+arr[i]+"对");
        }

    }


}
