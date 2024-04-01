package Classes;

public class Tools {
    private String name;
    private int weight;
    private String type;

    //Constructor
    public Tools(String name, int weight, String type) {
        this.name = name;
        this.weight = weight;
        this.type = type;
    }

    //Getter for all but, not setter bc not allow user to change color properties
    public String getName() { return name; }
    public int getWeight() { return weight; }
    public String getType() { return type; }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Weight: " + weight + "\n" +
                "Type: " + type;
    }
}
