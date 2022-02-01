import java.util.Scanner;

class FatherAgeException extends Exception {

    public String toString() {
        return ("Father's age is less than 0");
    }

}

class SonAgeException extends Exception {

    int a;

    public SonAgeException(int a) {
        this.a = a;
    }

    public String toString() {
        if (a < 0)
            return ("Son's age is less than 0");
        else
            return ("Son's age is greater than or equal to father's age");
    }
}

class Father {

    int ageF;
    Scanner in = new Scanner(System.in);

    Father() {
        System.out.println("Enter the father's age ");
        ageF = in.nextInt();
    }

    void FatherEx() throws FatherAgeException {
        if (ageF < 0)
            throw new FatherAgeException();
    }
}

class Son extends Father {

    int ageS;
    Scanner in = new Scanner(System.in);

    Son() {
        System.out.println("Enter the son's age ");
        ageS = in.nextInt();
    }

    void SonEx() throws SonAgeException {
        if (ageS < 0 || ageS >= ageF)
            throw new SonAgeException(ageS);
    }
}

class ExceptionDemo {

    public static void main(String args[]) {

        Son s = new Son();
        try {
            s.FatherEx();
        } catch (FatherAgeException e1) {
            System.out.println(e1);
        }

        try {
            s.SonEx();
        } catch (SonAgeException e2) {
            System.out.println(e2);
        }

    }
}
