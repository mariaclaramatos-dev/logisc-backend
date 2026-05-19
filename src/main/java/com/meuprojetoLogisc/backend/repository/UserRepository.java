package com.meuprojetoLogisc.backend.repository;

import com.meuprojetoLogisc.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
