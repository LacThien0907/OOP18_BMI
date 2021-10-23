package Utilities;

public class BMI {
    final int minWeight = 2;
    final int maxWeight = 300;
    final int minHeight = 1;
    final int maxHeight = 3;
    public double calculateBMI (int w, int h) throws Exception{
        if(w < 2 || w > 300){
            throw new Exception("inValid Weight");
        }else if (h < 1 || h > 3){
            throw new Exception("inValid Height");
        }
        return w/(h*h);
    }

}
