package Assignment2_YueliangYu_002743877_section8;

import java.util.Scanner;


public class Assignment2_YueliangYu_002743877_section8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("input PointTotal: ");
        double pT = scan.nextDouble();
        System.out.println("input EarnedPoint: ");
        double eP = scan.nextDouble();
        System.out.println("input Assignment: ");
        String a = scan.next();
        boolean flag = a.contains("%");//judge whether input contains %
        double A;
        if(flag) A = (double) Double.parseDouble(a.substring(0, a.length() - 1));//if input a percentage
        else A = (double) Double.parseDouble(a);//if input a double
        student stu = new student();
        stu.setPointTotal(pT);
        stu.setEarnedPoint(eP);
        stu.setAssignment(A);
        stu.setTotalWeightedGrade();
        System.out.println(stu.getTotalWeightedGrade());
    }
}
