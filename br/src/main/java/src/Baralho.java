package main.java.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Baralho {

    public List<String> cria_baralho() {
        Map<String, Integer> value = new TreeMap<>();
        value.put("2", 0);
        value.put("3", 0);
        value.put("4", 0);
        value.put("5", 0);
        value.put("6", 0);
        value.put("Q", 2);
        value.put("J", 3);
        value.put("K", 4);
        value.put("A", 11);
        value.put("7", 10);

        String[] nipes = { " Copas", " Espada", " Ouros", " Paus" };
        List<String> cartas = new ArrayList<String>();
        for (int i = 0; i < 4; i++) {
            for (String key : value.keySet()) {
                cartas.add(key + nipes[i]);
            }
        }

        return cartas;
    }

    public void cria_trunfo() {
        return;
    }

    public void distribui() {
        return;
    }
}