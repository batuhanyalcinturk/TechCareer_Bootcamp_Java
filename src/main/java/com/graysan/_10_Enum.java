package com.graysan;

public enum _10_Enum {

    PAZAR,PAZARTESI,SALI,CARSAMBA,PERSEMBE,CUMA,CUMARTESI
}

class DenemeEnum{
    public static void main(String[] args) {
        String data = _10_Enum.PAZAR.toString();
        System.out.println(data);
        System.out.println(_10_Enum.CUMA.name());
        System.out.println(_10_Enum.CUMA.ordinal());
    }
}
