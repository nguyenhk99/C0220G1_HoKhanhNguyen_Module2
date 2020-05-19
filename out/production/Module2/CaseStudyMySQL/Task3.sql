select *
from khachhang	
where year(NgaySinh) >= 1970 and year(NgaySinh) <= 2002 and (DiaChi = 'Đà Nẵng' or DiaChi = 'Quảng Trị');
