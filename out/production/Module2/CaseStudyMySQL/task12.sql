select hopdong.IDHopDong, nhanvien.HoTen HoTenNhanVien,khachhang.HoTen HoTenKhachHang,khachhang.SoDienThoai,dichvu.TenDichVu,count(hopdongchitiet.IDDichVuDiKem),hopdong.TienDatCoc
from hopdong
join nhanvien on nhanvien.IDNhanVien = hopdong.IDNhanVien
join khachhang on khachhang.IDKhachHang = hopdong.IDKhachHang
join dichvu on dichvu.IDDichVu = hopdong.IDDichVu
join hopdongchitiet on hopdongchitiet.IDHopDong = hopdong.IDHopDong
where exists (select hopdong.IDHopDong
where year(hopdong.NgayLamHopDong) = 2019 and month(hopdong.NgayLamHopDong) between 10 and 12 )
and not exists (select hopdong.IDHopDong
where year(hopdong.NgayLamHopDong) = 2019 and month(hopdong.NgayLamHopDong) between 01 and 06 )
group by hopdong.IDHopDong
