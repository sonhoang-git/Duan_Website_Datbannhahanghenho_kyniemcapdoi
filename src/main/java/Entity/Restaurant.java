package Entity;

import java.math.BigDecimal;

public class Restaurant {
    private int restaurant_id;
    private String restaurant_name;
    private String phone;
    private String email;
    private String address;
    private String district;
    private String city;
    private String latitude;
    private String longitude;
    private String cuisine_type;
    private BigDecimal avg_price_per_couple;
    private BigDecimal romantic_rating;
    private String status;

    public Restaurant(int restaurant_id, String restaurant_name, String phone, String email, String address, String district, String city, String latitude, String longitude, String cuisine_type, BigDecimal avg_price_per_couple, BigDecimal romantic_rating, String status) {
        this.restaurant_id = restaurant_id;
        this.restaurant_name = restaurant_name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.district = district;
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
        this.cuisine_type = cuisine_type;
        this.avg_price_per_couple = avg_price_per_couple;
        this.romantic_rating = romantic_rating;
        this.status = status;
    }

    public Restaurant() {
    }

    public int getRestaurant_id() {
        return restaurant_id;
    }

    public void setRestaurant_id(int restaurant_id) {
        this.restaurant_id = restaurant_id;
    }

    public String getRestaurant_name() {
        return restaurant_name;
    }

    public void setRestaurant_name(String restaurant_name) {
        this.restaurant_name = restaurant_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getCuisine_type() {
        return cuisine_type;
    }

    public void setCuisine_type(String cuisine_type) {
        this.cuisine_type = cuisine_type;
    }

    public BigDecimal getAvg_price_per_couple() {
        return avg_price_per_couple;
    }

    public void setAvg_price_per_couple(BigDecimal avg_price_per_couple) {
        this.avg_price_per_couple = avg_price_per_couple;
    }

    public BigDecimal getRomantic_rating() {
        return romantic_rating;
    }

    public void setRomantic_rating(BigDecimal romantic_rating) {
        this.romantic_rating = romantic_rating;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
