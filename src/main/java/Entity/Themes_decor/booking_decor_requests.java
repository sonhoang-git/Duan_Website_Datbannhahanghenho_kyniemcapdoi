package Entity.Themes_decor;

public class booking_decor_requests {
    private int decor_request_id;
    private String theme_id;
    private String color_tone;
    private String table_style;
    private String custom_text_content;
    private String custom_uploaded_photo_url;
    private int keep_secret;
    private String setup_deadline_time;
    private String custom_design_proof_url;
    private String status;

    public booking_decor_requests() {
    }

    public booking_decor_requests(int decor_request_id, String theme_id, String color_tone, String table_style, String custom_text_content, String custom_uploaded_photo_url, int keep_secret, String setup_deadline_time, String custom_design_proof_url, String status) {
        this.decor_request_id = decor_request_id;
        this.theme_id = theme_id;
        this.color_tone = color_tone;
        this.table_style = table_style;
        this.custom_text_content = custom_text_content;
        this.custom_uploaded_photo_url = custom_uploaded_photo_url;
        this.keep_secret = keep_secret;
        this.setup_deadline_time = setup_deadline_time;
        this.custom_design_proof_url = custom_design_proof_url;
        this.status = status;
    }

    public int getDecor_request_id() {
        return decor_request_id;
    }

    public void setDecor_request_id(int decor_request_id) {
        this.decor_request_id = decor_request_id;
    }

    public String getTheme_id() {
        return theme_id;
    }

    public void setTheme_id(String theme_id) {
        this.theme_id = theme_id;
    }

    public String getColor_tone() {
        return color_tone;
    }

    public void setColor_tone(String color_tone) {
        this.color_tone = color_tone;
    }

    public String getTable_style() {
        return table_style;
    }

    public void setTable_style(String table_style) {
        this.table_style = table_style;
    }

    public String getCustom_text_content() {
        return custom_text_content;
    }

    public void setCustom_text_content(String custom_text_content) {
        this.custom_text_content = custom_text_content;
    }

    public String getCustom_uploaded_photo_url() {
        return custom_uploaded_photo_url;
    }

    public void setCustom_uploaded_photo_url(String custom_uploaded_photo_url) {
        this.custom_uploaded_photo_url = custom_uploaded_photo_url;
    }

    public int getKeep_secret() {
        return keep_secret;
    }

    public void setKeep_secret(int keep_secret) {
        this.keep_secret = keep_secret;
    }

    public String getSetup_deadline_time() {
        return setup_deadline_time;
    }

    public void setSetup_deadline_time(String setup_deadline_time) {
        this.setup_deadline_time = setup_deadline_time;
    }

    public String getCustom_design_proof_url() {
        return custom_design_proof_url;
    }

    public void setCustom_design_proof_url(String custom_design_proof_url) {
        this.custom_design_proof_url = custom_design_proof_url;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
