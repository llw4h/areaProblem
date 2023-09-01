import java.util.ArrayList;

public class areaProblem {

    private static double calculateArea(double[] x, double[] y){
        double area = 0;
        // subtracts 1 from the array size to use for the formula
        int size = x.length - 1;
        for (int i = 0; i < size; i++){
            area += (x[i] * y[i+1]) + (x[i+1] * y[i] * -1);
        }
        return area/2;
    }

   /*  private static double[] counterClockwise(double[] x, double[] y){
        // TODO 
    } */
    public static void main(String[] args) {
        // unarranged given for example 1
        /* double[] x = {0.0, 0.0, 1.0, 1.0};
        double[] y = {0.0, 1.0, 1.0, 0.0}; */

        // manually arranged given for example 1
        double[] x = {0.0, 1.0, 1.0, 0.0};
        double[] y = {0.0, 0.0, 1.0, 1.0};

        // manually arranged coordinates for example 2
        double[] x2 = {0.0, 1.0, 0.0};
        double[] y2 = {0.0, 1.0, 1.0};

        // manually arranged coordinates for example 3
        double[] x3 = {0, 3, 3, 4, 4, 2, 2, 1, 1, 0};
        double[] y3 = {0, 0, 1, 1, 2, 2, 3, 3, 1, 1};

        // manually arranged coordinates for example 4
        double[] x4 = {0, 1, 1, -1, -2, -2};
        double[] y4 = {-2, -2, 1, 1, 0, -1};

        // unarranged coordinates for example 4
        double[] uX4 = {1, -1, -2, -2, 0, 1};
        double[] uY4 = {1, 1, 0, -1, -2, -2};


        System.out.println(calculateArea(x, y));
    }
}
