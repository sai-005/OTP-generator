import java.util.*;



public class OtpGenerator
{
    static char[] otp(int len){

        System.out.println("Generating OTP using random() : "); 
        System.out.print("You OTP is : "); 
  
        String number="0123456789";
        Random otp=new Random();
    
        char [] ot=new char[len];
        for(int i=0;i<len;i++)
        {
            ot[i]=number.charAt(otp.nextInt(6));
        }
        return ot;
    }
    public static void main(String[] args) {
       char[] ot = otp(6);
       System.out.println(ot);
       
    }
}
