-- Exercise 4:

-- Define an `employees` table with the following fields:
-- - id: number, automatically increments, primary key
-- - last_name: text, mandatory
-- - first_name: text, mandatory
-- - middle_name: text, not mandatory
-- - age: number, mandatory
-- - current_status: text, mandatory, defaults to 'employed'

CREATE TABLE `employees` (
  `id` INT AUTO_INCREMENT NOT NULL,
  `last_name` VARCHAR(255) NOT NULL,
  `first_name` VARCHAR(255) NOT NULL,
  `middle_name` VARCHAR(255),
  `age` INT NOT NULL,
  `current_status` VARCHAR(255) NOT NULL DEFAULT 'employed',
  PRIMARY KEY (`id`)
);
