package Assignment3_YueliangYu_002743877_section8;

public class student {
    private double[] earnedPoint;
    private double[] percentage;
    private double[] pointTotal;
    private double weightedPoint;

    public student(double[] a1, double[] a2, double[] a3) {
        weightedPoint = 0;
        earnedPoint = a1;
        pointTotal = a2;
        percentage = a3;
    }//constructor

    public void calWeightedPoint() {
        for (int i = 0; i < 8; i++){
            weightedPoint += (earnedPoint[i]/pointTotal[i]) * percentage[i];
        }
    }

    public double getWeightedPoint() {
        return weightedPoint;
    }
}
