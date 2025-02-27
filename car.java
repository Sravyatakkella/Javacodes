class car{
//creating the attributes requires for the classs
String car_name,car_color,car_brand,fule_type;
int maleage;
//constructor
car(String car_name,String car_color,String car_brand,String fule_type,int maleage){
this.car_name=car_name;
this.car_color=car_color;
this.car_brand=car_brand;
this.fule_type=fule_type;
this.maleage=maleage;
}

//creating the methods forte class

public void start(){
System.out.println("this is start statement: "+car_name+"  "+car_color);
}

public void stop(){
System.out.println("this is start statement: "+car_brand+"  "+fule_type);
}

public void services(){
System.out.println("this is start statement: "+maleage);
}

public static void main(String[] args){
//creating the object for the class
car car1=new car("Model S";"navy blue";"Tesla";"Electric";"500");
car1.start();
car car2=new car("5 Series";"black";"BMW";"petrol"; "25");
car2.stop();
car car3=new car("CClass";"navy blue";"Mercedes Benz";"petrol"; "20");
car3.services();

System.out.println("\n THANK YOU FOR APPLYING THIS");
}
}