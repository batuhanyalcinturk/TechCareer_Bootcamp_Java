package com.graysan;

public class _08_String {

    public static void main(String[] args) {
        String kelime = "Java ÖGReniyorum Java ";
        System.out.println(kelime.length());
        System.out.println(kelime.trim().length());
        System.out.println(kelime.toLowerCase());
        System.out.println(kelime.toUpperCase());
        System.out.println(kelime.startsWith("J"));
        System.out.println(kelime.endsWith(" "));

        System.out.println(kelime.concat(" 44"));
        System.out.println(kelime.replace(kelime, "yeni kelime"));

        System.out.println(kelime.charAt(0));
        System.out.println(kelime.indexOf("Java"));
        System.out.println(kelime.lastIndexOf("Java"));
        System.out.println(kelime.substring(2));
        System.out.println(kelime.substring(2,7));
        System.out.println(kelime.isEmpty());
        System.out.println(kelime.hashCode());
        System.out.println(kelime.contains("Java2"));
    }
}
