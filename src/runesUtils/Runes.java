package runesUtils;

import java.util.HashMap;

public class Runes {

    // FUTHARK ASOCIADO AL ABECEDARIO
    public HashMap<Character, Character> alphabet(){

        // ALFABETO
        HashMap<Character, Character> alphabet = new HashMap<>();

        // ASIGNAR VALORES
        alphabet.put('f','ᚠ'); // '\u16A0'
        alphabet.put('u','ᚢ'); // '\u16A2
        alphabet.put('t','ᚦ'); //'\u16A6'
        alphabet.put('a','ᚨ'); // '\u16A8'
        alphabet.put('r','ᚱ'); // '\u16B1'
        alphabet.put('k','ᚲ'); // '\u16B2'
        alphabet.put('v','ᚹ'); // '\u16B9'
        alphabet.put('g','ᚷ'); // '\u16B7'
        alphabet.put('w','ᚹ'); // '\u16B9'
        alphabet.put('h','ᚺ'); // '\u16BA'
        alphabet.put('n','ᚾ'); // '\u16BE'
        alphabet.put('i','ᛁ'); // '\u16C1'
        alphabet.put('j','ᛃ'); // '\u16C3'
        alphabet.put('y','ᛇ'); // '\u16C7'
        alphabet.put('p','ᛈ'); // '\u16C8'
        alphabet.put('z','ᛉ'); // '\u16C9'
        alphabet.put('s','ᛋ'); // '\u16CB'
        alphabet.put('b','ᛒ'); // '\u16D2'
        alphabet.put('e','ᛖ'); // '\u16D6'
        alphabet.put('m','ᛗ'); // '\u16D7'
        alphabet.put('l','ᛚ'); // '\u16DA'
        alphabet.put('o','ᛟ'); // '\u16DF'
        alphabet.put('d','ᛞ'); // '\u16DE'
        alphabet.put('c','ᚲ'); // '\u16B2'
        alphabet.put('q','ᚲ'); // '\u16B2'
        alphabet.put('x','ᛝ'); // '\u16DD'

        return alphabet;

    }

    // Mostrar runas y letras del abecedario
    public void showRunes() {

        // BUCLE PARA ITERAR EN HASMAP
        for (Character letra: alphabet().keySet()) {
            System.out.println("Letra: " + letra + "\tRuna: " + alphabet().get(letra));
        }
    }

    // TRADUCTOR
            public StringBuilder translate(String cadena, HashMap map) {

        StringBuilder traduccion = new StringBuilder();
        cadena = cadena.toLowerCase();

        // TRADUCIR CADENA OBTENIENDO CADA VALOR SEGUN CADA LETRA DE LA CADENA
        for (int letra = 0; letra < cadena.length(); letra++) {

            // SI LA LETRA NO ESTÁ
            if(!map.containsKey(cadena.charAt(letra))){
                System.out.println("El alfabeto rúnico no contiene la letra " + cadena.charAt(letra));
                break;
            }

            traduccion.append(map.get(cadena.charAt(letra)));
        }

        return traduccion;
    }

}
