package hr.algebra.admin.eshop.repository;

import hr.algebra.admin.eshop.model.ApplicationUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<ApplicationUser,Long> {
    ApplicationUser findByUsername(final String username);
}

