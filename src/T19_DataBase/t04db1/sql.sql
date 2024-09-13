show tables;

create table hoewon(
	idx 		int 				not null auto_increment primary key,	 /*회원 고유번호*/
	name		varchar(30) not null, 		/*이름*/
	age			int 				default 20,		/*나이*/
	gender  char(2)			default '여자',		/*성별*/
	joinday	datetime 		default now(),  /*yyyy-MM-dd*/	 /*datetime 날짜시간형식, default now():오늘날짜*/
	address	varchar(20)		/*주소*/
);

select * from hoewon;