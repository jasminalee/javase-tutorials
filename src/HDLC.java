import java.util.Scanner;
/*
   Filename:	 	ValidateHKID.java
   Programmer:	Li Xue Qing
   Description:	Determine the check digit of HKID numbers.
*/
public class HDLC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// 新建一个扫描对象
        System.out.println("Enter 總膽固醇 (TC) : ");
        double TC = sc.nextDouble();
        System.out.println("Output 總膽固醇 (TC) : " + TC);

        System.out.println("Enter 高密度膽固醇 (HDLC) : ");
        double HDLC = sc.nextDouble();
        System.out.println("Output 高密度膽固醇 (HDLC) : " + HDLC);

        System.out.println("Enter 甘油三酯 (TG) : ");
        double TG = sc.nextDouble();
        System.out.println("Output 甘油三酯 (TG) : " + TG);

        System.out.println("低密度膽固醇 (LDLC)=" + (TC-HDLC-TG/5));

    }
}
