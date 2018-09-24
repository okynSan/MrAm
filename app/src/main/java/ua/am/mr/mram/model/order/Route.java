package ua.am.mr.mram.model.order;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Route {
    @SerializedName("distance")
    @Expose
    private String distance;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("positions")
    @Expose
    private List<Position> positions = null;

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public Route withDistance(String distance) {
        this.distance = distance;
        return this;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Route withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }

    public Route withPositions(List<Position> positions) {
        this.positions = positions;
        return this;
    }
}
