package occurrencesAndDuplicates;

import java.util.Arrays;
import java.util.Scanner;

public class Occurrence {
        public static void Occurance(int[] arr,int n){
            for(int i = 0;i < arr.length;i++){
                if(n == arr[i]){
                    System.out.println(i+"  ");
                }
            }
        }
    }
