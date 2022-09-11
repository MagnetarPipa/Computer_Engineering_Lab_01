package com.company;


import java.util.HashMap;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Введите число в 16 системе исчисления,числа могут быть от 0 до 9," +
                "остальные надо вести с помощью шести букв алфавита от A до F");


        String number = scanner.nextLine().toUpperCase();

        if (number.matches("^[-+]?[0-9A-F]+[.,]?[0-9A-F]*$")) { // Тут у мен ябыла проблема с тем что я пытался через == сравнить char и стринг(""),а надо с чаром('')

            System.out.println("Перевод с помощью встроенных функций джавы : " + Integer.toBinaryString(Integer.parseInt(number, 16)));
            System.out.println("Из 16-ричной в десятичную и с ней в двоичную : " + Hex_To_Decimal(number));
            System.out.println("Прямой перевод с 16 в двоичную : " + Hex_To_Binary(number));

        } else {
            System.out.println("Введено не шестнадцатеричное число");
        }

    }

    public static String Hex_To_Decimal(String str) {

        char[] chars;
        chars = str.toCharArray();
        String binNumber = "";


        HashMap<String, String> pomogite = new HashMap<>();
        pomogite.put("0", "0");
        pomogite.put("1", "1");
        pomogite.put("2", "2");
        pomogite.put("3", "3");
        pomogite.put("4", "4");
        pomogite.put("5", "5");
        pomogite.put("6", "6");
        pomogite.put("7", "7");
        pomogite.put("8", "8");
        pomogite.put("9", "9");
        pomogite.put("A", "10");
        pomogite.put("B", "11");
        pomogite.put("C", "12");
        pomogite.put("D", "13");
        pomogite.put("E", "14");
        pomogite.put("F", "15");

        for (int i = 0; i < chars.length; i++) {

            binNumber += pomogite.get(chars[i] + "");
        }
        return binNumber;
    }


    public static String Decimal_To_Binary(String str) {


        return str;
    }

    public static String Hex_To_Binary(String str) {

        char[] chars;
        chars = str.toCharArray();
        String binNumber = "";


        HashMap<String, String> pomogite = new HashMap<>();
        pomogite.put("0", "0000");
        pomogite.put("1", "0001");
        pomogite.put("2", "0010");
        pomogite.put("3", "0011");
        pomogite.put("4", "0100");
        pomogite.put("5", "0101");
        pomogite.put("6", "0110");
        pomogite.put("7", "0111");
        pomogite.put("8", "1000");
        pomogite.put("9", "1001");
        pomogite.put("A", "1010");
        pomogite.put("B", "1011");
        pomogite.put("C", "1100");
        pomogite.put("D", "1101");
        pomogite.put("E", "1110");
        pomogite.put("F", "1111");

        for (int i = 0; i < chars.length; i++) {

            binNumber += pomogite.get(chars[i] + "");
        }
        return binNumber;
    }

}




 /*
        if ("0".equals(binNumber)) {
            return "0000";
        } else if ("1".equals(binNumber)) {
            return "0001";
        } else if ("2".equals(binNumber)) {
            return "0010";
        } else if ("3".equals(binNumber)) {
            return "0011";
        } else if ("4".equals(binNumber)) {
            return "0100";
        } else if ("5".equals(binNumber)) {
            return "0101";
        } else if ("6".equals(binNumber)) {
            return "0110";
        } else if ("7".equals(binNumber)) {
            return "0111";
        } else if ("8".equals(binNumber)) {
            return "1000";
        } else if ("9".equals(binNumber)) {
            return "1001";
        } else if ("A".equals(binNumber)) {
            return "1010";
        } else if ("B".equals(binNumber)) {
            return "1011";
        } else if ("C".equals(binNumber)) {
            return "1100";
        } else if ("D".equals(binNumber)) {
            return "1101";
        } else if ("E".equals(binNumber)) {
            return "1110";
        } else if ("F".equals(binNumber)) {
            return "1111";
        }
        System.out.println(binNumber);
        return "";*/
