import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GreaterThan {
    public static void main(String[] args) {
        try {
            File myObj = new File("D://data.txt");
            Scanner myReader = new Scanner(myObj);
            int count=0;
            String []words={};
            while (myReader.hasNextLine()) {
                String line=myReader.nextLine();
                words = line.split(" ");
            }
            for(String s: words){
                int i=Integer.parseInt(s);
                if(i>=9999)count++;
            }
            System.out.println(count);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
