select dichvudikem.IDDichVuDiKem,dichvudikem.TenDichVuDiKem,khachhang.HoTen
from dichvudikem
left join hopdongchitiet on hopdongchitiet.IDDichVuDiKem = dichvudikem.IDDichVuDiKem
left join hopdong on hopdong.IDHopDong = hopdongchitiet.IDHopDong
left join khachhang on khachhang.IDKhachHang = hopdong.IDKhachHang
left join loaikhach on loaikhach.IDLoaiKhach = khachhang.IDLoaiKhach
where loaikhach.TenLoaiKhach = 'Diamond' and khachhang.DiaChi = 'Vinh' or khachhang.DiaChi = 'Quảng Ngãi'