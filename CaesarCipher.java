import java.io.*;
import java.net.*;
import java.lang.*;
import java.util.*;

class CaesarCipher{
	public static void main(String[] args) throws Exception{
	Scanner in=new Scanner(System.in);
	System.out.println("Enter key:");
	int k=in.nextInt();
	System.out.println("Enter pattern:(p/m)");
	String v=in.next();
	char c1=v.charAt(0);
	in.nextLine();
	String file="EReport";
	File file1 = new File(file);	
	String file2;	
	byte[] line=null;
	file="DReport";
	FileInputStream fsi = new FileInputStream(file1);
	FileOutputStream fso = new FileOutputStream(file);
	while(fsi.available()!=0){
	if(fsi.available()<1024)
	line =new byte[fsi.available()];
	else line =new byte[1024];
	fsi.read(line);
	file2=new String(line);
	char[] c=file2.toCharArray();
	for(int i=0;i<file2.length();i++){
		if(c1=='p'){c[i]+=k;}
		else if(c1=='m'){c[i]-=k;}
	}
	file2=String.valueOf(c);
	int count =file2.length();
	if(count<1024){
		line=new byte[1024];
	}
	line=file2.getBytes();
	fso.write(line);	
	}
	fsi.close();
	fso.close();	
	}
}

