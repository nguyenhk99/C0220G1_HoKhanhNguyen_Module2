package com.codegym.service;

import com.codegym.model.HopDong;
import com.codegym.model.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public interface HopDongService {
    Page<HopDong> findAll(Pageable pageable);

    void save(HopDong hopDong);

    Page<HopDong> findAllByDateEnd(Date date,Pageable pageable) throws ParseException;

    HopDong findById(Integer id);
}
