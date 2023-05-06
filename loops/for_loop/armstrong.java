import java.util.*;
class armstrong{
	public static void main(String[] args){
		
		System.out.println("Enter value of n : ");
		Scanner sr=new Scanner(System.in);
		int n=sr.nextInt();

		int temp1=n;
		int temp2=n;
		int sum=0;
		int count=0;
		

		while(n!=0){
			count++;
			n=n/10;
		}
		while(temp1!=0){
			int mult = 1;
			int res = temp1%10;
			for(int i=1;i<=count;i++){
				mult=mult*res;
			}
			sum=sum+mult;
			temp1=temp1/10;
		}
		if(sum==temp2){
			System.out.println("Armstrong");
		}else{
			System.out.println("Not armstrong");
		}
			

	}
}
