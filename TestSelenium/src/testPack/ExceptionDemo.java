package testPack;

public class ExceptionDemo {

	public static String demoMonthConversion(int i)
	{
		String[] Month = {"JAN","FEB","MAR","APR"};
		String res="";
		try{
			System.out.println(Month[i-1]);
			res=Month[i-1];
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid Month - "+e);
		}
		return res;
		
	}
	
	public static void main(String[] args)
	{
		String tempDate="01/06/2019";
		String[] t=tempDate.split("/");
		//t[0]=01
		//t[1]=05
		//t[2]=2019
		int x=Integer.parseInt(t[1]);
		String FormattedDate=t[0]+"/"+demoMonthConversion(x)+"/"+t[2];
		System.out.println(FormattedDate);
	}
	
	
}
