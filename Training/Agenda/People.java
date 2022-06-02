package Training.Agenda;


class People {
    private String name;
    private String phone;
    private int age;
    People(String name, String phone, int age){
        this.name = name;
        this.phone = phone;
        this.age = age;
    }
    People(){
        this.name = "";
        this.phone = "";
        this.age = 0;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }
    public void setAge(int age){
        this.age = age;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getPhone(){
        return this.phone;
    }
    public int getAge(){
        return this.age;
    }
    public String toString(){
        return("Name.: " + this.name + "\nPhone: " + this.phone + "\nAge..: " + this.age);
    }
}
