import java.util.Scanner;

class quadratic {

    int a, b, c;

    void roots() {
        float delta;
        float x1, x2;

        delta = (float) Math.sqrt(b * b - 4 * a * c);
        if (delta == 0) {
            x1 = (float) -b / (2 * a);
            System.out.println("Solutions are real and equal: " + x1);
        } else if (delta > 0) {
            x1 = (float) (-b + delta) / (2 * a);
            x2 = (float) (-b - delta) / (2 * a);
            System.out.println("Solutions are real and distinct: " + x1 + " and " + x2);
        } else {
            System.out.println("Solutions are not real");
        }
    }

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        quadratic q1 = new quadratic();

        System.out.println("Enter a ,b, c: ");
        q1.a = in.nextInt();
        q1.b = in.nextInt();
        q1.c = in.nextInt();

        q1.roots();
    }

}