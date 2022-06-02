package Training.Livro.SML;

public class Memory {
    public static int size = 100;
    private int[] memoria;
    private int accumulator;

    public Memory() {
        this.memoria = new int[size];
        this.accumulator = 0;
        for(int i = 0; i < size; i++) memoria[i] = 0;
    }

    public int read(int mar) { // 10;
        return memoria[mar];
    }

    public void write(int mar,int mbr) { // 11
        this.memoria[mar] = mbr;
    }

    public void load(int mar){ // 20
        this.accumulator = this.read(mar);
    }

    public void store(int mar){ // 21
        this.write(mar, this.accumulator);
    }

    public void add(int mar){ // 30
        this.accumulator += this.read(mar);
    }

    public void subtract(int mar){ //  31 
        this.accumulator -= this.read(mar);
    }

    public void divide(int mar){
        this.accumulator /= this.read(mar);
    }

    public void multiply(int mar){
        this.accumulator *= this.read(mar);
    }

    public int getAccumulator(){
        return this.accumulator;
    }
}
