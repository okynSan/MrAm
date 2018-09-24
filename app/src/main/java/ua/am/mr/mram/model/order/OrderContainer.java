package ua.am.mr.mram.model.order;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OrderContainer {

    @SerializedName("orders")
    @Expose
    private List<Order> orders = null;

    @SerializedName("route")
    @Expose
    private Route route;

    @SerializedName("action")
    @Expose
    private Action action;


    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public OrderContainer withOrders(List<Order> orders) {
        this.orders = orders;
        return this;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public OrderContainer withRoute(Route route) {
        this.route = route;
        return this;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public OrderContainer withAction(Action action) {
        this.action = action;
        return this;
    }



}
