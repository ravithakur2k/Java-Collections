package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static  Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0,"Sitting in front of Computer"));
        locations.put(1, new Location(1,"Standing at the end of road"));
        locations.put(2, new Location(2,"Top of Hill"));
        locations.put(3, new Location(3,"Inside a building"));
        locations.put(4, new Location(4,"Valley beside a stream"));
        locations.put(5, new Location(5,"You are in a forest"));

        locations.get(1).addExit("W",2);
        locations.get(1).addExit("E",3);
        locations.get(1).addExit("S",4);
        locations.get(1).addExit("N",5);
//        locations.get(1).addExit("Q",0);

        locations.get(2).addExit("N",5);
//        locations.get(2).addExit("Q",0);

        locations.get(3).addExit("W",1);
//        locations.get(3).addExit("Q",0);

        locations.get(4).addExit("N",1);
        locations.get(4).addExit("W",2);
//        locations.get(4).addExit("Q",0);

        locations.get(5).addExit("S",1);
        locations.get(5).addExit("W",2);
//        locations.get(5).addExit("Q",0);

        Map<String, String> vocab = new HashMap<String, String>();
        vocab.put("QUIT","Q");
        vocab.put("SOUTH","S");
        vocab.put("NORTH","N");
        vocab.put("EAST","E");
        vocab.put("WEST","W");

        int loc = 1;
        while(true){
                System.out.println(locations.get(loc).getDirection());
            if(loc == 0){
                break;
            }

            Map<String,Integer> exits = locations.get(loc).getExits();
            System.out.println("Available exits are ");
            for(String exit: exits.keySet()){
                System.out.print(exit+",");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            if(direction.length() > 1){
                String[] words = direction.split(" ");
                for(String word: words){
                    if(vocab.containsKey(word)){
                        direction = vocab.get(word);
                        break;
                    }
                }
            }
            if(exits.containsKey(direction)){
                loc = exits.get(direction);
            }else{
                System.out.println("You cannot go in that direction");
            }

        }

    }

}
