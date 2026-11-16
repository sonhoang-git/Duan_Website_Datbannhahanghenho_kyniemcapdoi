package Entity.Surprises;

public class booking_surprise_executions {
    private int execution_id;
    private int script_id;
    private int media_req_id;
    private int photo_service_id;
    private String secret_passcode;
    private int is_approved_by_restaurant;

    public booking_surprise_executions(int execution_id, int script_id, int media_req_id, int photo_service_id, String secret_passcode, int is_approved_by_restaurant) {
        this.execution_id = execution_id;
        this.script_id = script_id;
        this.media_req_id = media_req_id;
        this.photo_service_id = photo_service_id;
        this.secret_passcode = secret_passcode;
        this.is_approved_by_restaurant = is_approved_by_restaurant;
    }

    public booking_surprise_executions() {
    }

    public int getExecution_id() {
        return execution_id;
    }

    public void setExecution_id(int execution_id) {
        this.execution_id = execution_id;
    }

    public int getScript_id() {
        return script_id;
    }

    public void setScript_id(int script_id) {
        this.script_id = script_id;
    }

    public int getMedia_req_id() {
        return media_req_id;
    }

    public void setMedia_req_id(int media_req_id) {
        this.media_req_id = media_req_id;
    }

    public int getPhoto_service_id() {
        return photo_service_id;
    }

    public void setPhoto_service_id(int photo_service_id) {
        this.photo_service_id = photo_service_id;
    }

    public String getSecret_passcode() {
        return secret_passcode;
    }

    public void setSecret_passcode(String secret_passcode) {
        this.secret_passcode = secret_passcode;
    }

    public int getIs_approved_by_restaurant() {
        return is_approved_by_restaurant;
    }

    public void setIs_approved_by_restaurant(int is_approved_by_restaurant) {
        this.is_approved_by_restaurant = is_approved_by_restaurant;
    }
}
