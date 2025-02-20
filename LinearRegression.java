import java.util.List;

public class LinearRegression{
    public static double calcM(Double[][] array){
        double sum = (array.length)*(array[0][0] * array[1][0]) / (array.length * ( Math.pow(array[0][0], 2 )));
        return sum;

    }


    public static double calcB(Double[][] array){
        double slope = calcM(array);
        double sum = (array[1].length - slope *array[0].length) / array.length * array[0].length;
        return sum;
    }
}