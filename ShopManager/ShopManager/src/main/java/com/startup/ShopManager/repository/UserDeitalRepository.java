package com.startup.ShopManager.repository;

import com.startup.ShopManager.entity.UserDeital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDeitalRepository extends JpaRepository<UserDeital,Long> {
}
