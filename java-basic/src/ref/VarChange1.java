package ref;

public class VarChange1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = 20;
        System.out.println("\na = 20 변경");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 30;
        System.out.println("\nb = 30 변경");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
