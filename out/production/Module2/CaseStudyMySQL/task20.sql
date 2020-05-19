select nv.IDNhanVien as ID ,nv.HoTen,nv.Email,nv.SoDienThoai,nv.NgaySinh
from nhanvien nv
union
select  kh.IDKhachHang as ID,kh.HoTen,kh.Email,kh.SoDienThoai,kh.NgaySinh
from khachhang kh