package demoInterface;

public class PublicUseage {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		System.out.println("**************Chrome**************");
		driver.Launch();
		driver.Type();
		driver.Click();
		driver.Minimize();
		driver.Maximize();
		driver.Close();
		System.out.println("**************IE**************");
		driver = new IEDriver();
		driver.Launch();
		driver.Type();
		driver.Click();
		driver.Minimize();
		driver.Maximize();
		driver.Close();
		
	}

}
