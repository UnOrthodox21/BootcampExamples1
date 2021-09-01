package rihards.food;

public class FoodMain {

    public static void main(String[] args) {

//     Can't create an instance/object of an abstract class (An object can't be abstract, only a class can)
//     abstract classes != concrete classes
//     Food food = new Food("Generic food", 150, 320);


//      Can create instances/objects of these concrete classes
        Cookies cookies = new Cookies("Choco chip", "Choco sprinkles", 150, 700);
        cookies.taste();
        cookies.cook();
        cookies.taste();

        Pasta pasta = new Pasta("Italian Favorite", "Ravioli", "Garlic", 200, 580);
        pasta.taste();
        pasta.cook();
        pasta.taste();

    }
}
