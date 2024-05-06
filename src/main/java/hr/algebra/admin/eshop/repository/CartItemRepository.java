package hr.algebra.admin.eshop.repository;

import hr.algebra.admin.eshop.model.ApplicationUser;
import hr.algebra.admin.eshop.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    List<CartItem> findByUser(ApplicationUser user);
}
