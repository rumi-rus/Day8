package exercise04;
import java.util.Scanner;

public class BrowserCall {

	public static void main(String[] args) {
		int i;
		Browser browser= new Browser();
		System.out.println("How many urls did you visit?");
		Scanner s=new Scanner(System.in);
		i=s.nextInt();
		for(int a=0;a<i;a++) { 
		  browser.numberOfVisit();
		}
	}
}
