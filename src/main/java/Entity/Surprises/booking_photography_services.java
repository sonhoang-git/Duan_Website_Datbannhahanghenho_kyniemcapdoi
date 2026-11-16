package Entity.Surprises;

public class booking_photography_services {
    private int photo_service_id;
    private String service_type;
    private int duration_minutes;
    private float fee;

    public booking_photography_services() {
    }

    public booking_photography_services(int photo_service_id, String service_type, int duration_minutes, float fee) {
        this.photo_service_id = photo_service_id;
        this.service_type = service_type;
        this.duration_minutes = duration_minutes;
        this.fee = fee;
    }

    public int getPhoto_service_id() {
        return photo_service_id;
    }

    public void setPhoto_service_id(int photo_service_id) {
        this.photo_service_id = photo_service_id;
    }

    public String getService_type() {
        return service_type;
    }

    public void setService_type(String service_type) {
        this.service_type = service_type;
    }

    public int getDuration_minutes() {
        return duration_minutes;
    }

    public void setDuration_minutes(int duration_minutes) {
        this.duration_minutes = duration_minutes;
    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }
}
