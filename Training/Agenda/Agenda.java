import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Schedule agenda = new Schedule();

        while(true){
            instructions();
            int choice = input.nextInt();
            if(choice == 1) {
                input.nextLine();
                System.out.printf("Digite um nome: ");
                String name = input.nextLine();
                System.out.printf("Digite um númro: ");
                String phone = input.next();
                input.nextLine();
                System.out.printf("Digite a idade: ");
                int age = input.nextInt();
                People person = new People(name, phone, age);
                agenda.setPerson(person);
                System.out.println(name + " cadastrada com sucesso!!!");
            }
            else if(choice == 2) {
                input.nextLine();
                System.out.printf("Digite um nome: ");
                String name = input.nextLine();
                int index = agenda.searchPerson(name);
                if(index > 0){
                    System.out.printf("%s é o número %d da sua agenda.\n", name, index);
                }else{ 
                    System.out.println(name + " não encontrado");
                }
            }
            else if(choice == 3) {
                input.nextLine();
                System.out.printf("Digite a posição da pessoa: ");
                int position = input.nextInt();
                System.out.println(agenda.getPerson(position));
            }
            else if(choice == 4) {
                input.nextLine();
                System.out.printf("Digite um nome: ");
                String name = input.nextLine();
                if(agenda.removePerson(name) == 0) {
                    System.out.println(name +" foi removido com sucesso!!");
                }
                else
                    System.out.println("Não foi possivel remover essa pessoa");
            }
            else if(choice == 5) {
                input.nextLine();
                System.out.println(agenda.toString());
            }
            else if(choice == 0) break;
        }
    }

    public static void instructions() {
        System.out.println("<><><><><>instructions<><><><><>");
        System.out.println("[1] Armazenar uma pessoa.");
        System.out.println("[2] Buscar possição.");
        System.out.println("[3] Mostrar pessoa.");
        System.out.println("[4] Remover uma pessoa.");
        System.out.println("[5] Mostrar todas as pessoas.");
        System.out.println("<><><><><>instructions<><><><><>");
    }
}