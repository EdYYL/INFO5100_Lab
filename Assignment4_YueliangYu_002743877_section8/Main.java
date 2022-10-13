package Assignment4_YueliangYu_002743877_section8;

//import Assignment4_YueliangYu_002743877_section8.student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("total");
        int num = scan.nextInt();
        double[] EP = new double[num];//earnedPoint
        double[] PT = new double[num];//pointTotal
        double[] per = new double[num];//percentage
        System.out.println("Enter the earnedPoint");
        for (int i = 0; i < num; i++) {
            EP[i] = scan.nextDouble();
        }
        System.out.println("Enter the pointTotal");
        for (int i = 0; i < num; i++) {
            PT[i] = scan.nextDouble();
        }
        System.out.println("Enter the Percentage");
        for(int i = 0; i < num; i++) {
            String a = scan.next();
            boolean flag = a.contains("%");//judge whether input contains %
            double A;
            if(flag) A = Double.parseDouble(a.substring(0, a.length() - 1));//if input a percentage
            else A = Double.parseDouble(a);//if input a double
            per[i] = A;
        }
        /*Assignment4_YueliangYu_002743877_section8.*/student stu =new student(EP, PT, per);
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
8
20 30 40 50 60 100 100 300
Enter the pointTotal
20 30 40 50 60 100 200 300
Enter the Percentage
10 10 10 10 10 10 15 25
 */