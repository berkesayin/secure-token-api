package dev.berke.token_api.repository;

import dev.berke.token_api.models.Role;
import dev.berke.token_api.models.RoleType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(RoleType name);
}
