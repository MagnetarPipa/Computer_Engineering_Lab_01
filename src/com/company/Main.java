package com.company;


import java.util.HashMap;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Введите число в 16 системе исчисления,числа могут быть от 0 до 9," +
                "остальные надо вести с помощью шести букв алфавита от A до F");


        String number = scanner.nextLine().toUpperCase();

        if (number.matches("^[-+]?[0-9A-F]+[.,]?[0-9A-F]*$")) {

            System.out.println("Перевод с помощью встроенных функций джавы : " + Integer.toBinaryString(Integer.parseInt(number, 16)));
            System.out.println("Прямой перевод с 16 в двоичную : " + Hex_To_Binary(number));

        } else {
            System.out.println("Введено не шестнадцатеричное число");
        }

    }


    public static String Hex_To_Binary(String str) {

        char[] chars;
        chars = str.toCharArray();
        String binNumber = "";


        HashMap<String, String> map = new HashMap<>();
        map.put("0", "0000");
        map.put("1", "0001");
        map.put("2", "0010");
        map.put("3", "0011");
        map.put("4", "0100");
        map.put("5", "0101");
        map.put("6", "0110");
        map.put("7", "0111");
        map.put("8", "1000");
        map.put("9", "1001");
        map.put("A", "1010");
        map.put("B", "1011");
        map.put("C", "1100");
        map.put("D", "1101");
        map.put("E", "1110");
        map.put("F", "1111");

        for (int i = 0; i < chars.length; i++) {

            binNumber += map.get(chars[i] + "");
        }
        return binNumber;
    }

}


