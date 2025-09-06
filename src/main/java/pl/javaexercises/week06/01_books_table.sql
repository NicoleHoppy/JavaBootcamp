-- Exercise 1:

CREATE TABLE `books` (
  `book_id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(100),
  `author_fname` VARCHAR(100),
  `author_lname` VARCHAR(100),
  `released_year` INT,
  `stock_quantity` INT,
  `pages` INT,
  PRIMARY KEY(`book_id`)
 );

INSERT INTO
  books (title, author_fname, author_lname, released_year, stock_quantity, pages)
VALUES
  ('The Namesake', 'Jhumpa', 'Lahiri', 2003, 32, 291),
  ('Norse Mythology', 'Neil', 'Gaiman',2016, 43, 304),
  ('American Gods', 'Neil', 'Gaiman', 2001, 12, 465),
  ('Interpreter of Maladies', 'Jhumpa', 'Lahiri', 1996, 97, 198),
  ('A Hologram for the King: A Novel', 'Dave', 'Eggers', 2012, 154, 352),
  ('The Circle', 'Dave', 'Eggers', 2013, 26, 504),
  ('The Amazing Adventures of Kavalier & Clay', 'Michael', 'Chabon', 2000, 68, 634),
  ('Just Kids', 'Patti', 'Smith', 2010, 55, 304),
  ('A Heartbreaking Work of Staggering Genius', 'Dave', 'Eggers', 2001, 104, 437),
  ('Coraline', 'Neil', 'Gaiman', 2003, 100, 208),
  ('What We Talk About When We Talk About Love: Stories', 'Raymond', 'Carver', 1981, 23, 176),
  ('Where I\'m Calling From: Selected Stories', 'Raymond', 'Carver', 1989, 12, 526),
  ('White Noise', 'Don', 'DeLillo', 1985, 49, 320),
  ('Cannery Row', 'John', 'Steinbeck', 1945, 95, 181),
  ('Oblivion: Stories', 'David', 'Foster Wallace', 2004, 172, 329),
  ('Consider the Lobster', 'David', 'Foster Wallace', 2005, 92, 343);

-- print all titles that contain 'stories'

SELECT
  title
FROM books
  WHERE title LIKE '%stories%';

-- find the longest book, print out title and page count

SELECT
  title, pages
FROM books
  ORDER BY pages DESC LIMIT 1;

-- print a summary containing the title and year for the 3 most recent books

SELECT
  CONCAT(title, ' - ', released_year) AS `summary`
FROM books
  ORDER BY released_year DESC LIMIT 3;

-- find all books with an author_lname that contains a space(" ")

SELECT
  title, author_lname
FROM books
  WHERE author_lname LIKE '% %';

-- find 3 books with the lowest stock, select title, year and stock

SELECT
  title, released_year, stock_quantity
FROM books
  ORDER BY stock_quantity ASC LIMIT 3;

-- print title and author_lname, sorted first by author_lnane and then by title

SELECT
  title, author_lname
FROM books
  ORDER BY author_lname, title;

-- sort alphabetically by last name

SELECT
  UPPER(CONCAT('MY FAVOURITE AUTHOR IS ', author_fname, ' ', author_lname)) AS `yell`
FROM books
  ORDER BY author_lname;

-- print the number of books in the database

SELECT
  COUNT(title)
FROM books;

-- print out how many books were released in each year

SELECT
  released_year, COUNT(title) AS `number of books`
FROM books
  GROUP BY released_year
  ORDER BY released_year DESC;

-- print out the total number of books in stock

SELECT
  SUM(stock_quantity) AS `number of books in the stock`
FROM books;

-- find the average released_year for each author

SELECT
  author_lname, AVG(released_year)
FROM books
  GROUP BY author_lname;

-- find the full name of the author who wrote the longest book

SELECT
  CONCAT(author_fname, ' ', author_lname) AS `full_name`, pages
FROM books
  ORDER BY pages
  DESC LIMIT 1;

-- print average pages of books by year

SELECT
  released_year, count(title), AVG(pages) AS `average number of pages`
FROM books
  GROUP BY released_year
  ORDER BY released_year ASC;

-- select all books written before 1980 (not inclusive)

SELECT
  title, released_year
FROM books
  WHERE released_year < 1980;

-- select all books written by Eggers or Chabon

SELECT
  title, author_fname, author_lname
FROM books
  WHERE author_lname = 'Eggers' OR author_lname = 'Chabon';

-- select all books written by Lahiri, published after 2000

SELECT
  title, author_fname, author_lname, released_year
FROM books
  WHERE author_lname = 'Lahiri' AND released_year > 2000;

-- select all books with page counts between 100 and 200

SELECT
  title, pages
FROM books
  WHERE pages BETWEEN 100 AND 200;

-- select all books where author_lname starts with a 'C' or an 'S'

SELECT
  title, author_fname, author_lname
FROM books
  WHERE author_lname
  LIKE 'C%' OR author_lname LIKE 'S%';