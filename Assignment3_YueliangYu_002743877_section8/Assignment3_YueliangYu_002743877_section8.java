package Assignment3_YueliangYu_002743877_section8;
import java.util.Scanner;

public class Assignment3_YueliangYu_002743877_section8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] EP = new double[8];//earnedPoint
        double[] PT = new double[8];//pointTotal
        double[] per = new double[8];//percentage
        System.out.println("Enter the earnedPoint");
        for (int i = 0; i < 8; i++) {
            EP[i] = scan.nextDouble();
        }
        System.out.println("Enter the pointTotal");
        for (int i = 0; i < 8; i++) {
            PT[i] = scan.nextDouble();
        }
        System.out.println("Enter the Percentage");
        for(int i = 0; i < 8; i++) {
            String a = scan.next();
            boolean flag = a.contains("%");//judge whether input contains %
            double A;
            if(flag) A = Double.parseDouble(a.substring(0, a.length() - 1));//if input a percentage
            else A = Double.parseDouble(a);//if input a double
            per[i] = A;
        }
        student stu =new student(EP, PT, per);
        stu.calWeightedPoint();
        double totalGrade = stu.getWeightedPoint();
        System.out.println("Total grade = " + totalGrade);
        if (totalGrade >= 90) System.out.println("which is an \"A\"");
        else if (totalGrade >= 80) System.out.println("which is an \"B\"");
        else if (totalGrade >= 70) System.out.println("which is an \"C\"");
        else if (totalGrade >= 60) System.out.println("which is an \"D\"");
        else System.out.println("which is an \"F\"");
    }
}

/*
20 30 40 50 60 100 100 300
Enter the pointTotal
20 30 40 50 60 100 200 300
Enter the Percentage
10 10 10 10 10 10 15 25
 */