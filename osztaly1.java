package gyakorlas;

import java.util.Scanner;

public class osztaly1 {
    public static void main(String[] args) {
        Cats cats = new Cats("Dollár",2,"brown-white",2);
        System.out.println(cats.name);
        System.out.println(cats);
        Cats cats2 = new Cats("Kormos",3,"black",2.5);
        System.out.println(cats2);
        System.out.println(cats2.getColor());
        cats.setAge(4);
        System.out.println(cats.getAge());

        cats2.suly();
        cats.suly();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you hungry?");
        boolean hungry = scanner.nextBoolean();
        System.out.println("What time is it?");
        int time= scanner.nextInt();
        if(hungry & time>12 & time<14){
            System.out.println("Jó étvágyat "+cats.name);
        }
        else{
            System.out.println("Nincs ebédidő cica");
        }
    }
}
