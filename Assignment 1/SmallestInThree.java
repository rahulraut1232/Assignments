public class SmallestInThree {
 
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int c = 30;
        int smallest;
         
        if(a<b) {
            if(c<a) {
                smallest = c;
            } else {
                smallest = a;
            }
        } else {
            if(b<c) {
                smallest = b;
            } else {
                smallest = c;
            }
        }
         
        System.out.println(smallest + " is the smallest.");
    }
}