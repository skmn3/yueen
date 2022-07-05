package kr.co.sunget.yueen.domain.user.domain.Repository;

import kr.co.sunget.yueen.domain.user.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
