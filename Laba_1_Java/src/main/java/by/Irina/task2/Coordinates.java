package main.java.by.Irina.task2;

public class Coordinates {
    public static boolean getResult(double x, double y){
        if( ( (x<=4 && x>=-4) && (y<=5 && y>=0) ) || ( (x<= 6 && x>=-6 )  && (y>-3 && y<=0) ) )
            return true;
        return false;
    }
}
