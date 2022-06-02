package Training.Livro.SML;

import java.util.Scanner;

public class CompiladorSml {
    public static void main(String[] args) {
        Mmu mmu = new Mmu();
        
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
        IR = memory.read(IC);
        do {
            instruction();
            switch (this.opcode) {
                case 10:
                    System.out.printf("0%d ? ", IR);
                    int R1 = input.nextInt();
                    memory.write(operand, R1);
                    break;
                case 11:
                    System.out.println(this.IR + "=" + memory.read(operand));
                    break;
                case 20:
                    memory.load(operand);
                    break;
                case 21:
                    memory.store(operand);
                    break;
                case 30:
                    memory.add(operand);
                    break;
                case 31:
                    memory.subtract(operand);
                    break;
                case 40:
                    memory.divide(opcode);
                    break;
                case 41:
                    IC = operand;
                    break;
                case 42:
                    if(memory.getAccumulator() == 0){
                        IC = operand;
                    }
                    break;
                case 43:
                    IR = 9999;
                    break;
                default:
                    break;
            }
            IC++;
        } while(this.IR != 9999);
    }

    public void instruction(){
        opcode  = this.IR  / 100;
        operand = this.IR % 100;
    }

    
}