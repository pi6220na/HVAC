import java.util.Date;

/**
 * Created by Jeremy on 10/5/2016.
 * Service call to fix Hot Water Heater
 */
public class WaterHeater extends ServiceCall{

    private static final double CITYFEE = 20.0;
    private double heaterAge;

    public WaterHeater(String serviceAddress, String problemDescription, Date date, double heaterAge) {

        super(serviceAddress, problemDescription, date);

        this.heaterAge = heaterAge;
    }

    public double getHeaterAge() {
        return heaterAge;
    }

    public void setHeaterAge(double heaterAge) {
        this.heaterAge = heaterAge;
    }

    @Override
    public String toString() {

        //These statements use the Java ternary operator
        //This says "if resolvedDate == null, then set resolvedDate to "Unresolved". Otherwise, set resolvedDate to resolvedDate.toString()
        //Same logic as an if-else statment, but more consise if the condition is simple and the if statment's task is
        //to set the value of a variable based on a condition being true or false.
        String resolvedDateString = ( resolvedDate == null) ? "Unresolved" : this.resolvedDate.toString();
        String resolutionString = ( this.resolution == null) ? "Unresolved" : this.resolution;
        String feeString = (fee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString(fee);
        String cityString = (fee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString(CITYFEE);


        return "Hot Water Heater Service Call " + "\n" +
                "Service Address= " + serviceAddress + "\n" +
                "Problem Description = " + problemDescription  + "\n" +
                "Water Heater Age = " + heaterAge + "\n" +
                "Reported Date = " + reportedDate + "\n" +
                "Resolved Date = " + resolvedDateString + "\n" +
                "Resolution = " + resolutionString + "\n" +
                "Fee = " + feeString + "\n" +
                "City Fee =  " + cityString ;
    }

}
