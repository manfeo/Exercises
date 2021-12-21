package com.company.ex27;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, String> people = new HashMap<>();
        System.out.println("Enter 5 surname + name");
        List<String> names = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String namePlusSurname = in.nextLine();
            String[] tokens = namePlusSurname.split(" ");
            String surname = tokens[0];
            String name = tokens[1];
            people.put(surname, name);
            names.add(name);
        }
        int counter = 0;
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            for (int j = 0; j < names.size(); j++)
                if (names.get(j).equals(name))
                    counter++;
            if (counter > 1) {
                delete(people, name);
                for (int j = 0; j < names.size(); j++)
                    if (names.get(j).equals(name))
                        names.remove(j);
            }
            counter = 0;
        }
        System.out.println("New map: ");
        for (Map.Entry<String, String> pair : people.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static void delete(HashMap<String, String> people, String name) {
        Iterator<Map.Entry<String, String>> newItr = people.entrySet().iterator();
        while (newItr.hasNext()) {
            Map.Entry<String, String> newEntry = newItr.next();
            if (newEntry.getValue().equals(name)) {
                System.out.println("Key : " + newEntry.getKey() + " Removed.");
                newItr.remove();
            }
        }
    }
}
