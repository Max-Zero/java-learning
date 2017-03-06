/**题目：判断101-200之间有多少个素数，并输出所有素数。
 * Created by Zero on 2017/3/2.
 */
public class demo_2 {
    public static void main(String args[]){
        int n;
        int m=0;
        int cout=0;
        for(int i=101;i<201;i++){
            for(int j=2;j<i;j++){
                n=i%j;
                if(n==0){m=m+1;}
                }
                if(m==0){
                    cout+=1;
                    System.out.println("素数："+i);
            }
            m=0;

        }
        System.out.println("素数个数："+cout);

    }
}
