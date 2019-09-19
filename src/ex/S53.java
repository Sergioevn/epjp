package ex;

public class S53 {
    /**
     * Average speed
     * 
     * @param distance in meters
     * @param time     in seconds
     * @return speed in meters per second
     */
	
    public static double speed(double distance, double time) {
       
    double s= distance/time	;
        return s;
    }

    /**
     * Distance between (x0, y0) and (x1, y1)
     * 
     * @param x0 first point x
     * @param y0 first point y
     * @param x1 second point x
     * @param y1 second point y
     * @return distance
     */
    public static double distance(int x0, int y0, int x1, int y1) {
       
    	int dist1 = Math.abs(x0-x1);
    	int dist2 = Math.abs(y0-y1)	;	
        return Math.sqrt(Math.abs((dist1*dist1)+(dist2*dist2)));
    }

    /**
     * Engine capacity
     * 
     * @param bore in mm
     * @param stroke in mm
     * @param nr     number of cylinders
     * @return the engine capacity in cm^3
     */
    public static double engineCapacity(double bore, double stroke, int nr) {
      
    	double var1 = Math.pow(bore/2, 2);
        return  (Math.PI*stroke*nr*var1)/1000;
    }

    // somma delle cifre in un numero
    /**
     * Add up all the digits in an integer
     * 
     * @param value
     * @return sum of digits
     */
    public static int digitSum(int value) {
        // TODO
    	int sum = 0;
    		while (Math.abs(value)>0) {sum= sum + Math.abs(value)%10;
    			value= Math.abs(value)/10;}
        return Math.abs(sum); 
    }
}
