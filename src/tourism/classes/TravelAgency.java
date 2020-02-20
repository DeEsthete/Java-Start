package tourism.classes;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TravelAgency {
    private Order[] orders;

    public TravelAgency() {
    }

    public TravelAgency(Order[] orders) {
        this.orders = orders;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    public List<Voucher> getSortedVochers() {
        List<Voucher> vouchers = Arrays.stream(orders)
                .flatMap(p -> Stream.of(p.getVoucher()))
                .collect(Collectors.toList());
        vouchers.sort(new SortByPrice());
        return vouchers;
    }
}

class SortByPrice implements Comparator<Voucher>
{
    public int compare(Voucher a, Voucher b)
    {
        return a.getPrice() - b.getPrice();
    }
}