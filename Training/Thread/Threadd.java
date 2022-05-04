class Threadd extends Thread{
    private int somatorio;
    private int[] vetor;
    private int start;
    private int end;

    public Threadd(int[] vetor, int start, int end){
        this.somatorio = 0;
        this.vetor = vetor;
        this.start = start;
        this.end = end;
        // this.time = time;
        // Inicia e espera essa thread acabar
        try {
            start();
            join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void run(){
        System.out.println("Criando a #" + Thread.currentThread().getName());

        for(int i=start; i <= end; i++){
            this.somatorio += vetor[i];
        }

        String print = 
            String.format("O somatorio da %s é:     %d \t(Valores de %d até %d)\n",
            Thread.currentThread().getName(),this.somatorio, this.start, this.end);
        System.out.printf(print);
    }

    public int getSomatorio(){
        return this.somatorio;
    }
}