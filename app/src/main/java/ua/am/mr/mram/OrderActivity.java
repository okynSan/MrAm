package ua.am.mr.mram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import ua.am.mr.mram.controller.order.IOrderController;
import ua.am.mr.mram.controller.order.OrderController;
import ua.am.mr.mram.model.order.OrderContainer;
import ua.am.mr.mram.util.CustomOrderAdapter;

public class OrderActivity extends AppCompatActivity {

    private ListView orderListComplex;
    private TextView orderState;
    private IOrderController iOrderController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        orderListComplex = (ListView) findViewById(R.id.orderList);
        orderState = (TextView) findViewById(R.id.orderState);
        iOrderController = new OrderController();
        CustomOrderAdapter customOrderAdapter = null;

        List<OrderContainer> orderContainers = iOrderController.getAllOrders();
        for (OrderContainer orCon : orderContainers) {
            customOrderAdapter = new CustomOrderAdapter(this, orCon.getOrders());
            orderListComplex.addFooterView(this.createFooter(orCon.getAction().getTitle()));
        }
        this.orderListComplex.setAdapter(customOrderAdapter);

    }

    View createFooter(String text) {
        View v = getLayoutInflater().inflate(R.layout.order_state, null);
        ((TextView) v.findViewById(R.id.orderState)).setText(text);
        return v;
    }


}
