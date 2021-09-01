package rihards.food;

public class Pasta extends Food {
    private String type;
    private String sauce;

    Pasta(String name, String type, String sauce, int size, int calories) {
        super(name, size, calories);
        this.type = type;
        this.sauce = sauce;
    }

    public void serve() {
        System.out.println("Pasta.serve() method called!");
    }

    public void taste() {
        if(isReady()) {
            System.out.println("Mmmm.. This pasta is delicious!");
        } else {
            System.out.println("Yuck.. No one likes uncooked pasta... right?");
        }
    }

}
