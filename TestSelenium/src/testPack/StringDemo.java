package testPack;

public class StringDemo {

	public static void strRevDemo(String txt)
	{
		//System.out.println("String Length " +txt.length());
		
		/*
		 * S = 0 
		 * o = 1
		 * f = 2
		 * t = 3
		 * w = 4
		 * a = 5
		 * r = 6
		 * e = 7
		 */
		
		for(int i = txt.length()-1; i>=0; i--)
		{
			System.out.print(txt.charAt(i));
		}
		System.out.print(" ");
	}
	
	
	public static void main(String[] args) {

		//"Software Testing"

		String txt = "Software Testing";
	
		//gnitseT erawtfoS
		strRevDemo(txt);
		
		
		System.out.println();
		//erawtfoS gnitseT
		String[] splitedTxt=txt.split(" ");
		//splitedTxt[0] - Software
		//splitedTxt[1] - Testing
		
		for(int i =0; i<splitedTxt.length;i++)
		{
			strRevDemo(splitedTxt[i]);
		}

	}

}
