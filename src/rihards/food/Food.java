package rihards.food;

// Abstract classes cannot be instantiated and are designed to be subclassed.
// They are used to provide some common functionality across a set of related classes
// while also allowing default method implementations.

// If we simply created a concrete class for Food, it would quickly become convoluted for a couple reasons:
// Some of our class fields don’t make sense for certain Foods (Cookies don't need a Sauce)
// Some methods may also need to check the food type before executing specific logic.


// Moreover, if the restaurant introduced a new food type, we would need to modify this class.
// This is a violation of the Open/Closed principle of SOLID. - The Open–closed principle:
// "Software entities ... should be open for extension, but closed for modification.
// This way we can easily extends the functionality without breaking other things


// A cleaner solution is to implement a base abstract class called Food and subclass the different types.
// When it’s time to add a new food type, we don’t need to touch the Food class at all.
// We would simply create a new subclass that extends Food.


public abstract class Food {
    private String name;
    int size;
    int calories;
    private boolean ready;

    public Food(String name, int size, int calories) {
        this.name = name;
        this.size = size;
        this.calories = calories;
        this.ready = false;
    }

    public void cook() {
        if(!ready) {
            System.out.println(name + " cooked and now is ready to eat!");
            ready = true;
        } else {
            System.out.println(name + " is already cooked and ready to eat!");
        }
    }

//    public abstract void serve();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }
}
