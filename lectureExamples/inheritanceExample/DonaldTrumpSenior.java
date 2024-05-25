package inheritanceExample;

// Donald Trump senior gives all protected attributes to his son through inheritance
// If Donald Trump senior dies he becomes an abstract class
public class DonaldTrumpSenior {
    protected String name = "Donald Trump";
    protected String suffix;
    protected int iq = 65;
    protected int money = 1000000000;

    public DonaldTrumpSenior() {
        suffix = "Senior";
    }

    public String getName() {
        return name + " " + suffix;
    }

    // This method displayes polymorphism, in polymorphism we can overwrite 
    // An inherited method from the superclass to perform different tasks in the 
    // subclass
    public void warCrimes(){
        System.out.println("I am not guilty of war crimes");
    }
    
    public static void main(String[] args) {
        DonaldTrumpSenior donald = new DonaldTrumpSenior();
        System.out.println(donald.getName());
    }
}

