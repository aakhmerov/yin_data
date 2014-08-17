create view yin_data.v_avg_price_per_sell 
as
select s2.geox,s2.geoy,s2.kp,s2.edatum from ((select avg(kaufpreis) as kp,geox,geoy,edatum from yin_data.t_objects group by geox,geoy,edatum) as s2 join (select geox,geoy,count(edatum) as ce from yin_data.t_objects group by geox,geoy order by ce desc limit 49) as s1 on s1.geox=s2.geox and s1.geoy=s2.geoy);
