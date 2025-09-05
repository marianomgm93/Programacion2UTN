import models.Atraccion;

import java.util.ArrayList;

public class Service {
    public static boolean disponible(Atraccion atraccion, ArrayList<Atraccion> arr){
        for(Atraccion a:arr){
            if(a.equals(atraccion)){
                return false;
            }
        }
        return true;
    }



}
