class AnnalynsInfiltration {
    public boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return (knightIsAwake || archerIsAwake || prisonerIsAwake);
    }

    public boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if(!archerIsAwake && prisonerIsAwake)return true;
        else return false;
    }

    public boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if (petDogIsPresent){
            if (!(archerIsAwake)) return true;
            else return false;
        }else{
            if(!(knightIsAwake) && !(archerIsAwake) && (prisonerIsAwake)) return true;
            else return false;
        }
    }
}


public class Infiltration{
    public static void main(String[] args) {
        AnnalynsInfiltration Annaly = new AnnalynsInfiltration();
        Annaly.canFastAttack(true);
    }
}
