package TugasBuPasha;

public class car {
    //properti class
    int numDoors;
    boolean isElectric;

    public car()
{
    numDoors = 4;
    isElectric = false;
}    
    //constructor
    public car(String newMerk, int newMilespergalon, int newNumDoors, boolean newIsElectric) {
        this.numDoors = newNumDoors;
        this.isElectric = newIsElectric;
    }


    //method
    public void print() {
        System.out.println("Number of doors: " + numDoors);
        System.out.println("Is electric: " + isElectric);
    }

}
