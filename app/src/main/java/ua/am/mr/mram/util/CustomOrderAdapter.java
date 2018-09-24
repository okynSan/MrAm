package ua.am.mr.mram.util;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.List;

import ua.am.mr.mram.R;
import ua.am.mr.mram.model.order.Order;
import ua.am.mr.mram.model.order.OrderContainer;

public class CustomOrderAdapter extends ArrayAdapter<Order> {


    @NonNull
    private final Context context;
    private List<Order> orderList;

    private ListView order;

    public CustomOrderAdapter(@NonNull Context context, @NonNull List<Order> orderList) {
        super(context, 0, orderList);
        this.context = context;
        this.orderList = orderList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.order_item, parent, false);
        }

        // Get the data item for this position
        Order order = getItem(position);

        // Lookup view for data population
        TextView orderTimeView = (TextView) convertView.findViewById(R.id.orderTime);
        TextView orderNumberView = (TextView) convertView.findViewById(R.id.orderNumber);
        TextView restaurantNameView = (TextView) convertView.findViewById(R.id.restaurantName);
        TextView restAddressView = (TextView) convertView.findViewById(R.id.restAddress);
        TextView price = (TextView) convertView.findViewById(R.id.price);


        SimpleDateFormat dateFormatter = new SimpleDateFormat("hh:mm");

        // Populate the data into the template view using the data object
        orderTimeView.setText(dateFormatter.format(order.getTime()));
        orderNumberView.setText(order.getId().toString());
        restaurantNameView.setText(order.getAddress().getTitle());
        restAddressView.setText(order.getAddress().getDescription().toString());
        price.setText(order.getAmount().toString() + "грн.");

        // Return the completed view to render on screen
        return convertView;
    }
}
