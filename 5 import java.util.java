import java.util.Scanner;

class Employee {
    int empno;
    String ename;
    float basic, hra, da, netpay;

    // Calculate net pay
    float Calculate() {
        return basic + hra + da;
    }

    // Accept data
    void havedata() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Number: ");
        empno = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        ename = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basic = sc.nextFloat();

        System.out.print("Enter HRA: ");
        hra = sc.nextFloat();

        System.out.print("Enter DA: ");
        da = sc.nextFloat();

        netpay = Calculate(); // calling method
    }

    // Display data
    void dispdata() {
        System.out.println("\nEmployee Details:");
        System.out.println("Emp No: " + empno);
        System.out.println("Name: " + ename);
        System.out.println("Basic: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Net Pay: " + netpay);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.havedata();
        e.dispdata();
    }
}