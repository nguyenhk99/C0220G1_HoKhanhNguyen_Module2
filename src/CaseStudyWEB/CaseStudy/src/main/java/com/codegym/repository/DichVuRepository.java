package com.codegym.repository;

import com.codegym.model.DichVu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DichVuRepository extends JpaRepository<DichVu,Integer> {
    Page<DichVu> findByNameContaining(String name, Pageable pageable);
}
