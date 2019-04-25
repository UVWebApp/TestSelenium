package enCap;

public class PublicUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		demoGettersSetters d = new demoGettersSetters();
		d.setEmpID(101);
		//System.out.println(d.getEmpID());
		d.setEmpName("test");
		d.setEmpDesig("Manager");
		
		System.out.println(d.getEmpID()+" "+d.getEmpName()+ " "+
		d.getEmpDesig());
		
	}

}
