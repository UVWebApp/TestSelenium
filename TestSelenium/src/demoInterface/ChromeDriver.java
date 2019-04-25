package demoInterface;

public class ChromeDriver implements WebDriver {

	@Override
	public void Launch() {
		// TODO Auto-generated method stub
		System.out.println("Chrome - Launch Application");
	}

	@Override
	public void FindElement() {
		// TODO Auto-generated method stub
		System.out.println("Chrome - Find Element");
	}

	@Override
	public void Click() {
		// TODO Auto-generated method stub
		System.out.println("Chrome - Click object");
	}

	@Override
	public void Type() {
		// TODO Auto-generated method stub
		System.out.println("Chrome - type");
	}

	@Override
	public void Minimize() {
		// TODO Auto-generated method stub
		System.out.println("Chrome - Minimize Application");
	}

	@Override
	public void Maximize() {
		// TODO Auto-generated method stub
		System.out.println("Chrome - Maxi Application");
	}

	@Override
	public void Close() {
		// TODO Auto-generated method stub
		System.out.println("Chrome - Close Application");
	}

}
