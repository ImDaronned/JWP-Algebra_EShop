package hr.algebra.admin.eshop.global;



import hr.algebra.admin.eshop.model.CartItem;

import java.util.ArrayList;
import java.util.List;

public class GlobalData {
    public static List<CartItem> cart;

    static {
        cart = new ArrayList<>();
    }
}
