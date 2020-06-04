package com.codegym.model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.*;


public class Service {
    Map<String,DichVu> serviceMap = new HashMap<>();

    public Service() {
    }

    public void addService(DichVu dichVu) {

        serviceMap.put(dichVu.getName(),dichVu);
    }

    public void deleteService(Service service) {
        serviceMap.remove(service);
    }

    public List<DichVu> getServiceList() {
        List<DichVu> dichVus = new LinkedList<>();
        for (DichVu dichvu: serviceMap.values()) {
            dichVus.add(dichvu);
        }
        return  dichVus;
    }
    
    public void deleteAll() {
        serviceMap.clear();
    }
}
