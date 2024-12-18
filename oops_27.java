import java.util.*;
//package employee;
class Emp{
    String name;
    int empid;
    String category;
    double bpay, hra, da, npay, pf, grosspay, income_tax,allowance;
  Emp(String name, int empid, String category, double bpay){
    this.name = name;
    this.empid=empid;
    this.category=category;
    this.bpay=bpay;
  }
  public void calculatepayroll(){
    hra = 0.2*bpay;
    da = 0.5*bpay;
    allowance = 0.1*bpay;
    grosspay = hra+da+allowance;
    pf = 0.12*bpay;
    income_tax = 0.1*grosspay;
    int netpay = grosspay-(pf+income_tax);
  }
  public void display(){
    System.out.println("Employee details:");
    System.out.println("Name "+name);
    System.out.println("Employee id "+empid);
    System.out.println("category "+category);
    System.out.println("bpay "+bpay);
    System.out.println("HRA "+hra);
    System.out.println("DA "+da);
    System.out.println("Allowance "+allowance);
    System.out.println("gross pay "+grosspay);
    System.out.println("pf "+pf);
    System.out.println("Income tax"+incometax);
    System.out.println("net pay "+netpay);
  }
}
//import employee.Emp;
public class Empay{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee name: ");
        String name = sc.next();
        System.out.println("Enter employee id");
        int empid = sc.nextInt();
        System.out.println("Enter employee category: ");
        String category = sc.next();
        System.out.println("Enter the basic pay");
        double bpay = sc.nextDouble();
        Emp e = new Emp(name, empid, category,bpay);
        e.calculatepayroll();
        e.display();
    }
}