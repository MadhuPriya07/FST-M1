REM   Script: Session 02
REM   Activity1-Activity5

CREATE TABLE salesman ( 
	 
    salesman_id int, 
	 
    salesman_name varchar2(32), 
	 
    salesman_city varchar2(32), 
	 
    commission int 
	 
);

desc Salesman


desc Salesman


Insert into Salesman values(5001,'James Hoog','New York',15);

Insert into salesman values(5002,'Nail Knite','Paris',13);

Insert into Salesman values(5005,'Pit Alex','London',11);

Insert into salesman values(5006,'McLyon','Paris',14);

Insert into salesman values(5007,'Paul Adam','Rome',13);

Insert into salesman values(5003,'Lauson Hen','San Jose',12);

select * from salesman;

select salesman_Id, Salesman_City from salesman;

select * from salesman where salesmna_City='Paris';

select * from salesman where salesman_City='Paris';

select salesman_id, commission from salesman where salesman_name='Paul Adams';

select salesman_id, commission from salesman where salesman_name='Paul Adam';

Alter table salesman add grade int;

desc salesman


Update table salesman set grade=100;

Update table Salesman set grade=100;

desc Salesman


Update table Salesman set grade=100;

Update salesman set grade=100;

select * from salesman;

update salesman set grade=200 where salesman_city='Rome';

update salesman set grade=300 where salesman_name='James Hoog';

update salesman set salesman_name='Pierre' where salesman_name='McLyon';

select * from salesman;

