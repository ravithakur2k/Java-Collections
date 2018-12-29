package com.company;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String,String> languages = new HashMap<>();
        if(languages.containsKey("Java")){
            System.out.println("Java is already present");
        }else{
            languages.put("Java","a compiled high level language, platform independent");
            System.out.println("Java Added Successfully");
        }
        languages.put("Java","a compiled high level language, platform independent");
        languages.put("Python","a interpreted , object oriented high level language with dynamic semantics");
        languages.put("Algol","a Algorithmic language");
        languages.put("BASIC","Beginners all purpose symbolic instruction code");
        languages.put("Lisp","Therein Lies madness");

        if(languages.containsKey("Java")){
            System.out.println("Java is already present");
        }else{
            languages.put("Java","this course is all bout java");
            System.out.println("Java Added Successfully");
        }

        System.out.println("===========================");

//        System.out.println(languages.remove("Lisp"));
        if(languages.remove("Algol","A family of algol")){
            System.out.println("Algol removed");
        }else{
            System.out.println("Algol Key value pair not found");
        }
        languages.replace("Lisp","Languages with imperative features");
        for(String key: languages.keySet()){
            System.out.println(key+" : "+languages.get(key));
        }
    }
}
