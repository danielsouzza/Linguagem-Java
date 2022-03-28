import java.util.Scanner;

public class Cook{
    public static void main(String[] args) {
        lasagna lasagna = new lasagna();
        Scanner input  = new Scanner(System.in);
        int camadas = input.nextInt();
        int forno = input.nextInt();
        int timetotal = lasagna.totalTimeInMinutes(camadas, forno);
        System.out.println(timetotal);
    }
}
class lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }
    public int remainingMinutesInOven(int min) {
        return expectedMinutesInOven() - min;
    }
    public int preparationTimeInMinutes(int cam){
        return 2 * cam;
    }
    public int totalTimeInMinutes(int cam, int forno) {
        return preparationTimeInMinutes(cam) + forno;
    }      
}