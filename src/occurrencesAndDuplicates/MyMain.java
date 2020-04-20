package occurrencesAndDuplicates;

import java.util.Arrays;
import java.util.Scanner;

public class MyMain {
    public static void main(String args[])
    {
        Occurrence occurrence = new Occurrence();
        Duplicates duplicates = new Duplicates();
        //System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[x];
        for(int i = 0;i < arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Initial Array "+ Arrays.toString(arr));
        System.out.println("Occurrence Output");
        occurrence.Occurance(arr,n);
        System.out.println("Duplicates Output");
        duplicates.duplicate(arr);
    }
}
