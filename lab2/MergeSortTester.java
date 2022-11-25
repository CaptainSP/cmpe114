
public class MergeSortTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {11,8,7,4,2,1};
		int[] b = {14,12,11,10,9,8,6,3};
		int[] c = Sorter.merge(a, b);
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]+"");
		}
		
		
		System.out.println(Sorter.getMax(c));
		
		System.out.println(Sorter.getMin(c));
	}

}
