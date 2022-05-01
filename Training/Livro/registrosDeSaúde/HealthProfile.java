

class HealthProfile{
    static int current_year = 2022;
    private String name;
    private String last_name;
    private int[] birth_date = new int[3];
    private char sex;
    private double height;
    private double weight;

    public HealthProfile(String name, String last_name, int[] birth_date, char sex, double height, double weight){
        this.name = name;
        this.last_name = last_name;
        this.height = height;
        this.weight = weight;
        this.sex = sex;
        for (int i = 0; i < this.birth_date.length; i++){
            this.birth_date[i] = birth_date[i];
        }
    }

    public void setAllName(String name, String last_name){
            this.name = name;
            this.last_name = name;
    }

    public String getAllName(){
        return this.name + this.last_name;
    }

    public String getBirth_date(){
        String date = 
            String.format("%d/0%d/%d",this.birth_date[0], this.birth_date[1], this.birth_date[2]);
        return date;
    }

    public char getSex(){
        return this.sex;
    }

    public double getHeight(){
        return this.height;
    }

    public double getWeight(){
        return this.weight;
    }

    public int age(){
        return this.current_year - this.birth_date[2];
    }

    public int heartRateMax(){
        return 220 - age();
    }

    public double targetHeartRate(){
        return heartRateMax() * 0.85;
    }

    public double Imc(){
        return this.weight / Math.pow(height,2); 
    }
}