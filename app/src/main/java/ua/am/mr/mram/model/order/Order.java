package ua.am.mr.mram.model.order;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Order {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("time")
    @Expose
    private Integer time;
    @SerializedName("number")
    @Expose
    private String number;
    @SerializedName("amount")
    @Expose
    private Integer amount;
    @SerializedName("tags")
    @Expose
    private List<String> tags = null;
    @SerializedName("address")
    @Expose
    private Address address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Order withId(Integer id) {
        this.id = id;
        return this;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Order withActive(Boolean active) {
        this.active = active;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Order withType(String type) {
        this.type = type;
        return this;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Order withTime(Integer time) {
        this.time = time;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Order withNumber(String number) {
        this.number = number;
        return this;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Order withAmount(Integer amount) {
        this.amount = amount;
        return this;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Order withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Order withAddress(Address address) {
        this.address = address;
        return this;
    }

}
