package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={2,1,3,5,4,123,32,11,21,121,12};

        for (int i = 0; i < arr.length; i++) {
            int minindex=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[minindex])minindex=j;
            }
            int temp=arr[minindex];
            arr[minindex]=arr[i];
            arr[i]=temp;
        }
        for(int i: arr){
            System.out.print(i+" ");
        }



    }
}
