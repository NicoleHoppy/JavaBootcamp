### Week 5 / Section 02 — SQL Basics: Tables, Inserts, Queries & Updates

**Focus:** Practicing SQL fundamentals by creating tables, inserting records, querying data, and performing updates/deletes in MySQL.

**🎯 Key exercises:**
1. **Tweets table** → created `tweets` table with `username` (VARCHAR(15)), `content` (VARCHAR(140)), and `favourites` (INT). Practiced schema design with correct MySQL datatypes.
2. **Pastries table** → defined `pastries` table with `name` (VARCHAR(50)) and `quantity` (INT). Verified schema in CLI, then dropped the table using `DROP TABLE`.
3. **People table & inserts** → created `people` table (`first_name`, `last_name`, `age`). Inserted individual rows (`Tina Belcher`, `Bob Belcher`) and multiple rows in a single statement (`Linda Belcher`, `Phillip Frond`, `Calvin Fischoeder`).
4. **Employees table with constraints** → created `employees` table with `id` (AUTO_INCREMENT, PK), required `first_name`, `last_name`, optional `middle_name`, `age`, and `current_status` (default `'employed'`).
5. **Cats table & data manipulation** → defined `cats` table (`cat_id`, `name`, `breed`, `age`) and inserted 7 rows.
    - Queried columns (`SELECT cat_id`, `SELECT name, breed`, conditions on `breed`, comparisons).
    - Updated rows (`SET name = 'Jack'`, change breed, update ages).
    - Deleted subsets (`WHERE age = 4`, `WHERE cat_id = age`) and finally all rows (`DELETE FROM cats`).
6. **Books table & string functions** → created `books` table with author details, release year, stock, and pages. Inserted multiple rows. Queried with string manipulation:
    - `CONCAT` to print author full names.
    - `UPPER` + `REVERSE` for text transformations.
    - `REPLACE` to substitute spaces with arrows.
    - `LEFT` to abbreviate titles and combine with stock info.
    - Custom outputs like: *"The Namesake was released in 2003"*.

**🏋️ Skills demonstrated:**
- Creating SQL tables with **VARCHAR**, **INT**, **AUTO_INCREMENT**, **NOT NULL**, and **DEFAULT** constraints.
- Inserting single and multiple rows with `INSERT INTO`.
- Querying data with `SELECT`, including filtering with `WHERE`.
- Using **string functions**: `CONCAT`, `UPPER`, `REVERSE`, `REPLACE`, `LENGTH`, `LEFT`.
- Performing **UPDATE** and **DELETE** statements with conditions.
- Practicing table lifecycle: create → insert → query → update/delete → drop.

**💻 Example CLI output:**

```
mysql> SELECT cat_id, name, age FROM cats WHERE breed = 'Tabby';
```

| cat_id | name | age |
|--------|-------|-----|
| 1 | Ringo | 4 |
| 5 | Misty | 13 |

```
mysql> SELECT CONCAT(title, ' was released in ', released_year) AS blurb FROM books LIMIT 2;
```

| blurb                                 |
|:--------------------------------------|
| The Namesake was released in 2003     |
| Norse Mythology was released in 2016  |

