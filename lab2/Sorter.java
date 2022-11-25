
public class Sorter {
	public static int[] merge(int[] arr1, int[] arr2) {
		int[] newArray = new int[arr1.length + arr2.length];

		int i1 = 0;
		int i2 = 0;
		int i3 = 0;
		while (i3 < newArray.length) {

			if (i2 < arr2.length && i1 < arr1.length) {
				int b = arr2[i2];
				int a = arr1[i1];

				if (a > b) {
					newArray[i3] = a;
					i1++;
				} else {
					newArray[i3] = b;
					i2++;
				}

			} else if (i1 < arr1.length) {
				int a = arr1[i1];
				newArray[i3] = a;
				i1++;
			} else if (i2 < arr2.length) {
				int b = arr2[i2];
				newArray[i3] = b;
				i2++;
			}

			i3++;
		}

		return newArray;
	}

	public static int getMax(int[] arr) {
		int a = Integer.MIN_VALUE;
		for (int b : arr) {
			if (b > a) {
				a = b;
			}
		}
		return a;
	}

	public static int getMin(int[] arr) {
		int a = Integer.MAX_VALUE;
		for (int b : arr) {
			if (b < a) {
				a = b;
			}
		}
		return a;
	}
}
