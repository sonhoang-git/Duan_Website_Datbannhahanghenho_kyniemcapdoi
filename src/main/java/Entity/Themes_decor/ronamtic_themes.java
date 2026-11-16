package Entity.Themes_decor;

public class ronamtic_themes {
    private int theme_id;
    private String theme_code;
    private String theme_name;
    private String description;
    private float base_price;

    public ronamtic_themes(int theme_id, String theme_code, String theme_name, String description, float base_price) {
        this.theme_id = theme_id;
        this.theme_code = theme_code;
        this.theme_name = theme_name;
        this.description = description;
        this.base_price = base_price;
    }

    public ronamtic_themes() {
    }

    public int getTheme_id() {
        return theme_id;
    }

    public void setTheme_id(int theme_id) {
        this.theme_id = theme_id;
    }

    public String getTheme_code() {
        return theme_code;
    }

    public void setTheme_code(String theme_code) {
        this.theme_code = theme_code;
    }

    public String getTheme_name() {
        return theme_name;
    }

    public void setTheme_name(String theme_name) {
        this.theme_name = theme_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getBase_price() {
        return base_price;
    }

    public void setBase_price(float base_price) {
        this.base_price = base_price;
    }
}
