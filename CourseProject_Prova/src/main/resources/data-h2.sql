INSERT INTO tinder_user (id, email, nickname, gender, attraction, passion) VALUES ('7d045dd1-0088-4282-86e5-38f336ef05f2', 'josep@tecnocampus.cat', 'El crack', 'Indefinite', 'Bisexual', 'Sport');
INSERT INTO tinder_user (id, email, nickname, gender, attraction, passion) VALUES ('74a6522f-706a-49a9-b98f-a0c8fa272434', 'jordi@tecnocampus.cat', 'The best', 'Man', 'Bisexual', 'Sport');
INSERT INTO tinder_user (id, email, nickname, gender, attraction, passion) VALUES ('3104e2a2-126c-4473-ac78-304fc04e337f', 'maria@tecnocampus.cat', 'Maria', 'Woman', 'Man', 'Sport');
INSERT INTO tinder_user (id, email, nickname, gender, attraction, passion) VALUES ('cd4fa027-36b6-4639-86b8-834fe83b2e4a', 'marta@tecnocampus.cat', 'Marta', 'Woman', 'Man', 'Sport');
INSERT INTO tinder_user (id, email, nickname, gender, attraction, passion) VALUES ('bee8e822-a690-457f-b6df-65b8ff4b994f', 'pepe@tecnocampus.cat', 'Pepeillo', 'Man', 'Bisexual', 'Sport');
INSERT INTO tinder_user (id, email, nickname, gender, attraction, passion) VALUES (to_char(random_uuid()), 'sonia@tecnocampus.cat', 'Somia', 'Woman', 'Bisexual', 'Sport');

INSERT INTO tinder_like(origin, target, creation_date) VALUES('7d045dd1-0088-4282-86e5-38f336ef05f2', 'cd4fa027-36b6-4639-86b8-834fe83b2e4a', current_date());
INSERT INTO tinder_like(origin, target, creation_date) VALUES('7d045dd1-0088-4282-86e5-38f336ef05f2', '3104e2a2-126c-4473-ac78-304fc04e337f', current_date());
INSERT INTO tinder_like(origin, target, creation_date) VALUES('7d045dd1-0088-4282-86e5-38f336ef05f2', '74a6522f-706a-49a9-b98f-a0c8fa272434', current_date());
INSERT INTO tinder_like(origin, target, creation_date) VALUES('74a6522f-706a-49a9-b98f-a0c8fa272434', 'cd4fa027-36b6-4639-86b8-834fe83b2e4a', current_date());
INSERT INTO tinder_like(origin, target, creation_date) VALUES('74a6522f-706a-49a9-b98f-a0c8fa272434', '3104e2a2-126c-4473-ac78-304fc04e337f', current_date());
INSERT INTO tinder_like(origin, target, creation_date) VALUES('cd4fa027-36b6-4639-86b8-834fe83b2e4a', 'bee8e822-a690-457f-b6df-65b8ff4b994f', current_date());
//INSERT INTO tinder_like(origin, target, creation_date) select id, (select id from tinder_user where email = 'pepe@tecnocampus.cat'), current_date() from tinder_user where email = 'marta@tecnocampus.cat';

