public class Skidka {
    public static int A=1000;
    public static int B=500;
    public static int C=10;
    public static void main(String[] args) {
        int result=(A+B)/C;

        System.out.println("Summa pokupki so skidkoi: " +((A+B)-result));
        System.out.println("Summa skidki: "+result);
    }
}
