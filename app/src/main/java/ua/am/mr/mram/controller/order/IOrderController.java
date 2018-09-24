package ua.am.mr.mram.controller.order;

import java.util.List;

import ua.am.mr.mram.model.order.OrderContainer;

public interface IOrderController {

    List<OrderContainer> getAllOrders();

}
