package topic01.classes;



public class Time {

    private int hour;
    private int minute;
    private int second;
    
    //constructor overloading 
    
    public Time(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
        
    
    public Time(){
        //keyword this: is used to call the 3-argument constructor 
        this(0,0,0);
    }
    
    public Time(int hour){
        this(hour, 0, 0);       
    }

    public Time(int hour, int minute){
        this(hour, minute, 0);
    }
    
    //copy constructor: because it will copy all the attributes of t inside 
    //the attributes of the class
    public Time(Time t){
       this(t.hour, t.minute, t.second);
       
    }
    
    public void setHour (int hour){
        if ((hour>=0)&&(hour<24))
            this.hour=hour;
        else throw new IllegalArgumentException("hour is not correct");
    }
    
    public void setMinute (int minute){
        if ((minute>=0)&&(minute<60))
            this.minute=minute;
        else throw new IllegalArgumentException("minute is not correct");
    }
    
    public void setSecond (int second){
        if ((second>=0)&&(second<60))
            this.second=second;
        else throw new IllegalArgumentException("second is not correct");
    }

    public int getHour(){
        return hour;
    }
    
    public int getMinute(){
        return minute;
    }
    
    public int getSecond(){
        return second;
    }
    
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    } 
    
    //String representation of an object
    
    @Override //change the definition of the method
    public String toString(){
        return String.format("time: %02d:%02d:%02d", hour, minute, second);
    }
    
    
    
}
