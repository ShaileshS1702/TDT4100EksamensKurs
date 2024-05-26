package inheritanceExample;

public class DonaldTrumpJunior extends DonaldTrumpSenior implements President{
    
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
        System.out.println("I may or may not be a war criminal");
    }


    // Interface methods that we know all presidents must have
    @Override
    public void giveSpeech() {
        // TODO Auto-generated method stub
        System.out.println("Make America great again");
    }

    @Override
    public void signExecutiveOrder() {
        System.out.println("Pardon myself for january 6th insurrection");
    }

    @Override
    public void wageWar() {
        // TODO Auto-generated method stub
        System.out.println("Drone Strike on Iran");
    }


    public static void main(String[] args) {
        DonaldTrumpJunior donald = new DonaldTrumpJunior();
        System.out.println(donald.getName());
        donald.warCrimes();
    }

    @Override
    public void impeachment() {
        System.out.println("ooopsie");
    }

    @Override
    public void keepClassifiedDocumentsBeyondTerm() {
        // TODO Auto-generated method stub
        System.out.println("Teehee oopsie");
    }

}
