package com.collections;

public class GenericsData<T> {

    private T adi;

    public T getAdi() {
        return adi;
    }

    public void setAdi(T adi) {
        this.adi = adi;
    }

    public GenericsData() {
        this.adi = adi;
    }

    public static void main(String[] args) {
        GenericsData genericsData = new GenericsData();
        genericsData.setAdi(23);
        System.out.println(genericsData.getAdi());
        genericsData.setAdi("Batu");
        System.out.println(genericsData.getAdi());
    }
}
