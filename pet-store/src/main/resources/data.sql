DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS pet_store;
DROP TABLE IF EXISTS pet_store_customer;


CREATE TABLE pet_store (
  pet_store_id INT AUTO_INCREMENT NOT NULL,
  pet_store_name VARCHAR(128) NOT NULL,
  pet_store_address VARCHAR(128),
  pet_store_city VARCHAR(64),
  pet_store_state VARCHAR(64),
  pet_store_zip INT,
  pet_store_phone INT,
  PRIMARY KEY (pet_store_id)
);

CREATE TABLE customer (
customer_id INT AUTO_INCREMENT NOT NULL,
customer_first_name VARCHAR(64) NOT NULL,
customer_last_name VARCHAR(64) NOT NULL,
customer_email VARCHAR(64),
PRIMARY KEY (customer_id)
);

CREATE TABLE employee (
employee_id INT AUTO_INCREMENT NOT NULL,
pet_store_id INT NOT NULL,
employee_first_name VARCHAR(64),
employee_last_name VARCHAR(64),
employee_phone INT,
employee_job_title VARCHAR(64),
PRIMARY KEY (employee_id),
FOREIGN KEY (pet_store_id)
	REFERENCES pet_store (pet_store_id)
	ON DELETE CASCADE
);


