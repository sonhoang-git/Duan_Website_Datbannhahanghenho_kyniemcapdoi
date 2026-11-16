package Entity.Themes_decor;

public class theme_gallery {
    private int gallery_id;
    private String theme_id;
    private String image_url;
    private String color_tone;

    public theme_gallery(int gallery_id, String theme_id, String image_url, String color_tone) {
        this.gallery_id = gallery_id;
        this.theme_id = theme_id;
        this.image_url = image_url;
        this.color_tone = color_tone;
    }

    public theme_gallery() {
    }

    public int getGallery_id() {
        return gallery_id;
    }

    public void setGallery_id(int gallery_id) {
        this.gallery_id = gallery_id;
    }

    public String getTheme_id() {
        return theme_id;
    }

    public void setTheme_id(String theme_id) {
        this.theme_id = theme_id;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getColor_tone() {
        return color_tone;
    }

    public void setColor_tone(String color_tone) {
        this.color_tone = color_tone;
    }
}
