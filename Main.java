
import java.util.Scanner;

public class Main {
	 
	 //The method checks a number is a palindrome or not
     static boolean isPalindrom(int num) {
     int temp = num;//assign number(num) into variable(temp)
     int reverseNum = 0;
     int lastNum;
     
     while (temp != 0) {
    	 lastNum=temp%10;
    	reverseNum=reverseNum*10+lastNum;
    	 temp/=10;
     }
     //if the original and the reverse of number is equal
     //the number is palindrome otherwise is not
     if(num==reverseNum) 
    return true;
     else 
    	 return false;
    }
     public static void main(String[] args) {
    	 System.out.print("Bir sayı giriniz:");
    	 int temp=new Scanner(System.in).nextInt();
    	 if(isPalindrom(temp)) {
    		 System.out.println( temp + " palindrom bir sayıdır.");
    	 }
    	 else {
    		 System.out.println( temp + " palindrom bir sayı değildir.");
    	 }
	 } 
}

