package info.thecodinglive.repository;

import info.thecodinglive.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by yun_dev1 on 2016-09-02.
 */
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
