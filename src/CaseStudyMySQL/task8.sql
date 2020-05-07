select khachhang.HoTen
from khachhang
group by khachhang.HoTen;

select distinct khachhang.HoTen
from khachhang
group by khachhang.HoTen;

select khachhang.HoTen
from khachhang
union
select khachhang.HoTen
from khachhang