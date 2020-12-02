public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int size=arr.length;
        int low=0;
        int high=size;
        int mid;
        int toSearch=5;
        int pos=-1;


        while(low<high){
            mid=(low+high)/2;
            if(toSearch==arr[mid]){pos=mid;break;}
            else if(toSearch<arr[mid]){high=mid;}
            else if(toSearch>arr[mid]){low=mid;}

        }

        if(pos==-1) System.out.println("Not Found");
        else System.out.println("Found at position "+(pos+1));

    }
}
