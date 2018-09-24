package ua.am.mr.mram.service.order;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import ua.am.mr.mram.model.order.OrderContainer;

public interface IOrderService {


    @GET("/business-app/api/couriers/tasks/active")
    Call<List<OrderContainer>> getAllOrders();
}
