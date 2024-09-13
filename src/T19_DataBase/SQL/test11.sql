SELECT * FROM test2;

rename table test to test2;

rename table test2 to test;

select * from test order by age;

select * from test order by age desc;

select * from test limit 5;


-- 나이 많은 순으로 5명 출력
select * from test order by age desc limit 5;

-- 4번 인덱스부터 5건의 자료 보기
select * from test limit 4,5; -- 시작인덱스,풀력개수


