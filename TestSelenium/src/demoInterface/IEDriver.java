package demoInterface;

public class IEDriver implements WebDriver {

	@Override
	public void Launch() {
		// TODO Auto-generated method stub
		System.out.println("IE - Launch Application");
	}

	@Override
	public void FindElement() {
		// TODO Auto-generated method stub
		System.out.println("IE - Find Element");
	}

	@Override
	public void Click() {
		// TODO Auto-generated method stub
		System.out.println("IE - Click object");
	}

	@Override
	public void Type() {
		// TODO Auto-generated method stub
		System.out.println("IE - type");
	}

	@Override
	public void Minimize() {
		// TODO Auto-generated method stub
		System.out.println("IE - Minimize Application");
	}

	@Override
	public void Maximize() {
		// TODO Auto-generated method stub
		System.out.println("IE - Maxi Application");
	}

	@Override
	public void Close() {
		// TODO Auto-generated method stub
		System.out.println("IE - Close Application");
	}
}
