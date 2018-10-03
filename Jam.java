package pantry;

public class Jam {
    
    private String jamType;
    private int ouncesJam;
    private int cannedDay, cannedMonth, cannedYear;
    
    public Jam (String name, int amount, int day, int month, int year){
        
        jamType = name;
        ouncesJam = amount;
        cannedDay = day;
        cannedMonth = month;
        cannedYear = year;
        
    }
    
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
    
    private boolean isEmpty(){
        return this.ouncesJam == 0;
    }
    
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
