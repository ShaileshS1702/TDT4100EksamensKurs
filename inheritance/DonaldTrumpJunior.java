package inheritance;

public class DonaldTrumpJunior extends DonaldTrumpSenior{
    
    public DonaldTrumpJunior() {
        // Donald Trump junior inherits from his father but his name has a different suffix
        super(); // This is a call to the constructor of the superclass
        suffix = "Junior";
    }

    // This method displayes polymorphism, in polymorphism we can overwrite 
    // An inherited method from the superclass to perform different tasks in the 
    // subclass
    @Override
    public void warCrimes(){
        System.out.println("I am a war criminal");
    }


    public static void main(String[] args) {
        DonaldTrumpJunior donald = new DonaldTrumpJunior();
        System.out.println(donald.getName());
        donald.warCrimes();
    }
}
