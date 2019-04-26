DROP DATABASE IF EXISTS calculate_dev;
DROP DATABASE IF EXISTS calculate_test;

CREATE DATABASE calculate_dev;
CREATE DATABASE calculate_test;

CREATE USER IF NOT EXISTS 'calculate'@'localhost'
  IDENTIFIED BY '';
GRANT ALL PRIVILEGES ON calculate_dev.* TO 'calculate' @'localhost';
GRANT ALL PRIVILEGES ON calculate_test.* TO 'calculate' @'localhost';