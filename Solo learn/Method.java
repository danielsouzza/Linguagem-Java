class filme{
    private String phrase;
    //SETTER
    public void setphrase(String phrase){
        this.phrase = phrase;
    }
    //GETTER
    public String getphrase(){
        return this.phrase;
    }
}

public class Method{
    public static void main(String[] args) {
        filme filmeM = new filme();
        filmeM.setphrase("Black Panther");
        System.out.println(filmeM.getphrase());
    }
}