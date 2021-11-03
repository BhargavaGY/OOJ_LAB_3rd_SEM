import java.lang.*;
import java.util.*;

class areavol {
    static Scanner in = new Scanner(System.in);

    static void cylinder() {
        float r, h;
        float area, vol;
        System.out.println("Enter the radius of the Cylinder(in cm): ");
        r = in.nextFloat();
        System.out.println("Enter the height of the Cylinder(in cm): ");
        h = in.nextFloat();

        area = (float) (2 * (3.14) * r * (h + r));
        vol = (float) (3.14 * r * r * h);

        System.out.println("Area = " + area + "cm squares" + " Volume = " + vol + "cm cubics");

    }

    static void cone() {
        float r, h;
        float area, vol;
        System.out.println("Enter the radius of the Cone(in cm): ");
        r = in.nextFloat();
        System.out.println("Enter the height of the Cone(in cm): ");
        h = in.nextFloat();

        area = (float) (3.14 * r * (r + Math.sqrt(Math.pow(h, 2) + Math.pow(r, 2))));
        vol = (float) (3.14 * r * r * h / 3);

        System.out.println("Area = " + area + "cm squares" + " Volume = " + vol + "cm cubics");
    }

    static void sphere() {
        float r;
        float area, vol;
        System.out.println("Enter the radius of the Sphere(in cm): ");
        r = in.nextFloat();

        area = (float) (4 * (3.14) * r * r);
        vol = (float) (4 * 3.14 * r * r * r / 3);

        System.out.println("Area = " + area + "cm squares" + " Volume = " + vol + "cm cubics");
    }

    public static void main(String args[]) {
        int choice = 0;
        while (choice >= 0) {
            System.out.println("MENU\n" + "1.Area and Volume of Cylinder\n" + "2.Area and volume of Cone\n"
                    + "3.Area and volume of Sphere\n" + "4.Exit\n");
            System.out.println("Enter your choice: ");
            choice = in.nextInt();

            switch (choice) {
            case 1:
                cylinder();
                break;
            case 2:
                cone();
                break;
            case 3:
                sphere();
                break;
            case 4:
                System.exit(0);

            default:
                System.out.println("Enter a valid choice");
                break;
            }

        }
    }

}
