package rihards.food;

public class Cookies extends Food {
    private String topping;

    Cookies(String name, String topping, int size, int calories) {
        super(name, size, calories);
        this.topping = topping;
    }

    public void serve() {
        System.out.println("Cookies.serve() method called!");
    }

    public void taste() {
        if(isReady()) {
            System.out.println("Mmmm.. These cookies are delicious!");
        } else {
            System.out.println("Yumm.. Even the cookie dough is delicious!");
        }
    }

}
