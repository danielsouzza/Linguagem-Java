import java.util.Scanner;

// Class to calculate BMI
class DepartmentOfHealth {
    private int imc;
    public DepartmentOfHealth (){
        this.imc = 0;
    }
    // returns the BMI
    public double calculate(double weight, double height){
        return weight / Math.pow(height, 2);
    }
}

public class calculadoraDeIMC {
    public static void main(String[] args) {
        DepartmentOfHealth  person = new DepartmentOfHealth ();
        Scanner input = new Scanner(System.in);
        double bmi;
        double weight;
        double height;
        
        System.out.println("Enter your weight and height");
        weight = input.nextDouble();
        height = input.nextDouble();
        bmi = person.calculate(weight, height);

        if (bmi < 18.5){
            System.out.println("Underweight");
        }
        else if(bmi > 18.5 && bmi < 24.9){
            System.out.println("Normal");
        }
        else if(bmi > 25 && bmi < 29.9){
            System.out.println("Overweight");
        }
        else if(bmi >= 30){
            System.out.println("Obese");
        }

    }
}