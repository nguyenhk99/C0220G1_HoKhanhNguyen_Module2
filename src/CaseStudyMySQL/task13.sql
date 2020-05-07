select x2.*
from 
(select dvdk.IDDichVuDiKem,dvdk.TenDichVuDiKem,sum(hdct.SoLuong) as SoLanDat
from dichvudikem dvdk
join hopdongchitiet hdct on hdct.IDDichVuDiKem = dvdk.IDDichVuDiKem
group by dvdk.IDDichVuDiKem
order by sum(hdct.SoLuong) desc
limit 1) as x 
inner join (select dvdk.IDDichVuDiKem,dvdk.TenDichVuDiKem,sum(hdct.SoLuong) as SoLanDat
from dichvudikem dvdk
join hopdongchitiet hdct on hdct.IDDichVuDiKem = dvdk.IDDichVuDiKem
group by dvdk.IDDichVuDiKem
order by sum(hdct.SoLuong) desc) x2 on x2.SoLanDat = x.SoLanDat

