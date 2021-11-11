import java.util.*;

class Student {
    static int n;
    static Scanner in = new Scanner(System.in);
    private static Student si;
    int choice;
    String name;

    Student(int i) {
        in.nextLine();
        System.out.println("Enter the student " + i + " name:");
        name = in.nextLine();

        System.out.println("Enter student's course choice:");
        choice = in.nextInt();
    }

    void display(int j) {
        if (this.choice == j)
            System.out.println("Student name: " + name);
    }

    public static void main(String args[]) {
        int j;
        System.out.println("Enter the number of students:");
        n = in.nextInt();
        System.out.println(
                "Courses Offered:\n" + "1.Internet of things\n" + "2.Advanced Java\n" + "3.Advanced Data Structres\n");

        for (int i = 1; i <= n; i++) {
            Student si = new Student(i);
        }

        System.out.println("Enter the course: ");
        j = in.nextInt();
        for (int i = 0; i <= n; i++) {
            si.display(j);
        }

    }

}
