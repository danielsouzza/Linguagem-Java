
public class Anonymous {
    public static void main(String[] args) {
        Machine m1 = new Machine();
        Machine m2 = new Machine(){
            @Override public void start(){
                System.out.println("Woooo");
            }
        };
        m1.start();
        m2.start();
    }
}

class Machine{
    public void start(){
        System.out.println("Starting...");
    }
}