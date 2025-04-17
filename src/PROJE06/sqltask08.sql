CREATE TABLE employee01 (id INTEGER PRIMARY KEY, name VARCHAR(50), birthday DATE, email VARCHAR(100));
INSERT INTO employee01 (id, name, birthday, email) values 
(1,'tugrul kurt', '1998-11-20', 'tgrlkrt1881@gmail.com');
UPDATE EMPLOYEE01 SET NAME ='TUĞRUL KURT' WHERE ID = 1;
DELETE FROM EMPLOYEE01 WHERE ID=2;
