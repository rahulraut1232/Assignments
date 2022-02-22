public class PrintWioutFor {

    public static void printWithoutLoop(int n) {
        if (n <= 10) {
            System.out.println(n);
            printWithoutLoop(n + 1);
        }
    }
    public static void main(String[] args){
        Print.printWithoutLoop(1);
    }
}