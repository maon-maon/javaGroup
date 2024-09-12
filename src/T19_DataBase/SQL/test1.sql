/*테이블 보여주기*/
show tables; 

/*테이블 생성하기(DDL)*/
create table test (
	name varchar(30) not null,		/*성명*/
	age int default 20,						/*나이 기본값20*/
	gender char(2) default '여자',	/*성별*/
	address varchar(10)						/*주소*/
);

desc test; /*생성된 테이블의 구조보기*/



update test set age=35 where name ='김말숙';
drop table test; /*테이블 삭제처리*/
delete from test; /*test테이블의 모든 레코드를 삭제*/

/*DML*/
insert into test (name, age, gender, address) values ('홍길동',23,'남자','서울'); /*레코드삽입*/
insert into test values ('김말숙',30,'여자','청주'); 
insert into test values ('오하늘', default, default, '');
insert into test (name ) values ('이사랑');
insert into test values ('가나다',9,'여자','광주'); 
insert into test values ('라마바',15,default,'영주'); 
insert into test values ('바아자',22,'여자','성주'); 
insert into test values ('차카타',38,default,'나주'); 
insert into test values ('파 하',45,'남자','전주'); 
insert into test values ('알버트',49,'남자','천안'); 
insert into test values ('벤자민',51,'여자','대전'); 
insert into test values ('칼벤자민',51,'여자','대전'); 
insert into test values ('벤자민트',51,'여자','대전'); 
insert into test values ('캐롤린',21,'여자','청주'); 
insert into test values ('대니얼',28,'남자','청주'); 
insert into test values ('아야',28,'남자','청주'); 
insert into test values ('제키',40,'여자','청주'); 

update test set age=35 where name ='김말숙';
update test set address='제주' where name ='김말숙';

select * from test; /* 테이블의 내용 확인 */

/*서울에 사는 사람들 조회*/
select * from test where address='광주';

/*남자만 조회*/
select * from test where gender='남자';

/*나이가 35세 이상인 사람들 조회*/
select * from test where age>=35;

/*서울에 사는 남자들 조회*/
select * from test where gender='남자' and address='전주'

/*나이가 25세 이상인 여자들 조회*/
select * from test where age>=25 and gender='여자';

/*서울에 살거나 청주에 거주하는 사람들 조회*/
select * from test where address='전주' or address='청주';

/*여자 중에서 서울에 살거나 청주에 거주하는 사람들 조회*/
select * from test where gender='여자' and (address='전주' or address='청주');

/*여자 20대중에서 서울에 살거나 청주에 거주하는 사람들 조회*/
select * from test where gender='여자' and (address='전주' or address='청주') and (age>=20 and age<30);

/*30대를 출력하세요 */
select * from test where age>=30 and age<40;
select * from test where age between 30 and 39;/*40포함됨*/

/*서울/청주 거주자*/
select * from test where address='대전'or  address='청주'
select * from test where address in('대전','청주')  /*in 포함의 의미*/
select * from test where address in('대','주') /*완전히 동일한 단어만 뽑을 수 있음*/

/*이름중에서 '김'씨만 출력*/
select * from test where name like '김%';/*김으로 시작하는 데이터 출력*/

/*이름중에서 '자'로 끝나는 사람만 출력*/
select * from test where name like '%자';/*자로 끝나는 데이터 출력*/

/*이름중에서 '자'를 포함하는 사람들 모두 출력*/
select * from test where name like '%자%';

-- 이름 중에서 두번쨰 글자가 '자'인 사람들 출력
select * from test where name like '_자%'; /*_=하나가 한글자*/


/*서울이나 제주에 사는 사람들의 나이를 1살씩 증가*/
-- update	테이블명	set  / where안 쓰면 전체 반영 됨. 반드시 적용스며야 함
update test	set age = age+1 where address='대전'or  address='청주' 		/* 기존 나이에 1을 증가*/
update test	set age = age+1 where address in('대전','청주') 		/* 기존 나이에 1을 증가*/

/*모든 사람들의 나이를 1살씩 감소*/
update test	set age = age-1;

/*청주사는 남자 모두 삭제 */
-- delete from :한세트
delete from test where address='청주' and gender='남자'
select * from test where address='청주' and gender='남자'

/*청주는 사람들의 '성명/나이/성별'만을 출력하시오*/
select name,age,gender from test where address='청주'

/*이름순으로 오름차순*/
-- asc: 오름차순=생략가능  desc:내림차순
select *from test order by name;
select *from test order by name desc;

-- 나이 내림차순출력하되, 나이가 같으면 이름 오름차순으로 출력
select *from test order by age desc, name;




