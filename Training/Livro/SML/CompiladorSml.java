package Training.Livro.SML;

import java.util.Scanner;

public class CompiladorSml {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Mmu mmu = new Mmu();
        int mar = 0;
        int mbr;
        System.out.println("\n=================================================");
        System.out.println("=== Welcome to Simpletron!");
        System.out.println("=== Please enter your program one instruction.");
        System.out.println("=== (or data word) at a time. I will display.");
        System.out.println("=== the location number and a question mark (?).");
        System.out.println("=== You then type the word for that location.");
        System.out.println("=== Type -99999 to stop entering your program.");
        System.out.println("\n=================================================");

        do {
            
            System.out.printf("%d ? ",mar);
            mbr = input.nextInt();
            mmu.memory.write(mar, mbr);
            mar++;
            
        } while (mbr != 9999);
        
        mmu.run();
        mmu.dump();
    }
}

class Mmu{
    Scanner input = new Scanner(System.in);
    Memory memory;
    int opcode, operand;
    int IR, IC;
    public Mmu() {
        memory = new Memory();
        this.IC = 0;
    }

    public void run(){
        int halt = 0;
        System.out.println("\n=================================================");
        do {
            this.IR = memory.read(IC);
            instruction();
            switch (this.opcode) {
                case 10:
                    System.out.printf("%02d ? ", operand);
                    int R1 = input.nextInt();
                    memory.write(operand, R1);
                    IC++;
                    break;
                case 11:
                    System.out.printf("O maior número foi : ");
                    System.out.printf("%d \n", memory.read(operand));
                    IC++;
                    break;
                case 20:
                    memory.load(operand);
                    IC++;
                    break;
                case 21:
                    memory.store(operand);
                    IC++;
                    break;
                case 30:
                    memory.add(operand);
                    IC++;
                    break;
                case 31:
                    memory.subtract(operand);
                    IC++;
                    break;
                case 32:
                    memory.divide(operand);
                    IC++;
                    break;
                case 33:
                    memory.multiply(operand);
                    IC++;
                    break;
                case 40:
                    IC = operand;
                    break;
                case 41:
                    if(memory.getAccumulator() < 0){
                        IC = operand;
                        continue;
                    }
                    IC++;
                    break;
                case 42:
                    if(memory.getAccumulator() == 0){
                        IC = operand;
                        continue;
                    }
                    IC++;
                    break;
                case 43:
                    halt = 1;
                    break;
                default:
                    memory.write(opcode, 0);
                    break;
            }
        } while(halt != 1);
    }

    public void instruction(){
        this.opcode  = this.IR  / 100;
        this.operand = this.IR % 100;
    }

    public void dump(){
        int count = 10;
        System.out.println("\n=================================================");
        for (int i = 0; i < memory.getSize(); i++){
            if(i == count){
                System.out.printf("\n");
                count +=10;
            }
            System.out.printf("%04d ", memory.read(i));
        }
        System.out.printf("\n");
    }

    
}