public class Agenda {
    public static void main(String[] args) {
        People person = new People("Daniel","(93)991234567", 19);
        Schedule agenda = new Schedule();
        int store = agenda.searchPerson("Daniel");
        
        
        
        
        
        
        if (store > 0)
            System.out.printf("Daniel está na posição [%d] da agenda\n",store);
        else 
            System.out.printf("Daniel não foi encontrado\n");

        if(agenda.removePerson("Daniel") == 0){
            System.out.println("Removido");
        }else{
            System.out.println("erro");
        }
        System.out.println(agenda.getPerson(0));
    }

    public static void instructions() {
        System.out.println();
    }
}