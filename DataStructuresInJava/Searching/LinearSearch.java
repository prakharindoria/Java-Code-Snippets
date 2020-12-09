public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={6,1,4,7,2,3,45,87};
        int size=arr.length;
        int toSearch=4;
        int pos=-1;
      
        for(int i=0;i<size;i++){
        	if(arr[i]==toSearch)
        		pos=i;
        }

        if(pos==-1) System.out.println("Not Found");
        else System.out.println("Found at position "+(pos+1));

    }
}
