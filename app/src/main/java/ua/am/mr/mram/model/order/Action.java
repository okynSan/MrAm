package ua.am.mr.mram.model.order;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Action {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("orderId")
    @Expose
    private Integer orderId;
    @SerializedName("popupData")
    @Expose
    private Object popupData;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Action withType(String type) {
        this.type = type;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Action withTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Action withOrderId(Integer orderId) {
        this.orderId = orderId;
        return this;
    }

    public Object getPopupData() {
        return popupData;
    }

    public void setPopupData(Object popupData) {
        this.popupData = popupData;
    }

    public Action withPopupData(Object popupData) {
        this.popupData = popupData;
        return this;
    }

}
