import java.util.*;
class HelloProject{
    public static String generateOTP(int len){
        int n=0;
        for(int i=0;i<len;i++){
            n=n*10+(int)Math.ceil(Math.random()*9);
        }
        String value=String.valueOf(n);
        return value;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String otp;
        int n;
        n=sc.nextInt();
        sc.close();
        for(int i=1;i<=5;i++){
            otp=generateOTP(n);
            System.out.println(otp);
        }
    }
}