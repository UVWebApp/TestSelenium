package demoUsage;

public class SortingDemo {

	public static void main(String[] args) {
		int[] a={1,5,2,0,9,0};
		for(int i=0;i<a.length-1; i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i] > a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
