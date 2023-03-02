package exercise04;
import java.lang.String;
import java.util.ArrayList;
import java.util.Scanner;

public class Browser {
    ArrayList<String> url= new ArrayList();
	Browser(){}

    public void numberOfVisit() {
    	String str,urls;
    	Scanner c = new Scanner(System.in);
    	 int flag=1,position=0,visit;
		System.out.println("\nenter the url:");
        urls=c.nextLine();
        for(String in:url) {
             in=in.substring(0,in.length()-5);
             position++;
        	 if(urls.equals(in)) {
        	    flag++;
        	    str=url.get(position-1);
            	urls=str.substring(str.length()-1);
            	visit=Integer.parseInt(urls);
            	visit++;
            	str=str.substring(0,str.length()-1);
                urls=str+visit;
                url.set(position-1, urls);
                System.out.println("\nthe urls are " +url);
        	    break;
     	     }	    	           
        }
        if(flag==1) {
        	StringBuilder sb = new StringBuilder(urls);
            sb.append(" ## "+1);
            urls=sb.toString();
            url.add(urls);
            System.out.println("\nthe urls are " +url);
        }			
    }
}
