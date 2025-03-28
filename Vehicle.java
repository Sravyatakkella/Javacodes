class Vehicle{
    String brand;
    int speed;
    Vehicle(String brand,int speed){
        this.brand=brand;
        this.speed=speed;
    }
    void Details(){
        System.out.println("Brand:"+brand);
        System.out.println("Speed:"+speed);
    }
}//End of super class

class CARS extends Vehicle{
    int doors;
    int capacity;
    public CARS(String brand,int speed,int doors,int capacity){
        super(brand, speed);
        this.doors=doors;
        this.capacity=capacity;
    }
    void cardetails(){
        System.out.println("Number of doors:"+doors);
        System.out.println("Capacity:"+capacity);
    }

}//End of car sub-class

class Bikes extends Vehicle{
    Boolean gears;
    Bikes(String brand,int speed,Boolean gears){
        super(brand, speed);
        this.gears=gears;
    }
    void bikedetails(){
        if (gears==true)
        System.out.println("This bike has gears.");
        else
        System.out.println("This bike does not have gear system.");
    }

}//End of bike sub-class

class Trucks extends Vehicle{
    int tons;
    Trucks(String brand,int speed,int tons){
        super(brand, speed);
        this.tons=tons;
    }
    void truckdetails(){
        System.out.println("The capacity of truck is: "+tons);
    }

}//End of truck sub-class
class Rent{
    public static void main(String[] args){
        CARS c=new CARS("Tayota",120,5,5);
        c.cardetails();
        c.Details();
        Bikes b=new Bikes("KTM",80,true);
        b.bikedetails();
        b.Details();
        Trucks t=new Trucks("TATA",100,1);
        t.truckdetails();
        t.Details();
    }
}