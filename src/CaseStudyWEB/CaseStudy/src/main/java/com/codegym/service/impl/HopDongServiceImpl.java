package com.codegym.service.impl;

import com.codegym.model.HopDong;
import com.codegym.model.KhachHang;
import com.codegym.repository.HopDongRepository;
import com.codegym.service.HopDongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Service
public class HopDongServiceImpl implements HopDongService {
    @Autowired
    HopDongRepository hopDongRepository;

    @Override
    public Page<HopDong> findAll(Pageable pageable) {
        return hopDongRepository.findAll(pageable);
    }

    @Override
    public void save(HopDong hopDong) {
        hopDongRepository.save(hopDong);
    }

    @Override
    public List<HopDong> findAllByDateEnd(Date date) throws ParseException {
        List<HopDong> hopDongs = new LinkedList<>();

        for (HopDong hopdong : hopDongRepository.findAll()) {
            if (new SimpleDateFormat("yyyy-MM-dd").parse(hopdong.getDateEnd()).after(date)) {
                hopDongs.add(hopdong);
            }
        }
        return hopDongs;
    }

    @Override
    public HopDong findById(Integer id) {
        return hopDongRepository.findById(id).orElse(null);
    }
}
