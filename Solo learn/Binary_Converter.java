import java.util.Scanner;

class Converter {
    public static String toBinary(int num) {
        String binary = "";
        while (num > 0) {
            binary = (num%2) + binary;
            num/=2;
        }
        return (binary + "\n");
    }
}

public class Binary_Converter {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            System.out.print(Converter.toBinary(x));
        }
    }
}