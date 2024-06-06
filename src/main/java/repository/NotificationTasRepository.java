package repository;

import model.NotificationTask;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface NotificationTasRepository extends JpaRepository<NotificationTask,Long> {
    List<NotificationTask> findNotificationTaskByTaskClock(LocalDateTime time);
}