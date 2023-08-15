package com.graysan;

//Inner
public class Country {

    // Field
    private String countryName;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    // Inner Class
    public static class City {
        private String cityName;

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }
    }

    public static void main(String[] args) {
        Country country = new Country();
        country.setCountryName("Türkiye");

        City city = new City();
        city.setCityName("Kilis");

        System.out.println(country.getCountryName() + " " + city.getCityName());
    }

}
