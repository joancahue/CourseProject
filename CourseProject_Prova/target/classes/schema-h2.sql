DROP TABLE if EXISTS tinder_user;
CREATE TABLE tinder_user
(
  id VARCHAR (256) PRIMARY KEY ,
  email VARCHAR (100) ,
  nickname VARCHAR (255),
  gender VARCHAR (50),
  attraction VARCHAR (50),
  passion VARCHAR (100),
  password VARCHAR(70) NOT NULL DEFAULT '123456',
  enabled TINYINT NOT NULL DEFAULT 1
);

DROP TABLE if EXISTS tinder_like;
CREATE TABLE tinder_like
(
  origin VARCHAR (256),
  target VARCHAR (256),
  creation_date DATE,
  match_date DATE DEFAULT NULL,
  matched TINYINT NOT NULL DEFAULT 0,
  PRIMARY KEY (origin, target),
  FOREIGN KEY (origin) REFERENCES tinder_user(id),
  FOREIGN KEY (target) REFERENCES tinder_user(id)
);
