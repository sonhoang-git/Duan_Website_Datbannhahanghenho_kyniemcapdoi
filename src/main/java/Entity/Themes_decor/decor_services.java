package Entity.Themes_decor;

public class decor_services {
    private int service_id;
    private String service_code;
    private String service_name;
    private String category;
    private float unit_price;

    public decor_services(int service_id, String service_code, String service_name, String category, float unit_price) {
        this.service_id = service_id;
        this.service_code = service_code;
        this.service_name = service_name;
        this.category = category;
        this.unit_price = unit_price;
    }

    public decor_services() {
    }

    public int getService_id() {
        return service_id;
    }

    public void setService_id(int service_id) {
        this.service_id = service_id;
    }

    public String getService_code() {
        return service_code;
    }

    public void setService_code(String service_code) {
        this.service_code = service_code;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(float unit_price) {
        this.unit_price = unit_price;
    }
}
