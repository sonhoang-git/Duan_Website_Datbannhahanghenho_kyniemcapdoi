package Entity.Surprises;

public class booking_media_requests {
    private int media_req_id;
    private String song_title;
    private String artist_name;
    private String custom_video_url;
    private String play_time_spot;
    private int use_projector;

    public booking_media_requests() {
    }

    public booking_media_requests(int media_req_id, String song_title, String artist_name, String custom_video_url, String play_time_spot, int use_projector) {
        this.media_req_id = media_req_id;
        this.song_title = song_title;
        this.artist_name = artist_name;
        this.custom_video_url = custom_video_url;
        this.play_time_spot = play_time_spot;
        this.use_projector = use_projector;
    }

    public int getMedia_req_id() {
        return media_req_id;
    }

    public void setMedia_req_id(int media_req_id) {
        this.media_req_id = media_req_id;
    }

    public String getSong_title() {
        return song_title;
    }

    public void setSong_title(String song_title) {
        this.song_title = song_title;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }

    public String getCustom_video_url() {
        return custom_video_url;
    }

    public void setCustom_video_url(String custom_video_url) {
        this.custom_video_url = custom_video_url;
    }

    public String getPlay_time_spot() {
        return play_time_spot;
    }

    public void setPlay_time_spot(String play_time_spot) {
        this.play_time_spot = play_time_spot;
    }

    public int getUse_projector() {
        return use_projector;
    }

    public void setUse_projector(int use_projector) {
        this.use_projector = use_projector;
    }
}
