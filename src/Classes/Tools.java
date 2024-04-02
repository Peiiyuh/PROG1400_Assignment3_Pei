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

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Weight: " + weight + "\n" +
                "Type: " + type;
    }
}
