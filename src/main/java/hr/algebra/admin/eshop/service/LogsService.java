package hr.algebra.admin.eshop.service;

import hr.algebra.admin.eshop.model.Log;
import hr.algebra.admin.eshop.repository.LogsRepo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;

@Service
public class LogsService {

    private final LogsRepo logRepo;

    public LogsService(LogsRepo logRepo) {
        this.logRepo = logRepo;
    }

    public void save(Log log) {
        logRepo.save(log);
    }

    public List<Log> getAllLogs() {
        return logRepo.findAll();
    }

}
