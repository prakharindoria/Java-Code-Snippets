import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={4,2,34,1,32,54,53,32,22,56};
        int brr[]=arr;

        Arrays.sort(brr);
        for(int i: brr)
        System.out.print(i+" ");
        System.out.println();

        
        int size=arr.length-1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size-i; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int j:arr){
            System.out.print(j+" ");
        }



    }
}
