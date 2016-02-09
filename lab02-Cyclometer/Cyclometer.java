//JohnDerek Daniels
//Feb.5 2016
//CSE 002 Sect.111
//The program is used to record the time and number of rotations of a bike wheel
public class Cyclometer{
    public static void main(String[] args){
        int secsTrip1=480; //time for trip 1 in seconds
        int secsTrip2=3220; //time for trip 2 in seconds
        int countsTrip1=1561; //number of rotations for trip 1
        int countsTrip2=9037; //number of rotations for trip 2
        double wheelDiameter=27.0, 
        PI=3.14159, //value of pi
        feetperMile=5280, //coversion
        inchesperFoot=12, //conversion
        secondsperMinute=60; //conversion
        double distanceTrip1, distanceTrip2,totalDistance;
        System.out.println("Trip 1 took "+(secsTrip1/secondsperMinute)+" minutes and had "+
        countsTrip1+" counts.");
        System.out.println("Trip 2 took "+(secsTrip2/secondsperMinute)+
        " minutes and had "+ countsTrip2+" counts.");
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        distanceTrip1/=inchesperFoot*feetperMile;
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesperFoot/feetperMile;
        totalDistance=distanceTrip1+distanceTrip2;
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
        
    }
}