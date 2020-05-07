SET SQL_SAFE_UPDATES=0;
update dichvudikem 
set dichvudikem.Gia = dichvudikem.Gia*2
where dichvudikem.IDDichVuDiKem in (
select x.IDDichVuDiKem
from(
select dichvudikem.IDDichVuDiKem
from dichvudikem
join hopdongchitiet on hopdongchitiet.IDDichVuDiKem = dichvudikem.IDDichVuDiKem
group by dichvudikem.IDDichVuDiKem
having sum(hopdongchitiet.SoLuong) >= 10 ) as x)
