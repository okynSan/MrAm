package ua.am.mr.mram.model.order;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Position {
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Position withLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Position withLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
}
