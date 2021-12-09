import java.util.Scanner;

abstract class Bank {
    double bal = 0, min_bal = 500;
    String name, ac_num;

    abstract void deposit();

    abstract void withdraw();

    abstract void display();
}

class Sav_acct extends Bank {

    Scanner in = new Scanner(System.in);

    Sav_acct() {
        System.out.println("Enter the name:");
        name = in.nextLine();
        System.out.println("Enter the account number: ");
        ac_num = in.nextLine();
    }

    void deposit() {

        System.out.println("Enter the amount: ");
        double amount = in.nextDouble();
        bal = bal + amount;

    }

    void withdraw() {
        if (bal < min_bal)
            System.out.println("Low Balance!!");
        else {
            System.out.println("Enter the amount: ");
            double amount = in.nextDouble();
            if ((bal - amount) < min_bal)
                System.out.println("Withdraw results in low balance!!");

            bal = bal - amount;
        }

    }

    void display() {

        System.out.println("Savings account balance is Rs." + bal);

    }
}

class Curr_acct extends Bank {
    Scanner in = new Scanner(System.in);

    Curr_acct() {
        System.out.println("Enter the name:");
        name = in.nextLine();
        System.out.println("Enter the account number: ");
        ac_num = in.nextLine();
    }

    void deposit() {
        System.out.println("Enter the amount");
        double amount = in.nextDouble();
        bal = bal + amount;

    }

    void display() {
        if (bal < min_bal)
            System.out.println("Low Balance!!");
        else {
            System.out.println("Enter the amount: ");
            double amount = in.nextDouble();
            if ((bal - amount) < min_bal)
                System.out.println("Withdraw results in low balance!!");

            bal = bal - amount;
        }

    }

    void withdraw() {
        System.out.println("Savings account balance is Rs." + bal);
    }
}

class Account {
    public static void main(String args[]) {
        int c1 = 0, c2 = 0;
        Scanner in = new Scanner(System.in);
        while (c1 >= 0) {
            System.out.println("ENTER THE TYPE OF ACCOUNT:\n1.Savings Account\t\t2.Current Account\t\t3.Exit Menu");
            c1 = in.nextInt();

            switch (c1) {
                case 1: {
                    Sav_acct s = new Sav_acct();
                    while (c2 != 4) {
                        System.out.println("Enter your choice:\n1.Deposit\t\t2.Withdraw\t\t3.View Balance\t\t4.Exit");
                        c2 = in.nextInt();
                        switch (c2) {
                            case 1:
                                s.deposit();
                                break;
                            case 2:
                                s.withdraw();
                                break;
                            case 3:
                                s.display();
                                break;

                            default:
                                System.out.println("Enter a valid choice!!");
                        }

                    }

                }
                    break;

                case 2: {
                    Curr_acct c = new Curr_acct();
                    while (c2 >= 0) {
                        System.out.println("Enter your choice:\n1.Deposit\t\t2.Withdraw\t\t3.View Balance\t\t4.Exit");
                        c2 = in.nextInt();
                        switch (c2) {
                            case 1:
                                c.deposit();
                                break;
                            case 2:
                                c.withdraw();
                                break;
                            case 3:
                                c.display();
                                break;

                            default:
                                System.out.println("Enter a valid choice!!");
                        }
                    }
                }
                    break;

                case 3:
                    System.exit(0);

                default:
                    System.out.println("Enter a valid choice!!");
            }
        }
    }
}
