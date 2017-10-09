create table bususer_16192(username varchar2(40) unique,passwd varchar2(40),fullname varchar2(40),mob varchar2(20));
insert into bususer_16192 values('om','om','Om Gadhe','9287653421');
select * from bususer_16192;
drop table bususer_16192;



create table busloc_16192(states varchar2(20),district varchar2(10),city varchar2(10));
select * from busloc_16192;
insert into busloc_16192 values('Uttar Pradesh','Kanpur','Ranchi');

drop table busloc_16192;
commit;
commit;

create table checkbus_16192(destination_from varchar2(20),destination_to varchar2(20),bus_date date,busno varchar2(20));
desc checkbus_16192;
select * from checkbus_16192;
delete from checkbus_16192 where busno='MH17512';
insert into checkbus_16192 values('Pune','Nasik',date '2017-10-30','MSRTC-483403');
    select * from checkbus_16192 where destination_to='Nasik' and bus_date=date '2017-10-30';
drop table checkbus_16192;

commit;
/

create table busdetails_16192(busno varchar2(20),bustype varchar2(20),depart_time varchar2(20),price number,seatstot number,seatsav number);
select * from busdetails_16192;
insert into busdetails_16192 values('MSRTC-370530','Full AC','05:30PM',249.30,40,29);
delete from busdetails_16192 where bustype='Non AC';
drop table busdetails_16192;
commit;

/


create table mybuscart_16192(uname varchar2(20),bookingdate varchar2(20),busno varchar2(20),bustype varchar2(20),dtime varchar2(20),tno number,totalPrice number);
select * from mybuscart_16192;
drop table mybuscart_16192;
commit;

/