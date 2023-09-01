import java.util.ArrayList;

public class areaProblem {

    // checks if clockwise then reverse before calculation
    private static double calculateArea(double[] x, double[] y){

        if (clockwise(x, y)) {
            double[] reversedX = reverse(x, x.length);
            double[] reversedY = reverse(y, y.length);
            return areaFormula(reversedX, reversedY);
        }
        else {
            return areaFormula(x, y);
        }
    }

    private static double areaFormula(double[] x, double[] y){
        double area = 0;
        int size = x.length - 1;
    
        for (int i = 0; i < size; i++){
            area += (x[i] * y[i+1]) + (x[i+1] * y[i] * -1);
        }
        return area/2;
    }

    private static boolean clockwise(double[] x, double[] y){
        double sum = 0;
        int size = x.length - 1;
        for (int i = 0; i < size; i++){
            sum += (x[i+1] - x[i]) * (y[i+1] + y[i]);
        }
        if (sum > 0) {
            return true;
        }
        return false;
    }

    private static double[] reverse(double[] arr, int size){
        double[] reverseArr = new double[size];
        int reverseIndex = size;
        for (int i = 0; i < size; i++) {
            reverseArr[reverseIndex - 1] = arr[i];
            reverseIndex -= 1;
        }
        return reverseArr;
    }

    public static void main(String[] args) {
        
        /* // manually arranged given for example 1
        double[] x = {0, 1, 1, 0};
        double[] y = {0, 0, 1, 1};

        // manually arranged coordinates for example 2
        double[] x2 = {0, 1, 0};
        double[] y2 = {0, 1, 1};

        // manually arranged coordinates for example 3
        double[] x3 = {0, 3, 3, 4, 4, 2, 2, 1, 1, 0};
        double[] y3 = {0, 0, 1, 1, 2, 2, 3, 3, 1, 1};

        // manually arranged coordinates for example 4
        double[] x4 = {1, -1, -2, -2, 0, 1};
        double[] y4 = {1, 1, 0, -1, -2, -2};
 */

        // example 1
        double[] x = {0, 0, 1, 1};
        double[] y = {0, 1, 1, 0}; 
        
        // example 2
        double[] x2 = {0, 0, 1};
        double[] y2 = {0, 1, 1};

        // example 3
        double[] x3 = {0, 3, 3, 4, 4, 2, 2, 1, 1, 0};
        double[] y3 = {0, 0, 1, 1, 2, 2, 3, 3, 1, 1};

        // example 4 - expected output 7.5
        double[] x4 = {1, -1, -2, -2, 0, 1};
        double[] y4 = {1, 1, 0, -1, -2, -2};

        System.out.println(calculateArea(x, y));
    }
}
