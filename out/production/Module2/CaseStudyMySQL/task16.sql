delete from nhanvien
where nhanvien.IDNhanVien not in (
select hopdong.IDNhanVien
from hopdong
where year(hopdong.NgayLamHopDong) between 2017 and 2019
);