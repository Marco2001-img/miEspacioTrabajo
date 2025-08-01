package poo;

import java.util.HashMap;

public class Main {


	public static void main(String[] args) {
        HashMap<String, Integer> edades = new HashMap<>();
        edades.put("Ana", 25);
        edades.put("Luis", 30);

        System.out.println(edades.get("Ana"));  // 25
        System.out.println(edades.containsKey("Luis")); // true

	}

}
