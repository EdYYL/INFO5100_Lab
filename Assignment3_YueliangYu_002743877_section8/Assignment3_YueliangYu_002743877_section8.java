package Assignment3_YueliangYu_002743877_section8;
import java.util.Scanner;

public class Assignment3_YueliangYu_002743877_section8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] EP = new double[8];//earnedPoint
        double[] PT = new double[8];//pointTotal
        double[] per = new double[8];//percentage
        for (int i = 0; i < 8; i++) {
            EP[i] = scan.nextDouble();
        }
        for (int i = 0; i < 8; i++) {
            PT[i] = scan.nextDouble();
        }
        for(int i = 0; i < 8; i++) {
            String a = scan.next();
            boolean flag = a.contains("%");//judge whether input contains %
            double A;
            if(flag) A = (double) Double.parseDouble(a.substring(0, a.length() - 1));//if input a percentage
            else A = (double) Double.parseDouble(a);//if input a double
            per[i] = A;
        }
        student stu =new student(EP, PT, per);
        stu.calWeightedPoint();
        double totalGrade = stu.getWeightedPoint();
        if (totalGrade >= 90) System.out.println("A");
        else if (totalGrade >= 80) System.out.println("B");
        else if (totalGrade >= 70) System.out.println("C");
        else if (totalGrade >= 60) System.out.println("D");
        else System.out.println("F");
    }
}
