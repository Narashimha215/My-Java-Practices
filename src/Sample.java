
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=121;
		int r,sum=0,temp = num;
		while(num>0)
		{
			r=num%10;
			sum=sum*10+r;
			num=num/10;
			System.out.println(num);
		}
	}

}
