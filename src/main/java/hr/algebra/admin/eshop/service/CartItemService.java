package hr.algebra.admin.eshop.service;

import hr.algebra.admin.eshop.model.ApplicationUser;
import hr.algebra.admin.eshop.model.CartItem;
import hr.algebra.admin.eshop.repository.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartItemService {

    @Autowired
    private CartItemRepository cartItemRepository;

    public List<CartItem> getAllCartItems() { return cartItemRepository.findAll(); }

    public List<CartItem> getCartItemsByUser(ApplicationUser user) {
        return cartItemRepository.findByUser(user);
    }



}
