-- Exercise 5:

CREATE TABLE `cats` (
  `cat_id` INT AUTO_INCREMENT NOT NULL,
  `name` VARCHAR(100),
  `breed` VARCHAR(100),
  `age` INT,
  PRIMARY KEY (`cat_id`)
);

INSERT INTO
  cats(name, breed, age)
VALUES
  ('Ringo', 'Tabby', 4),
  ('Cindy', 'Maine Coon', 10),
  ('Dumbledore', 'Maine Coon', 11),
  ('Egg', 'Persian', 4),
  ('Misty', 'Tabby', 13),
  ('George Michael', 'Ragdoll', 9),
  ('Jackson', 'Sphynx', 7);

-- select only cat_id from cats
SELECT cat_id FROM cats;

-- select name, breed from cats
SELECT name, breed FROM cats;

-- select name, age from cats where breed is Tabby
SELECT name, age FROM cats WHERE breed = 'Tabby';

-- select cat_id, age from cats where cat_id is the same as age
SELECT cat_id, age FROM cats WHERE cat_id = age;

-- change Jackson's name to Jack
UPDATE cats SET name = 'Jack' WHERE name = 'Jackson';

-- change Ringo's breed to British Shorthair
UPDATE cats SET breed = 'British Shorthair' WHERE name = 'Ringo';

-- update both Maine Coons ages to be 12
UPDATE cats SET age = 12 WHERE breed = 'Maine Coon';

-- delete all 4 year old cats
DELETE FROM cats WHERE age = 4;

-- delete cats whose age is the same as their id
DELETE FROM cats WHERE cat_id = age;

-- delete all cats
DELETE FROM cats;