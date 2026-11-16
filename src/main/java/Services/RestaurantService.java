package Services;

import Entity.Restaurant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RestaurantService {
    public List<Restaurant> getAll() throws SQLException {
        List<Restaurant> restaurants = new ArrayList<>();
        String sql = "SELECT * FROM restaurants";

        try (Connection con = new ConnectServices().myConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Restaurant restaurant = new Restaurant();
                restaurant.setRestaurant_id(rs.getInt("restaurant_id"));
                restaurant.setRestaurant_name(rs.getString("restaurant_name"));
                restaurant.setPhone(rs.getString("phone"));
                restaurant.setEmail(rs.getString("email"));
                restaurant.setAddress(rs.getString("address"));
                restaurant.setDistrict(rs.getString("district"));
                restaurant.setCity(rs.getString("city"));
                restaurant.setLatitude(rs.getString("latitude"));
                restaurant.setLongitude(rs.getString("longitude"));
                restaurant.setCuisine_type(rs.getString("cuisine_type"));
                restaurant.setAvg_price_per_couple(rs.getBigDecimal("avg_price_per_couple"));
                restaurant.setRomantic_rating(rs.getBigDecimal("romantic_rating"));
                restaurant.setStatus(rs.getString("status"));
                restaurants.add(restaurant);
            }
        }

        return restaurants;
    }
}
