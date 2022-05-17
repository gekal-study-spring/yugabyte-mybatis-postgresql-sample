CREATE SCHEMA gekal;
create table gekal.student (
    id integer primary key not null, -- ID
    name character varying, -- 名前
    age integer, -- 年齢
    language text -- 言語
);
comment on table gekal.student is '学生';
comment on column gekal.student.id is 'ID';
comment on column gekal.student.name is '名前';
comment on column gekal.student.age is '年齢';
comment on column gekal.student.language is '言語';
