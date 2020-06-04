package com.codegym.service;

import com.codegym.model.DichVuDiKem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DichVuDiKemService {
    Page<DichVuDiKem> findAll(Pageable pageable);
}
