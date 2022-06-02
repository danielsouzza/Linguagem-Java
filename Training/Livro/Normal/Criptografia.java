package Training.Livro.Normal;
import java.util.Arrays;
import java.util.Scanner;

public class Criptografia {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Cryptor pass = new Cryptor(3692);

        System.out.println("");

        System.out.printf("Senha criptografada: ");
        for(int i : pass.getcrypted()) 
            System.out.printf("%d ",i);

            System.out.printf("\nSenha descriptografada: ");
        for(int i : pass.getDecrypted())
            System.out.printf("%d ",i);

        System.out.printf("\nSenha original: ");
        for(int i : pass.getPasswordOriginal())
            System.out.printf("%d ",i);

        System.out.println("");
    }
}

class Cryptor {
    private int[] password;
    private int[] encrypted;
    private int[] result;
    private int[] decrypted;
    private int size;

    public Cryptor(int key){
        this.password = new int[4];
        this.decrypted = new int[4];
        this.encrypted = new int[4];
        this.result = new int[4];
        this.size = encrypted.length;

        for(int i = 3; key > 0; i--){
            this.password[i] = (key % 10);
            key /= 10;
        }
    }

    public int[] getcrypted(){
        this.encrypted = Arrays.copyOf(password, size);
        int aux;

        for(int i = 0; i < size; i++){
            
            encrypted[i] += 7;
            result[i] = encrypted[i] / 10; 
            encrypted[i] %= 10;
        }

        for(int i = 0; i < size/2; i++){
            aux = encrypted[i];
            encrypted[i] = encrypted[i+2];
            encrypted[i+2] = aux;
        }

        return encrypted;

    }

    public int[] getDecrypted(){
        this.decrypted = Arrays.copyOf(encrypted, size);
        int aux;
        for(int i = 0; i < size/2; i++){
            aux = decrypted[i];
            decrypted[i] = decrypted[i+2];
            decrypted[i+2] = aux;
        }


        for(int i = 0; i < size; i++){
            decrypted[i] = (10 * result[i] + decrypted[i]) - 7;
        }
        
        return decrypted;
    }

    public int[] getPasswordOriginal(){
        return this.password;
    }
}
