package scr.MorningSession.Class911SOLID;
//Imagine a Cafeteria class that prepares food and also handles billing.
// Split these responsibilities into separate classes: FoodPreparation and Billing.
public class Cafeteria {
    FoodPreparation foodPreparation;
    Billing billing;

    public Cafeteria() {
        this.foodPreparation = new FoodPreparation();
        this.billing = new Billing();
    }
}

class FoodPreparation{
    public void preparation(){
        System.out.println("Food is ready");
    }
}

class Billing{
    public void billing(){
        System.out.println("here is your check");
    }
    public static void main(String[] args) {
        Cafeteria cafeteria = new Cafeteria();
        cafeteria.billing.billing();
        cafeteria.foodPreparation.preparation();


    }
}