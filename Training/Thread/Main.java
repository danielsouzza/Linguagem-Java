public class Main {
    public static void main(String[] args) {
        int somatorio;
        int[] vetor = new int[1000];

        // Cria o vetor de 1000 elementos
        for(int i=0; i < 1000; i++) vetor[i]= i;
        
        System.out.println("");

        // Cria as threads
        Threadd thread_0 = new Threadd(vetor,0,250);
        Threadd thread_1 = new Threadd(vetor,251,500);
        Threadd thread_2 = new Threadd(vetor,501,750);
        Threadd thread_3 = new Threadd(vetor,751,999);

        somatorio = somatThread(new Threadd[]{thread_0, thread_1, thread_2, thread_3});
        System.out.println("");
        System.out.printf("A soma de todos os Thread é:   %d \t(Valores de 0 até 999)\n",somatorio);
    }

    // Soma os valores das threads
    public static int somatThread(Threadd[] thr){
        int allthr=0;
        for(Threadd th : thr){
            allthr += th.getSomatorio();
        }
        return allthr;
    }
}