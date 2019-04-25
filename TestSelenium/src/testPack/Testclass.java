package testPack;

public class Testclass {

	public static int i;
	
	public void demoNonStatic(String i)
	{
		System.out.println("Non Static: "+i);
	}
	
	public static void demoStatic(int i)
	{
				
		System.out.println("Static Method: "+i);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testclass a=new Testclass();
		System.out.println("First Java Project");
		demoStatic(10);
		a.demoNonStatic("Ten");
		System.out.println("Main: "+i);
	}

}
