import java.io.*;
import java.net.*;
import java.lang.*;
import java.util.*;

class Ceta{
	public static void main(String[] args) throws Exception{
	Scanner in=new Scanner(System.in);
	System.out.println("Enter text:");
	String txt=in.nextLine();	
	System.out.println("Enter key:");
	int k=in.nextInt();
	System.out.println("Enter pattern:(p/m)");
	String v=in.next();
	char c1=v.charAt(0);
	in.nextLine();
	txt=txt.toLowerCase();
	char[] c=txt.toCharArray();
	for(int i=0;i<txt.length();i++){
		if(c1=='p'){
			c[i]+=k;
			if(c[i]>'z'){	
				c[i]-=122;
				c[i]+=96;
			}
			}
		else if(c1=='m'){
			c[i]-=k;
			if(c[i]<'a'){
				c[i]-=97;
				c[i]+=123;
			}
			}
	}	
	txt=String.valueOf(c);
	System.out.println(txt);	
	}
}

