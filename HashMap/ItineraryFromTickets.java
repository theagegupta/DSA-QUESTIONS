
// import java.util.Collections;
import java.util.HashMap;

import java.util.HashSet;

class ItineraryFromTickets {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();

        hm.put("Chennai", "Bengaluru"); 
        hm.put("Mumbai", "Delhi"); 
        hm.put("Goa", "Chennai"); 
        hm.put("Delhi", "Goa"); 

        String start = ""; 
        HashSet<String> to = new HashSet<>();

        for(String key : hm.keySet())
        {
            to.add(hm.get(key)); 
        }

        for(String key : hm.keySet())
        {
            if(!to.contains(key))
            {
                start = key; 
            }
        }

        String path = start; 
        while(true)
        {
            if(hm.containsKey(start))
            {
                path = path + "->" + hm.get(start); 
            }
            
            else 
            {
                break; 
            }

            start = hm.get(start); 
        }
        
        System.out.println(path);
        // Itinerary = planed route or journey    
    }
}