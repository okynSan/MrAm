package ua.am.mr.mram.controller.order;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import ua.am.mr.mram.model.order.OrderContainer;
import ua.am.mr.mram.service.order.IOrderService;
import ua.am.mr.mram.service.utils.ApiFactory;
import ua.am.mr.mram.util.CustomOrderAdapter;

public class OrderController implements IOrderController {

    @Override
    public List<OrderContainer> getAllOrders() {
        IOrderService iOrderService = ApiFactory.getOrderService();

        Call<List<OrderContainer>> t = iOrderService.getAllOrders();
        List<OrderContainer> orderContainers = null;
        try {

            orderContainers = t.execute().body();

        } catch (IOException e) {
            System.out.println(e.toString());
        }

        return orderContainers;
    }
}
