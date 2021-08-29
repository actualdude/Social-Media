
------------- View for user Table view -----------------------------
create view view_infoUsers as
select u.user_id, u.user_name, u.user_surname, u.gender, u.user_description, u.dob, a.city, c.email, c.mobile_no, c.skype
from users u
left join address a on u.user_id = a.users_user_id
left join contact c on u.user_id = c.users_user_id;


------------- View for Courses Table View ------------------
drop view view_courses;
create view view_courses as
select DISTINCT c.short_name, c.course_name, a.users_user_id, a.courses_course_id, d.department_name
from courses c
left join users_courses a on c.course_id = a.courses_course_id
left join study_department d on d.department_id = c.course_id;

----- View for Friend Table View -----------------
drop view view_friends;
create view view_friends as
select DISTINCT u.user_id, u.user_name, f.friends_id, f.users_user_id, f.users_user_id2
from users u
left join friends f on u.user_id = f.users_user_id; 

-------- view for displaying groups -------------------
drop view view_groups;
CREATE view view_groups as
select u.users_user_id, n.user_name, u.groups_group_id, c.short_name, g.group_id, g.courses_course_id, g.group_name, g.group_description
from user_group u
left join users n on n.user_id = u.users_user_id
left join groups g on g.group_id = u.groups_group_id
left join courses c on c.course_id = g.courses_course_id;


------------------ view for displaying comments --------------------------------------
drop view view_comments;
create view view_comments as
select u.user_id, u.user_name, c.email, g.group_name, m.comment_id, m.users_user_id, m.groups_group_id, m.comment_content, m.date_posted, l.like_data
from users u
left join contact c on u.user_id = c.users_user_id
left join comments m on u.user_id = m.users_user_id
left join groups g on g.group_id = m.groups_group_id
left join likey l on m.like_like_id = l.like_id;

------------------ view for displaying messages --------------------------------------
drop view view_mess;
create view view_mess as
select m.message_id, m.message_content, u.user_name, m.date_posted,  u.user_id
from messages m
left join users u on m.friends_friends_id = u.user_id;

-------------------------------------------------------------------------------------------------------

----- retrive friends by id ------
select user_name from view_vi join friends
on friends.friends_id = view_vi.friends_id
where friends.users_user_id2 = 5;

------- New retrive friends id and user_name -------------------
SELECT u.user_id, u.user_name 
FROM users u
left JOIN view_vi ON u.user_id = view_vi.users_user_id2
WHERE view_vi.user_id = 1;

------ Return list courses per user
select courses.short_name from courses join users_courses
on users_courses.users_user_id = courses.course_id
where users_courses.users_user_id = 10;

-----------------------------------------------------------------------------------------
--TRIAL CODES FOR GUI///APPLICATION....
------------------------------------------------------------------------------------------
SELECT * from view_mess where user_id = 18;

INSERT INTO messages VALUES(seq_messages.NEXTVAL, 'This is a new message', localtimestamp, 1, 18);

delete from friends where users_user_id = 1 AND users_user_id2 = 2;

select * from contact;

delete from address where users_user_id = 1;
DELETE FROM contact WHERE users_user_id = 1;

INSERT INTO address VALUES (seq_address.NEXTVAL, 'hehehe', seq_street_no.NEXTVAL, 'hihihi', seq_post_code.NEXTVAL, 1);

INSERT INTO contact VALUES(1, 'abc@gmail.com', 1234567890, 'abc@live.com', seq_contact.NEXTVAL);

UPDATE messages SET message_content = 'sdfgfhgjhkr!!!' WHERE message_id = 43;

DELETE FROM view_mess WHERE message_id = 80;

DELETE FROM comments WHERE comment_id = 9;

delete from friends where users_user_id = 2 AND users_user_id2 = 7;

INSERT INTO GROUPS VALUES(seq_groups.NEXTVAL, 'tfgh', 'xdctfvgbhnj', 1);

DELETE FROM GROUPS WHERE GROUP_NAME = 'Group020' AND COURSES_COURSE_ID = 20;

insert into users_courses values(20, 1, seq_user_courses.nextval);
insert into users_courses values(19, 1, seq_user_courses.nextval);

SELECT courses_course_id, short_name, course_name, department_name FROM view_courses WHERE users_user_id = 1;
SELECT courses_course_id, short_name, course_name, department_name FROM view_courses WHERE users_user_id = 1;

delete from users_courses where users_user_id = 1 and courses_course_id = 1;

SELECT users_user_id, user_name, short_name, group_name, group_description FROM view_groups WHERE users_user_id = 1;

insert into user_group values(seq_user_group.nextval, 1, 19);

delete from user_group where users_user_id = 1 and groups_group_id = 2;