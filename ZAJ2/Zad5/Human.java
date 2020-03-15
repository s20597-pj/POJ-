package Zad5;
/**
 * summary: Human class
 * author: Mateusz Hinca
 **/
public class Human {
    private int age;
    private float weight;
    private float height;
    private String name;
    private String gender;
    private String index;
    private float feetSize;

    public Human(int age, float weight, float height, String gender, String index, float feetSize, String name) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.index = index;
        this.feetSize = feetSize;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }

    public float getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public boolean isMale() {
        return gender=="male"?true:false;
    }

    public float getFeetSize() {
        return feetSize;
    }

    public String getIndexNumber() {
        return index;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setFeetSize(float feetSize) {
        this.feetSize = feetSize;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Human Matthew = new Human(21, 70, 181, "male", "s20597", 43, "Mateusz");
    }
}