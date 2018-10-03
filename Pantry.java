package pantry;

/**
 *
 * @author Owner
 */
public class Pantry {
    
    //Private Jam objects that will be used by the methods and constructors
    private Jam a, b, c;
    
    //Constructor that creates a pantry object and takes 3 Jam objects as parameters for the jam stored in that pantry
    public Pantry(Jam d, Jam e, Jam f){
        
        a = d;
        b = e;
        c = f;
    
    }
    
    //Method that displays the information of all the jams stored in the pantry
    public void displayPantry(){
    
        System.out.println("1: " + a.jamInfo());
        System.out.println("2: " + b.jamInfo());
        System.out.println("3: " + c.jamInfo());
    
    }
    
    //Method that takes 2 int values as the input for the jam number and amount of jam that the customer wishes to spread
    public void spreadJamJar(int jamNum, int amountSpread){
        
        switch (jamNum) {
            case 1:
                a.spreadJam(amountSpread);
                break;
            case 2:
                b.spreadJam(amountSpread);
                break;
            default:
                c.spreadJam(amountSpread);
                break;
        }
        
    }
}