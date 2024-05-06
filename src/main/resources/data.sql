insert into USERS(username, password) values('user', '$2a$10$GRLdNijSQMUvl/au9ofL.eDwmoohzzS7.rmNSJZ.0FxO/BTk76klW');
insert into USERS(username, password) values('admin', '$2a$10$GRLdNijSQMUvl/au9ofL.eDwmoohzzS7.rmNSJZ.0FxO/BTk76klW');
insert into USERS(username, password) values('read_only', '$2a$10$GRLdNijSQMUvl/au9ofL.eDwmoohzzS7.rmNSJZ.0FxO/BTk76klW');
insert into USERS(username, password) values('dummy', '$2a$10$GRLdNijSQMUvl/au9ofL.eDwmoohzzS7.rmNSJZ.0FxO/BTk76klW');

insert into roles(name) values('USER');
insert into roles(name) values('ADMIN');
insert into roles(name) values('READ_ONLY');
insert into roles(name) values('DUMMY');

insert into role_user(application_user_id, role_id) values(1, 1);
insert into role_user(application_user_id, role_id) values(2, 1);
insert into role_user(application_user_id, role_id) values(2, 2);
insert into role_user(application_user_id, role_id) values(3, 3);

insert into category (category_id, name) values (1, 'Ligue 1');
insert into category (category_id, name) values (2, 'La Liga');
insert into category (category_id, name) values (3, 'Bundesliga');
insert into category (category_id, name) values (4, 'Serie A');
insert into category (category_id, name) values (5, 'Premier League');


insert into product (id, description, image_name, name, price, category_id) values (1, 'paris saint germain jersey', 'psg.png', 'Paris Saint Germain (PSG)', 150.0, 1);
insert into product (id, description, image_name, name, price, category_id) values (2, 'as monaco jersey', 'monaco.png', 'AS Monaco', 20.0, 1);
insert into product (id, description, image_name, name, price, category_id) values (53, 'bayern munich jersey 2023 - 2024', 'bayern.png', 'Bayern Munich', 20.0, 3);
insert into product (id, description, image_name, name, price, category_id) values (54, 'bvb jersey 2023-2024', 'bvb.png', 'Dortmund (BVB)', 20.0, 3);
insert into product (id, description, image_name, name, price, category_id) values (102, 'real madrid jersey 2023-2024 (third)', 'real.png', 'Real Madrid', 20.0, 2);
insert into product (id, description, image_name, name, price, category_id) values (103, 'fc barcelona jersey 2023 - 2024 (out)', 'barca.png', 'FC Barcelona', 20.0, 2);
insert into product (id, description, image_name, name, price, category_id) values (104, 'manchester city jersey 2023 - 2024', 'city.png', 'Manchester City', 20.0, 5);
insert into product (id, description, image_name, name, price, category_id) values (105, 'arsenal jersey 2023 - 2024', 'arsenal.png', 'Arsenal', 20.0, 5);
insert into product (id, description, image_name, name, price, category_id) values (106, 'inter milan jersey 2023 - 2024', 'inter.png', 'Inter Milan', 20.0, 4);
insert into product (id, description, image_name, name, price, category_id) values (107, 'napoli jersey 2023 - 2024', 'naples.png', 'Napoli', 20.0, 4);