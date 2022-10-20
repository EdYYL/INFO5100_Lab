package Assignment4_YueliangYu_002743877_section8;

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

    public double[] getEarnedPoint() {
        return earnedPoint;
    }

    public double[] getPercentage() {
        return percentage;
    }

    public double[] getPointTotal() {
        return pointTotal;
    }

    public double getWeightedPoint() {
        return weightedPoint;
    }

    public void setPercentage(double[] percentage) {
        this.percentage = percentage;
    }

    public void setEarnedPoint(double[] earnedPoint) {
        this.earnedPoint = earnedPoint;
    }

    public void setPointTotal(double[] pointTotal) {
        this.pointTotal = pointTotal;
    }

    public void setWeightedPoint(double weightedPoint) {
        this.weightedPoint = weightedPoint;
    }

    public void calWeightedPoint() {
        for (int i = 0; i < earnedPoint.length; i++){
            weightedPoint += (earnedPoint[i]/pointTotal[i]) * percentage[i];
        }
    }
}
