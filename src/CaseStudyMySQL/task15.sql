select hopdong.IDHopDong,nv.IDNhanVien,nv.HoTen,trinhdo.TrinhDo,bophan.TenBoPhan,nv.SoDienThoai,count(hopdong.IDNhanVien) as SoHopDong
from nhanvien nv
left join trinhdo on trinhdo.IDTrinhDo = nv.IDTrinhDo
left join bophan on bophan.IDBoPhan = nv.IDBoPhan
left join hopdong on hopdong.IDNhanVien = nv.IDNhanVien
where year(hopdong.NgayLamHopDong) in (2018)
group by nv.IDNhanVien
having count(nv.IDNhanVien)<=3
union
select hopdong.IDHopDong,nv.IDNhanVien,nv.HoTen,trinhdo.TrinhDo,bophan.TenBoPhan,nv.SoDienThoai,count(hopdong.IDNhanVien) as SoHopDong
from nhanvien nv
left join trinhdo on trinhdo.IDTrinhDo = nv.IDTrinhDo
left join bophan on bophan.IDBoPhan = nv.IDBoPhan
left join hopdong on hopdong.IDNhanVien = nv.IDNhanVien
group by nv.IDNhanVien
having count(hopdong.IDHopDong) = 0