package Builder;

public class Client {
     public static void main(String[] args){
        ApartmentBuilder builder = new ApartmentBuilder();

        Apartment ap1 = builder
        .setSqm(25)
        .setRooms(2)
        .setCity("London")
        .setArea("BLAH")
        .setKitchen(true)
        .build();
        ap1.display();

        Apartment ap2 = builder
        .setSqm(25)
        .setRooms(30)
        .setCity("Long Beach")
        .build();
        ap2.display();
     }
}