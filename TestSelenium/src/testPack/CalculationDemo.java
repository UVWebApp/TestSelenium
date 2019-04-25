package testPack;

public class CalculationDemo {

	public static void demoCalc(int i, int j,String opr)
	{
		int res = 0;
		if(opr.equals("+"))
		{
			res=i+j;
		}else if(opr.equals("-"))
		{
			res=i-j;
		}else if(opr.equals("*"))
		{
			res=i*j;
		}else
		{
			System.out.println("Invalid opr");
		}
		System.out.println(res);
	}
	
	public static int demoCalcOne(int i,int j, String opr)
	{
		int res=0;
		switch(opr)
		{
		case "+":
			res=i+j;
			break;
		case "-":
			res=i-j;
			break;
		case "*":
			res=i*j;
			break;
		default:
			System.out.println("Invalid Operator");
		}
		//System.out.println(res);
		return res;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans=demoCalcOne(10,12,"+");
		System.out.println(ans);
		System.out.println(demoCalcOne(10,12,"-"));
		System.out.println(demoCalcOne(10,12,"*"));
		System.out.println(demoCalcOne(10,12,"/"));
	}

}
