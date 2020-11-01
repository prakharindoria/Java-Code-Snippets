public class StringAnagram {
    public static void main(String[] args) {
        //Anagram
        //Silent Listen

        Scanner kb=new Scanner(System.in);
        System.out.println("Enter First String");
        String s1=kb.next();
        System.out.println("Enter Second String");
        String s2=kb.next();
        if(s1.length()==s2.length()) {

            char [] arr1=new char[s1.length()];
            for(int i=0;i<=(s1.length())-1;i++)
                arr1[i]=s1.charAt(i);

            char [] arr2=new char[s2.length()];
            for(int i=0;i<=(s2.length())-1;i++)
                arr2[i]=s2.charAt(i);
   boolean b=false;
            for (int i = 0; i < s1.length(); i++) {
                char c=arr1[i];

                for (int j = 0; j < s2.length(); j++) {
                    if(s2.charAt(j)==c)
                    {
                    b=true;
                    break;}
                }


            }
            if(b==true)
            System.out.println("Anagram");
            else
            System.out.println("Not Anagram");


            }
            //System.out.println("Strings are Anagram");
        }
    }
