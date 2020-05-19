package service;

import org.springframework.stereotype.Service;

@Service
public class ChuyenTienDo implements ChuyenTien {
    @Override
    public double chuyenDoi(double num1) {
        return num1/23000;
    }
}
