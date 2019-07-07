    
DROP TABLE IF EXISTS coach;
CREATE TABLE coach (
id INT AUTO_INCREMENT PRIMARY KEY,
coach_id VARCHAR(15) UNIQUE NOT NULL,
coach_name VARCHAR(15) NOT NULL,
PASSWORD VARCHAR(50) NOT NULL,
coach_loc VARCHAR(50) NOT NULL,
coach_info VARCHAR(220) NOT NULL,
coach_link VARCHAR(50) NOT NULL,
coach_resume_1 VARCHAR(110) NOT NULL,
coach_resume_2 VARCHAR(110) NOT NULL,
coach_resume_3 VARCHAR(110) NOT NULL,
photo VARCHAR(50) DEFAULT 'defaut_photo'
)DEFAULT CHARSET=utf8;
-- insert into coach(coach_id,coach_name,password,coach_loc,coach_info,coach_link,coach_resume_1,coach_resume_2,coach_resume_3,photo) values ('joo','Jung Hwan Joo','1234','Seogyo-dong, Mapo-gu','Based on your goals, I am helping you achieve better dome movement through posture and exercise evaluations.','https://www.instagram.com/hongsick/','Traninning Specialist','Korea Cardiopulmonary Resuscitation Association CPR','fitness914','https://placeimg.com/500/480/any');
-- insert into coach(coach_id,coach_name,password,coach_loc,coach_info,coach_link,coach_resume_1,coach_resume_2,coach_resume_3,photo) values ('hoon','Sim hoon','1234','Seocho-dong, Seocho-gu','I will help you succeed in your diet.','https://www.instagram.com/hongsick/','Traninning Specialist','Korea Cardiopulmonary Resuscitation Association CPR','fitness914','https://placeimg.com/500/480/any');
-- insert into coach(coach_id,coach_name,password,coach_loc,coach_info,coach_link,coach_resume_1,coach_resume_2,coach_resume_3,photo) values ('young','Jun min young','1234','Bupyeong-dong, Bupyeong-gu','I will help you succeed in your diet.','https://www.instagram.com/hongsick/','Traninning Specialist','Korea Cardiopulmonary Resuscitation Association CPR','fitness914','https://placeimg.com/500/480/any');
-- insert into coach(coach_id,coach_name,password,coach_loc,coach_info,coach_link,coach_resume_1,coach_resume_2,coach_resume_3,photo) values ('jung','Goo Min Jung','1234','Cheongwon-gu Yulryang-dong','I promise to provide you with the best facilities, as well as the highest level of expertise.','https://www.instagram.com/hongsick/','Traninning Specialist','Korea Cardiopulmonary Resuscitation Association CPR','fitness914','https://placeimg.com/500/480/any');
-- insert into coach(coach_id,coach_name,password,coach_loc,coach_info,coach_link,coach_resume_1,coach_resume_2,coach_resume_3,photo) values ('bong','Kim jin bong','1234','Cheongdam-dong, Gangnam-gu','I am Kim Jin Bong, a diet expert','https://www.instagram.com/hongsick/','Traninning Specialist','Korea Cardiopulmonary Resuscitation Association CPR','fitness914','https://placeimg.com/500/480/any');
-- insert into coach(coach_id,coach_name,password,coach_loc,coach_info,coach_link,coach_resume_1,coach_resume_2,coach_resume_3,photo) values ('jin','Lee han jin','1234','Hawangsimni-dong, Seongdong-gu','I will gives you a diet that does not fail.','https://www.instagram.com/hongsick/','Traninning Specialist','Korea Cardiopulmonary Resuscitation Association CPR','fitness914','https://placeimg.com/500/480/any');
commit;