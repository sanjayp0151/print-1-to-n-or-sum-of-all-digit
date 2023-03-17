package assignment;

import java.util.Scanner;

public class sumOfAllDigit {
      public static void main(String[] args) {
            int no,ans=0;
            System.out.println("\nEnter no : ");
            Scanner sc = new Scanner(System.in);
            no = sc.nextInt();
            while (no>0)
            {
                  int rem = no%10;
                  no/=10;
                  ans=ans+rem;
            }
            System.out.println("/nSome of all digit is : "+ans);
      }
}
