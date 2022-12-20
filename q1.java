import java. util. Scanner;

 abstract class Vehicle{
     abstract void vehicleType();
    abstract void vehicleColour();
    abstract void NumberOfAirbags();
    abstract void VehicleNumber();
    abstract void Mileage();
}
interface Safety{
    void rating();
}
interface Seats{
    void numberOfSeats();
    void seatType();
}
abstract class Car extends Vehicle{
   abstract void vehicleType();
}
class CustomCar extends Car implements Safety,Seats{
    public void vehicleColour(){
        System.out.println("white");
    }
    public void rating(){
        System.out.println("5/5");
    }
    public void numberOfSeats(){
        System.out.println("7");
        
    }
    public void seatType(){
        System.out.println("leather");
    }
    public void vehicleType(){
        System.out.println("The vehicle is 4 wheeler and Runs on diesel");
    }
    public void NumberOfAirbags(){
        System.out.println("7");
    }
    public void VehicleNumber(){
        System.out.println("Your vehicle Number is AP39KZ9999");
    }
    public void Mileage(){
        System.out.println("your average vehicle Mileage is 12 KM/L");
    }
}
abstract class bike extends Vehicle{
    abstract void vehicleType();
}
class CustomBike extends bike implements Safety,Seats{
    public void vehicleColour(){
        System.out.println("Geny Gray Metallic");
    }
    public void rating(){
        System.out.println("4/5");
    }
    public void numberOfSeats(){
        System.out.println("2");    
    }
    public void seatType(){
        System.out.println("sponge with leather covered");
    }
    public void vehicleType(){
        System.out.println("The vehicle is 2 wheeler and Runs on petrol");
    }
    public void NumberOfAirbags(){
        System.out.println("1");
    }
    public void VehicleNumber(){
        System.out.println("Your vehicle Number is AP04AQ3333");
    }
    public void Mileage(){
        System.out.println("your average vehicle Mileage is 50 KM/L");
    }

}
abstract class lorry extends Vehicle{
    abstract void vehicleType();
}
class customLorry implements Safety,Seats{
    public void vehicleColour(){
        System.out.println("Silver");
    }
    public void rating(){
        System.out.println("4/5");
    }
    public void numberOfSeats(){
        System.out.println("3");    
    }
    public void seatType(){
        System.out.println("leather");
    }
    public void vehicleType(){
        System.out.println("The vehicle is 6 wheeler and Runs on diesel");
    }
    public void NumberOfAirbags(){
        System.out.println("0");
    }
    public void VehicleNumber(){
        System.out.println("Your vehicle Number is AP04OH4005");
    }
    public void Mileage(){
        System.out.println("your average vehicle Mileage is 3.5 KM/L");
    }


}

class q1 {
    public static void main(String[] args) {
       
        System.out.println("SELECT THE VEHICLE \n 1)CAR \n 2)BIKE \n 3)LORRY");
        Scanner scan =new Scanner(System.in);
        int n = scan.nextInt();
        if(n==1){
            CustomCar innova = new CustomCar();
            System.out.println("Select which information you want related to Car \n 1)vehicleColour \n 2)rating \n 3)numberOfSeats \n 4)Seat type \n 5)vehicleType \n 6)NumberOfAirbags \n 7)VehicleNumber \n 8)Mileage \n 0 for exit");
            int k=scan.nextInt();
            while(k!=0){
                
                
            if(k==0){
                    System.exit(0);
            }
            if(k==1){
                innova.vehicleColour();
               
            }
            if(k==2){
                innova.rating();
                
            }
            if(k==3){
                innova.numberOfSeats();
                
            }
            if(k==4){
                innova.seatType();
                
            }
            if(k==5){
                innova.vehicleType();
                
            }
            if(k==6){
                innova.NumberOfAirbags();
                
            }
            if(k==7){
                innova.VehicleNumber();
                

            }
            if(k==8){
                innova.Mileage();
               
            }
            k=scan.nextInt();
        }
        }
        if(n==2){
            CustomBike HondaGlobal = new CustomBike();
            System.out.println("Select which information you want related to Bike \n 1)vehicleColour \n 2)rating \n 3)numberOfSeats \n 4)Seat type \n 5)vehicleType \n 6)NumberOfAirbags \n 7)VehicleNumber \n 8)Mileage \n 0 for exit");
            int k=scan.nextInt();
            while(k!=0){
               
            if(k==0){
                System.exit(0);
            }
            if(k==1){
                HondaGlobal.vehicleColour();
            }
            if(k==2){
                HondaGlobal.rating();
            }
            if(k==3){
                HondaGlobal.numberOfSeats();
            }
            if(k==4){
                HondaGlobal.seatType();
            }
            if(k==5){
                HondaGlobal.vehicleType();
            }
            if(k==6){
                HondaGlobal.NumberOfAirbags();
            }
            if(k==7){
                HondaGlobal.VehicleNumber();
            }
            if(k==8){
                HondaGlobal.Mileage();
            }
            k=scan.nextInt();
        }

        }
        if(n==3){
            customLorry Tata = new customLorry();
            System.out.println("Select which information you want related to Lorry \n 1)vehicleColour \n 2)rating \n 3)numberOfSeats \n 4)Seat type \n 5)vehicleType \n 6)NumberOfAirbags \n 7)VehicleNumber \n 8)Mileage \n 0 for exit");
            int k=scan.nextInt();
            while(k!=0){
              
           if(k==0){
                    System.exit(0);
            }
            if(k==1){
                Tata.vehicleColour();
            }
            if(k==2){
                Tata.rating();
            }
            if(k==3){
                Tata.numberOfSeats();
            }
            if(k==4){
                Tata.seatType();
            }
            if(k==5){
                Tata.vehicleType();
            }
            if(k==6){
                Tata.NumberOfAirbags();
            }
            if(k==7){
                Tata.VehicleNumber();
            }
            if(k==8){
                Tata.Mileage();
            }
            k=scan.nextInt();
        }

        }



        
       
    }
}