import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        String[] st=str.split(" ");
        String a=st[0].toString();
        String b=st[1].toString();
        String[] d=a.split("\\.");
        String[] c=b.split("\\.");
        int[] m=new int[3];
        int[] n=new int[3];
        for(int i=0;i<m.length;i++){
            m[i]=Integer.parseInt(d[i]);
            n[i]=Integer.parseInt(c[i]);
        }
        int A=(m[0]*17+m[1])*29+m[2];
        int B=(n[0]*17+n[1])*29+n[2];
       if(A<=B) {
           int r[] = new int[3];
           for (int j = 2; j >= 0; j--) {
               if (j == 2) {
                   if (n[2] >= m[2]) {
                       r[2] = n[2] - m[2];
                   } else {
                       n[2] = n[2] + 29;
                       r[2] = n[2] - m[2];
                       n[1] = n[1] - 1;
                   }
               }
               if (j == 1) {
                   if (n[1] >= m[1]) {
                       r[1] = n[1] - m[1];
                   } else {
                       n[1] = n[1] + 17;
                       r[1] = n[1] - m[1];
                       n[0] = n[0] - 1;
                   }
               }
               if (j == 0) {
                   r[0]=n[0]-m[0];
               }
           }
           System.out.println(r[0]+"."+r[1]+"."+r[2]);
       }else {
           int r[] = new int[3];
           for (int j = 2; j >= 0; j--) {
               if (j == 2) {
                   if (m[2] >= n[2]) {
                       r[2] = m[2] - n[2];
                   } else {
                       m[2] = m[2] + 29;
                       r[2] = m[2] - n[2];
                       m[1] = m[1] - 1;
                   }
               }
               if (j == 1) {
                   if (m[1] >= n[1]) {
                       r[1] = m[1] - n[1];
                   } else {
                       m[1] = m[1] + 17;
                       r[1] = m[1] - n[1];
                       m[0] = m[0] - 1;
                   }
               }
               if (j == 0) {
                   r[0]=m[0]-n[0];
               }
           }
           System.out.println("-"+r[0]+"."+r[1]+"."+r[2]);
       }



    }
}