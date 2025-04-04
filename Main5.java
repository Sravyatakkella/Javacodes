class Vehicle {
    public void displayinfo() {
        System.out.println("Vehicle display info");
    }
}
class Car extends Vehicle {
    @Override
    public void displayinfo() {
        System.out.println("BMW is known for their superior engineering, innovative technology, luxurious comfort, and impressive resale value. BMW was founded in 1916. All BMW hatchbacks excel when it comes to low emissions and fuel efficiency.");
    }
}
class Main5 {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        Car myCar = new Car();
        myVehicle.displayinfo();
        myCar.displayinfo(); 
    }
}

