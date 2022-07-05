package kr.co.sunget.yueen.domain.admin.domain.repository;

import kr.co.sunget.yueen.domain.admin.domain.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Long> {
}
