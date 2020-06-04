package com.codegym.repository;

import com.codegym.model.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KhachHangRepository extends JpaRepository<KhachHang,Integer> {
    Page<KhachHang> findByIdCustomerContaining(String id, Pageable pageable);

    Page<KhachHang> findByNameContaining(String name,Pageable pageable);
}
