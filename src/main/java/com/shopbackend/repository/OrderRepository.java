package com.shopbackend.repository;

import com.shopbackend.model.order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<order, Long> {}
