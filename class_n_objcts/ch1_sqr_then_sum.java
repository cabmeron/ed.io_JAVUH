import java.lang.Math;

// Squared sum practice mate
class SquareSum {

    double squareSum(double num1, double num2, double num3) {
        double sum = 0;

        sum += (Math.sqrt(num1) + Math.sqrt(num2) + Math.sqrt(num3));

        return sum;
    }

    public static void main(String[] args) {
        SquareSum ss = new SquareSum();
        double result = ss.squareSum(9, 16, 25);
        System.out.println(result);
    }
}
