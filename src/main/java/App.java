import Utilities.BMI;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w, h;
        try {
            System.out.print("Nhap can nang: w = ");
            w = Integer.parseInt(sc.nextLine());

            System.out.print("Nhap chieu cao: h = ");
            h = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println(e);
            return;
        }
        try {
            BMI bmi = new BMI();
            bmi.calculateBMI(w, h);
            double kq = bmi.calculateBMI(w, h);
            System.out.println("BMI cua ban la: " + kq);
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}
