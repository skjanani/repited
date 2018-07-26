package janani;
import java.util.Scanner;
public class Repitedstring1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,i,j,d=0,min=0,count=0;
String a="",b="",c="";
//System.out.println("enter the string");
Scanner ja=new Scanner(System.in);
System.out.println("enter the elements");
n=ja.nextInt();
String []str=new String[n];
int []str1=new int[100];
for(i=0;i<n;i++){
	str[i]=ja.next();
}

for(i=0;i<n;i++){
	str1[d]=str[i].length();
	d++;
}
min=str1[0];
for(i=0;i<n;i++){
	if(str1[i]<min){
		min=str1[i];
	}
}
	for(i=1;i<=min;i++){
		count=0;
		a=str[0].substring(i-1,i);
		for(j=1;j<d;j++){
			b=str[j].substring(i-1,i);
			if(a.equals(b)){
				count++;
			}
		}
		if(count==n-1)
			c=c+a;
		
		
		else
			break;
		
	}
		
          System.out.println(c);
	
}
	}


