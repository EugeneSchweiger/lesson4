package Task_5;

public class vehicle {
    private String name;
    private int maxSpeed;
    private int pasangersCapacity;
    private int fuelConsumption;
    public void pp(){
        System.out.println("**************************");
    }
    public void printInfo(){
        System.out.println("maxSpeed="+maxSpeed);
        System.out.println("name="+name);
        System.out.println("passangers capacity="+pasangersCapacity);
        System.out.println("fuelConsumption="+fuelConsumption);
        pp();
    }
    public  void Ride() {
        System.out.println("We are moving");
    }
    public void setName(String newName)
    {
        name=newName;
//        System.out.println("Name was changed to:"+name);
    }
    public void setMaxSpeed(int newMaxSpeed){
        maxSpeed=newMaxSpeed;
    }
    public void setPasangersCapacity(int newPasangersCapacity){
        pasangersCapacity=newPasangersCapacity;
    }
    public void setFuelConsumption(int newFuelConsumption){
        fuelConsumption=newFuelConsumption;
    }
    public String getName(){return name;}
    public int getMaxSpeed(){return maxSpeed;}
    public int getPasangersCapacity(){return pasangersCapacity;}
    public int getFuelConsumption(){return fuelConsumption;}
}
