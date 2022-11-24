create table board(
seq number primary key,
title varchar2(100) not null,
content varchar2(1000) not null,
nickname varchar2(20),
regdate date default sysdate,
visited number default 0
);

select * from board;

create sequence seq;

insert into board values(seq.nextval, '테스트 1','테스트 내용 1','admin', sysdate, 0);
insert into board values(seq.nextval, '테스트 2','테스트 내용 2','admin', sysdate, 0);
insert into board values(seq.nextval, '테스트 3','테스트 내용 3','admin', sysdate, 0);
insert into board values(seq.nextval, '테스트 4','테스트 내용 4','admin', sysdate, 0);
insert into board values(seq.nextval, '테스트 5','테스트 내용 5','admin', sysdate, 0);
insert into board values(seq.nextval, '테스트 6','테스트 내용 6','admin', sysdate, 0);
insert into board values(seq.nextval, '테스트 7','테스트 내용 7','admin', sysdate, 0);
insert into board values(seq.nextval, '테스트 8','테스트 내용 8','admin', sysdate, 0);
insert into board values(seq.nextval, '테스트 9','테스트 내용 9','admin', sysdate, 0);
insert into board values(seq.nextval, '테스트 10','테스트 내용 10','admin', sysdate, 0);
insert into board values(seq.nextval, '테스트 11','테스트 내용 11','admin', sysdate, 0);

select * from member;
desc member;