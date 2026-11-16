package Entity.Themes_decor;

public class booking_decor_details {
    private int detail_id;
    private int decor_request_id;
    private int service_id;
    private int quantity;
    private float unit_price;

    public booking_decor_details() {
    }

    public booking_decor_details(int detail_id, int decor_request_id, int service_id, int quantity, float unit_price) {
        this.detail_id = detail_id;
        this.decor_request_id = decor_request_id;
        this.service_id = service_id;
        this.quantity = quantity;
        this.unit_price = unit_price;
    }

    public int getDetail_id() {
        return detail_id;
    }

    public void setDetail_id(int detail_id) {
        this.detail_id = detail_id;
    }

    public int getDecor_request_id() {
        return decor_request_id;
    }

    public void setDecor_request_id(int decor_request_id) {
        this.decor_request_id = decor_request_id;
    }

    public int getService_id() {
        return service_id;
    }

    public void setService_id(int service_id) {
        this.service_id = service_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(float unit_price) {
        this.unit_price = unit_price;
    }
}
