package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int []arr={2,3,1,47,4,8};
        for (int i = 1; i < arr.length; ++i) {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j-=1;
            }
            arr[j+1]=key;
        }

        for(int i:arr) System.out.print(i+" ");
    }
}
