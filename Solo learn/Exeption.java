
public class Exeption {

    public static void main(String[] args) {
        int a[] = new int[2];
        try{
            System.out.println(a[5]);
        }
        catch (Exception e){
            System.out.println("An erro occurred");
        }
    }
}
