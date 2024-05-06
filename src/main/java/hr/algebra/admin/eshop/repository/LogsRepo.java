package hr.algebra.admin.eshop.repository;

import hr.algebra.admin.eshop.model.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface LogsRepo extends JpaRepository<Log, Long> {
}
