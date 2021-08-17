Create a database with name "postgres" 

//run this query to create the following table:

CREATE TABLE greetings(
    greeting_id SERIAL,
    greeting_message VARCHAR(256),
    greeting_sender_name VARCHAR(256),
    greeting_receiver_name VARCHAR(256)
);

//use following query to insert fields in the table

INSERT INTO 
greetings(greeting_id,greeting_message,greeting_sender_name,greeting_receiver_name)
Values(1,'hello','youssef','hany'),
(2,'hello','youssef','hany'),
(3,'hello','youssef','hany'),
(4,'hello','youssef','hany'),
(5,'hello','youssef','hany'),
(6,'hello','youssef','hany'),
(7,'hello','youssef','hany'),
(8,'hello','youssef','hany'),
(9,'hello','youssef','hany'),
(10,'hello','youssef','hany'),
(11,'hello','youssef','hany'),
(12,'hello','youssef','hany'),
(13,'hello','youssef','hany'),
(14,'hello','youssef','hany'),
(15,'hello','youssef','hany'),
(16,'hello','youssef','hany'),
(17,'hello','youssef','hany'),
(18,'hello','youssef','hany'),
(19,'hello','youssef','hany'),
(20,'hello','youssef','hany'),
(21,'hello','youssef','hany'),
(22,'hello','youssef','hany'),
(23,'hello','youssef','hany'),
(24,'hello','youssef','hany'),
(25,'hello','youssef','hany'),
(26,'hello','youssef','hany'),
(27,'hello','youssef','hany'),
(28,'hello','youssef','hany'),
(29,'hello','youssef','hany'),
(30,'hello','youssef','hany'),
(31,'hello','youssef','hany'),
(32,'hello','youssef','hany'),
(33,'hello','youssef','hany'),
(34,'hello','youssef','hany'),
(35,'hello','youssef','hany')

//make sure to specify the right cross origin port