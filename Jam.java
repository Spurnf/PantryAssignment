package pantry;

public class Jam {
    
    //Instance Variables that store data about the jam 
    private String jamType;
    private int ouncesJam;
    private int cannedDay, cannedMonth, cannedYear;
    
    //Constructor that creates a jam object and takes no parameters as the default jam is set as Gooseberry 
    public Jam(){
        
        jamType = "Gooseberry";
        ouncesJam = 12;
        cannedDay = 4;
        cannedMonth = 7;
        cannedYear = 86;
        
    }
    
    //Constructor that creates a jam object that takes the information as parameters
    public Jam (String name, int amount, int day, int month, int year){
        
        jamType = name;
        ouncesJam = amount;
        cannedDay = day;
        cannedMonth = month;
        cannedYear = year;
        
    }
    
    //Method that spreads the jam and changes according to the user input (parameters)
    public void spreadJam(int amount){
        if(this.isEmpty()){
            System.out.println("No jam in the jar!");
        }
        else{
            if(amount > this.ouncesJam)
                amount = this.ouncesJam;
            
            this.ouncesJam -= amount;
            System.out.println("Spreading " + amount + " fluid ounces of " + this.jamType);
        }
    }
    
    //Helper method that returns a boolean value and checks to see if the jar is empty 
    private boolean isEmpty(){
        return this.ouncesJam == 0;
    }
    
    //Method that prints out the information related to the jam object 
    public String jamInfo(){
        return (this.jamType + "    " + this.cannedMonth + "/" + this.cannedDay + "/" + this.cannedYear + "    " + this.ouncesJam + " fl. oz.");
    }

    /**
     * @return the jamType
     */
    public String getJamType() {
        return jamType;
    }

    /**
     * @param jamType the jamType to set
     */
    public void setJamType(String jamType) {
        this.jamType = jamType;
    }

    /**
     * @return the ouncesJam
     */
    public int getOuncesJam() {
        return ouncesJam;
    }

    /**
     * @param ouncesJam the ouncesJam to set
     */
    public void setOuncesJam(int ouncesJam) {
        this.ouncesJam = ouncesJam;
    }

    /**
     * @return the cannedDay
     */
    public int getCannedDay() {
        return cannedDay;
    }

    /**
     * @param cannedDay the cannedDay to set
     */
    public void setCannedDay(int cannedDay) {
        this.cannedDay = cannedDay;
    }

    /**
     * @return the cannedMonth
     */
    public int getCannedMonth() {
        return cannedMonth;
    }

    /**
     * @param cannedMonth the cannedMonth to set
     */
    public void setCannedMonth(int cannedMonth) {
        this.cannedMonth = cannedMonth;
    }

    /**
     * @return the cannedYear
     */
    public int getCannedYear() {
        return cannedYear;
    }

    /**
     * @param cannedYear the cannedYear to set
     */
    public void setCannedYear(int cannedYear) {
        this.cannedYear = cannedYear;
    }
    
}
