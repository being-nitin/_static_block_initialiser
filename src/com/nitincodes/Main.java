package com.nitincodes;
import java.util.Scanner;
public class Main {
	// Static block initialiser hackerrank solution
    static int B,H;
        static boolean flag=true;
        static
        {
            Scanner sc = new Scanner(System.in);
            B=sc.nextInt();
            H=sc.nextInt();
            try
            {
                if(B<=0 || H<=0){
                    throw new Exception("Breadth and height must be positive");
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        public static void main(String[] args){
            if(flag){
                int area=B*H;
                System.out.print(area);
            }
        }//end of main
}//end of class
