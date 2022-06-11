인스타그램 스키마 디자인을 했다
![](https://velog.velcdn.com/images/minthug94_/post/d54602c8-0907-4dca-be77-2f06e92f857b/image.png)

아직은 혼자 전부 완성하기엔 어렵지만,
하다보면 익숙해질거같으니 열심히 디자인해보자

```sql
create table User (
id INTEGER AUTO_INCREMENT,
user_name varchar(255) UNIQUE NOT NULL,
password_ varchar,
email varchar,

primary key(id)
);

CREATE TABLE comment (
id INTEGER AUTO_INCREMENT,
create_at timestamp default now(),
comment_content varchar(255),
user_id INT,


primary key(id),
foreign key (user_id) references User(id)
);

CREATE TABLE posts (
id int AUTO_INCREMENT,
post_date timestamp default now(),
post_content varchar(255),
user_id int,

primary key (id),
foreign key (user_id) references User(id)
);

CREATE TABLE post_like (
user_id int not null,
post_id int not null,
create_at timestamp default now(),

foreign key (user_id) references User(id),
foreign key (post_id) references posts(id)
);

CREATE TABLE follower (
follower_id int not null,
followee_id int not null,
create_at timestamp default now(),

foreign key (follower_id) references User(id),
foreign key (followee_id) references User(id)
);

CREATE TABLE photos (
id int AUTO_INCREMENT,
image_url varchar,
create_at timestamp default now(),
user_id int,
post_id int,

primary key (id),
foreign key (user_id) references User(id),
foreign key (post_id) references posts(id)
);

CREATE table hashtag (
id int AUTO_INCREMENT,
hashtag_comment varchar(255),
create_at timestamp default now(),

);

CREATE table hashtag_appear (
post_id in not null,
hashtag_id is not null,

foreign key (post_id) references posts(id),
foreign key (hashtag_id) references hashtag(id)
);
```
