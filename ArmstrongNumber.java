package FirstAssignment;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int n=370, number, temp, total=0;
		
		number= n;//number = 370
		
		while(number!=0)  //370!=0//37!=0 //3!=0 //0!=0
		{
			temp= number%10;  //0//7 //3
			total= total+temp*temp*temp;  //0+0=0//0+7*7*7=343 //343+3*3*3=370
			number=number/10;  //37 //3 //0
			
		}
		if(total== n) // 370==370
		{
			System.out.println(n + " is an Armstrong number");//370 is an Armstrong number 
		}
		else
		{
			System.out.println(n + " is not an Armstrong number");
		}

	}

}
