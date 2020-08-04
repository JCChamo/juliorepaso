package Stringbuilder;

import java.util.Arrays;

public class ClaseString {

    public static void main(String[] args) {
        String s1 = "Hola mundo";
        String s2 = "ADIOS mundo";
        String s3 = new String("HoLa mundo");
        String s4 = "adios mundo";
        String s5 = "ADIOS MUNDO";


//        System.out.println(s1.equals(s3));
//        System.out.println(s1 == s3);
//        System.out.println(s2.equalsIgnoreCase(s4));
//        System.out.println(s2.compareTo(s4));
//        System.out.println(s1.compareTo(s2));
//        System.out.println(s2.compareTo(s1));
//        System.out.println(s1.compareTo(s3));
//        System.out.println(s1.compareTo(s1));
//        System.out.println(s4.compareTo(s5));
//        System.out.println(s4.compareToIgnoreCase(s5));
//        System.out.println(s1.regionMatches(1, s3, 1, 3));
//        System.out.println(s1.regionMatches(true, 1, s3, 1, 3));
//        System.out.println(s1.startsWith("Ho"));
//        System.out.println(s1.endsWith("dos"));

        String str1 = "PAJARO";
        String str2 = "volador";

//        System.out.println(str1.charAt(3));
//        //System.out.println(str1.charAt(6));
//        System.out.println(str1.concat(str2));
//        System.out.println(str1 + " " + str2);
//
//        System.out.println(str1.substring(2));
//        System.out.println(str1.substring(2, str1.length()-2).concat("jajaja"));
//
//        System.out.println(str1.toLowerCase());
//        System.out.println(str2.toUpperCase());
//
//        String str3 = " futbol ";
//        System.out.println(str3);
//        System.out.println(str3.trim());
//        System.out.println(str3.replace('u', 'e'));
//        System.out.println(str3.replace("ut", "eb"));
//        System.out.println(str1.toLowerCase().replaceFirst("a", "o"));
//        System.out.println(str1.replaceAll("A", "o"));
//
//        String str4 = "32435-23435-2343-23";
//        System.out.println(Arrays.toString(str4.split("-", 0)));
//        for (int i = 0; i < str4.length(); i++) {
//            String[] str5 = str4.split("-");
//            if (i < str5.length)
//                System.out.println(str5[i]);
//        }
        System.out.println("---------");
        String a = "esternocleidomastoideo";
        System.out.println(a.indexOf('e', 2));
        System.out.println(a.indexOf("masto"));
        System.out.println(a.indexOf("MASTO"));
        System.out.println(a.lastIndexOf('i'));
        System.out.println(a.lastIndexOf('i', 17));
        System.out.println(a.lastIndexOf("eido"));
        String str = new String(new char[]{95, 88, 115, 75, 150});
        System.out.println(str);
        String str8 = new String(new char[ ]{'J', 'a', 'v', 'a'});
        System.out.println(str8);

        char paco = 'a';
        Character paco2 = 'p';
        Character paco3 = '7';
        Character paco4 = '-';
        System.out.println(paco2.charValue());
        System.out.println(paco2.compareTo(paco));
        String str9 = new String(new char[]{15});
        System.out.println(str9);
        System.out.println(paco2.equals(paco));
        System.out.println(Character.isDigit(paco));
        System.out.println(Character.isDigit(paco3));
        System.out.println(Character.isLetterOrDigit(paco3));
        System.out.println(Character.isLetterOrDigit(paco4));
        System.out.println("----------");
        System.out.println(Character.isLowerCase(paco2));
        System.out.println(Character.isUpperCase(paco2));
        System.out.println(Character.toUpperCase(paco2));
        System.out.println(paco2);
        System.out.println(Character.toLowerCase(paco2));

    }
}
