import java.util.Random;

public class Pet {
    private int age = generateDefaultAge();
    private Color color;
    private Shelter shelter;

    public Pet() {
    }


    public Pet(Color color, Shelter shelter) {
        this.color = color;
        this.shelter = shelter;
    }

    public int getAge() {
        return age;
    }


    public Color getColor() {
        return color;
    }


    public Shelter getShelter() {
        return shelter;
    }


    private int generateDefaultAge() {
       /* Random random = new Random();
        return random.nextInt(15);*/

        return (int) Math.random() * 10 + 5; // generates from 5 to 15
    }

    public String getInfo() {
        return "--------------------------------"+
                "\nPet = {" +
                "\nage = " + age +
                "\ncolor  " + color +
                "\nShelter's address:" + shelter.getAddress() +
                "\nShelter's name:" + shelter.getName();
    }
}
