package gyakorlas;

public class Cats {
    //tag adatok
    String name;
    int age;
    String color;
    double weight;

    //constructor
    public Cats(String name, int age, String color, double weight) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }
//toString()
    @Override
    public String toString() {
        return "Cats{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
//Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

//setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void suly(){
        if(this.weight<=2){
            System.out.println("Normál testsúly");
        }
        else{
            System.out.println("Túlsúlyos macska");
        }
    }
}
