

enum Rank{
    SOLDIER,
    SERGEANT,
    CAPTAIN
}


public class Ennums {
    public static void main(String[] args) {
        Rank a = Rank.SOLDIER;
        switch (a) {
            case SOLDIER:
                System.out.println("Soldier says hi!");
                break;
            case SERGEANT:
                System.out.println("Sergeant Says hello!");
                break;
            case CAPTAIN:
                System.out.println("Captain says welcome!");
                break;
        }
    }
}
