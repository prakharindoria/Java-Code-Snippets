class Result {
    public static String findDay(int d, int m, int y) {
        return LocalDate.of(y,m,d).getDayOfWeek().name();
    }

}
class MainClass{
public static void main(String []args){
Scanner kb=new Scanner(System.in);
System.out.println("Enter Date in Format: dd/mm/yyyy");
int dd=kb.nextInt();
int mm=kb.nextInt();
int yyyy=kb.nextInt();
String res=Result.findDay(dd,mm,yyyy);
System.out.println("Dsy is"+res);


}
}
