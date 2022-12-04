import java.util.Arrays;

public class Farm {
    private String FarmName;
    private String owner;
    private Cow[] cow;
    private Sheep[] sheep;
    private House[] house;


    public Farm(String farmName, String owner, Cow[] cow, Sheep[] sheep, House[] house) {
        FarmName = farmName;
        this.owner = owner;
        this.cow = cow;
        this.sheep = sheep;
        this.house = house;
    }

    public Farm() {
    }

    @Override
    public String toString() {
        return "Farm{" +
                "FarmName='" + FarmName + '\'' +
                ", owner='" + owner + '\'' +
                ", cow=" + Arrays.toString(cow) +
                ", sheep=" + Arrays.toString(sheep) +
                ", horse=" + Arrays.toString(house) +
                '}'+super.toString();
    }
}
