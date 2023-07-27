import java.util.Iterator;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class YildizİleUcgenYapmaPatika13 {

	public static void main(String[] args) {

		/*
		 *      
	 * 
    *** 
   ***** 
  ******* 
 ********* 
***********

*/
	Scanner input=new Scanner(System.in);
	System.out.print("n:  ");
	int sayi=input.nextInt();
	
	System.out.println();
	int n=0;
for(int i=0;i<=sayi;i++) {
		if(i%2==1) {
			n++;
	}}
System.out.println("n: " + n);

	
	for(int i=0;i<=n;i++) {
		for(int k=0;k<(n-i);k++) {
			System.out.print(" ");
		}
		for(int h=1;h<=((i*2)-1);h++) {
			System.out.print("*");
		}
		System.out.println();
		}
	}
		
	}


