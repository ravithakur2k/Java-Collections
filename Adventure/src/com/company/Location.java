package com.company;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String direction;
    private final Map<String, Integer> exits;

    public Location(int locationID, String direction) {
        this.locationID = locationID;
        this.direction = direction;
        this.exits = new HashMap<String, Integer>();
        this.exits.put("Q",0);
    }

    public void addExit(String direction, Integer location){
        this.exits.put(direction,location);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDirection() {
        return direction;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
