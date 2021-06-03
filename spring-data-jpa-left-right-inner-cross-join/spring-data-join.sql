

-- Dumping database structure for roytuts

-- Dumping structure for table roytuts.department
CREATE TABLE department (id int NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1), name varchar(40) NOT NULL, description varchar(150) NOT NULL,PRIMARY KEY (id)) 

INSERT INTO department (name,description) VALUES ('IT', 'Information Technology'),('TelComm', 'Telecommunication'),('Ins', 'Insurance'),('HR', 'Human Resources');

-- Dumping structure for table roytuts.employee
CREATE TABLE employee (id int NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1),name varchar(40) NOT NULL,email varchar(150) NOT NULL,address varchar(250) DEFAULT NULL,dept_id int DEFAULT NULL,PRIMARY KEY (id),CONSTRAINT employee_ibfk_1 FOREIGN KEY (dept_id) REFERENCES department (id)) 

-- Dumping data for table roytuts.employee: ~0 rows (approximately)
INSERT INTO employee (name, email, address,dept_id) VALUES('Soumitra', 'soumitra@gmail.com', NULL, 1),('Suman', 'suman@gmail.com', NULL, 2),('Avisek', 'avisek@gmail.com', NULL, 3);
