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
            if(name == this.people[i].getName()) return (i+1);
        }
        return (0);
    }

    public int removePerson(String name){
        int i = searchPerson(name) -1;
        People r = new People();
        if(i < 0) return 1;
        else{ 
            this.people[i] = r;
            return (this.people[i].getName() == "") ? 0 : 1;
        }
    }

    public void setPerson(People person){
        this.people[nump++] = person;
    }
    public String getPerson(int i){
        return this.people[i].toString();
    }
    public String toString(){
        String agenda = "";
        for (People i : people){
            agenda = agenda + i.toString() + "\n";
        }
        return agenda;
    }
}