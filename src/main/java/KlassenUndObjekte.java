public class KlassenUndObjekte {

    public static void main(String[] args) {

        Drink myDrink = new Drink("Mate","Wasser, Zucker. Kräutermischung" , "5865164", true);


        Drink floriansDrink = new Drink("Wasser", "Wasser", "0815", true);
        floriansDrink.name = "Wasser";
        floriansDrink.ingredients = "Wasser";
        floriansDrink.ean = "0815";
        floriansDrink.inStock = true;


        System.out.println(floriansDrink.ingredients);

    }
}
