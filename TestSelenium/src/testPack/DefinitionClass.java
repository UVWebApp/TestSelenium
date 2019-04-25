package testPack;

public class DefinitionClass {
	

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

	public static String concaticationDemo(String a, String b, String c)
	{
		return a+b+c;
		
	}
	
	public static String upperLetter(String a)
	{
		return a.toUpperCase();
	}
	
	public static String lowerletter(String a)
	{
		return a.toLowerCase();
	}

}
