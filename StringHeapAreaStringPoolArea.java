public class StringHeapAreaStringPoolArea {
    public static void main(String[] args) {
                                     //Program To Learn String Concepts in Detail.

        String s1="Prakhar Indoria";//Made in String Pool Area.(Checked in String Pool Area And If not present then made in String Pool Area).
        System.out.println("S1: "+s1);

        String s2=new String("Prakhar Indoria");//Made in Heap Area.
        System.out.println("S2: "+s2);

        String s3="Prakhar Indoria";//NOT MADE AGAIN in String Pool Area as "Prakhar Indoria" is already present there.(Starts pointing to already made String)
        System.out.println("S3: "+s3);

        String s4=new String("Prakhar");//Made in Heap Area AGAIN.
        System.out.println("S2: "+s2);

        System.out.println(s1==s2);//False As One in Heap area and another in String Pool area.
        System.out.println(s1==s3);//True As both in String pool Area points to same String.
        System.out.println(s1.equals(s2));//True As .equals() method evaluates their values and not address.


    }
}
