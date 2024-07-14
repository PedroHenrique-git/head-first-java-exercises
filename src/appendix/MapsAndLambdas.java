package appendix;

import java.util.HashMap;
import java.util.Map;

public class MapsAndLambdas {
    public static void main(String[] args) {
        Map<String, String> boatsCoordinates = new HashMap<>();

        boatsCoordinates.computeIfAbsent("boatOne", (_boat) -> "A1");
        boatsCoordinates.computeIfPresent("boatOne", (key, value) -> key + " " + value);

        //if(boatsCoordinates.get("boatOne") == null) {
            //boatsCoordinates.put("boatOne", "A1");
        //}

        System.out.println(boatsCoordinates.keySet() + " " + boatsCoordinates.values());
    }
}
