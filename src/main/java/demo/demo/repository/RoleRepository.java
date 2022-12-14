package demo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.demo.models.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    
}
