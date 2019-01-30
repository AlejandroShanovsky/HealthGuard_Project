package net.healthGuard.dao;

import net.healthGuard.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminDao extends JpaRepository<Admin, Long> {
    Admin findByAdminName(String adminName);
}
