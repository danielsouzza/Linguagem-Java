package Training.Agenda;

class Schedule{
    private static int nump = 0;
    private People[] people = new People[10];
    Schedule(People person){
        this.people[nump++] = person;

    }
    Schedule(){
        People r = new People();
        this.people[nump] = r;
    }
    public int searchPerson(String name){
        for (int i = 0; i < nump; i++){
            if(this.people[i].getName().equals(name)){
                return i = i + 1;
            }
        }
        return (0);
    }

    public int removePerson(String name){
        int i = searchPerson(name);
        People r = new People();
        if(i > 0){
            this.people[i-1] = r;
            return (this.people[i-1].getName().equals("")) ? 0 : 1;
        }
        else{ 
            return 1;
        }
    }

    public void setPerson(People person){
        this.people[nump] = person;
        nump++;
    }
    public String getPerson(int i){
        return this.people[i-1].toString();
    }
    public String toString(){
        String agenda = "";
        for (int i = 0; i < nump; i++){
            agenda = agenda + people[i].toString() + "\n";
        }
        return agenda;
    }
}