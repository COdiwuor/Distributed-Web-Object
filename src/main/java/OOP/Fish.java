package OOP;

public class Fish extends Animal implements AnimalInterface {
    private int numberOfFins;

    public Fish(String name, TypeOfEye typeOfEye, int numberOfFins) {
        super(name, typeOfEye);
        this.numberOfFins = numberOfFins;
    }

    public int getNumberOfFins() {
        return numberOfFins;
    }

    public void setNumberOfFins(int numberOfFins) {
        this.numberOfFins = numberOfFins;

    }

    @Override
    public String toString() {
        return "Fish{" +
                "numberOfFins=" + numberOfFins +
                ", name='" + name + '\'' +
                ", typeOfEye=" + typeOfEye +
                '}';
    }

    @Override
    public void move() {
        System.out.println("Fish swim...");
    }

    @Override
    void communicateTwo() {

    }
}
