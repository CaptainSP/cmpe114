import java.util.Locale;
import java.util.Scanner;

public class CitySorter {
    public static void main(String[] args) {
        String[] arr = { "ISTANBUL", "ANKARA" };
        Scanner s = new Scanner(System.in);

        int i = 0;

        while (i < 5) {
            System.out.println("Please enter a city name:");
            String str = s.nextLine();
            arr = addAndSort(arr, str);
            String arrStr = String.join(",", arr);
            System.out.println(arrStr);
            i++;
        }
    }

    public static String[] addAndSort(String[] arr, String newText) {
        newText = newText.toUpperCase();
        String[] newArr = new String[arr.length + 1];

        for (int i = 0; i < arr.length + 1; i++) {
            if (i < arr.length) {
                newArr[i] = arr[i];
            } else {
                newArr[i] = newText;
            }
        }
        // ads new element to array
        return sort(newArr);
    }

    public static String[] sort(String[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                String s1 = arr[j];

                if (s1 != null &&  j > 0) {
                    String s2 = arr[j-1];
                    if (s2 != null && s1.compareTo(s2) < 0) {
                        arr[j-1] = s1;
                        arr[j] = s2;
                    }
                }
            }

        }


        return arr;
    }

}
