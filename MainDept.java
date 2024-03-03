import java.util.Scanner;

public class MainDept {

    public static void main(String[] args) {
        Professor p1 = new Professor("Sam",10000,1998,12,1);
        Professor p2 = new Professor("Dean",20000,1970,12,23);
        Professor p3 = new Professor("Mike",39000,1988,3,23);

        Secretary s1 = new Secretary("Susan",30000,2000,6,2);
        Secretary s2 = new Secretary("Joe",45000,1996,12,1);
        s1.setOvertimeHours(2);
        s2.setOvertimeHours(1);
        DeptEmployee[] department = new DeptEmployee[5];
        department[0] = p1;
        department[1] = p2;
        department[2] = p3;
        department[3] = s1;
        department[4] = s2;
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to see the sum of salary of all Professor and Secretary?");
        System.out.println("Y/N");
        String ans = input.nextLine();
        if(ans.equals("Y")){
            double sum = 0;
            for(DeptEmployee d: department){
                sum = sum + d.computeSalary();
            }
            System.out.println("The sum of all salaries: " + sum);
        }
    }
}
