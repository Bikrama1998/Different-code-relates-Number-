import java.util.Scanner;
class circularPrime 
{
	public static boolean isPrime(int num){
		int count=0;
		for(int i=2;i<num;i++){
			if(num%i==0){
				count++;
				break;
			}
		}
		if(count!=0){
			return false;
		}else{
			return true;
		}
	}


	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		if(isCircular(num)){
			System.out.println("Circular prime Number");
		}else{
			System.out.println("Not a circular prime");
		}
	}


	public static boolean isCircular(int num){
		int lengNum=(num+"").length();
		int i=1;
		while(i<=lengNum){
			int div=(int)Math.pow(10,i);
			int mult=(int)Math.pow(10,lengNum-i);
			int newNum=((num%div)*mult+num/div);
			System.out.println(newNum);
			if(isPrime(newNum)){
				i++;
			}else{
				return false;
			}
			
		}
		return true;
	}

}
