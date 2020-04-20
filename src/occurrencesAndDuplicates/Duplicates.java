package occurrencesAndDuplicates;

public class Duplicates {
    public static void duplicate(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }

        int[] brr = new int[max];

        for (int i = 0; i < arr.length - 1; i++) {
            brr[arr[i]]++;
        }

        for (int i = 0; i < brr.length; i++) {
            if(brr[i] > 1){
                System.out.println(brr[i]);
            }
        }
    }
}
