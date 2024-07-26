CREATE TABLE employee (
    id INT PRIMARY KEY,
    name VARCHAR(255),
    department VARCHAR(255),
    salary DECIMAL(10, 2)
);

INSERT INTO employee (id, name, department, salary) VALUES (1, 'Employee 1', 'Engineering', 80000);
INSERT INTO employee (id, name, department, salary) VALUES (2, 'Employee 2', 'Marketing', 75000);
INSERT INTO employee (id, name, department, salary) VALUES (3, 'Employee 3', 'Sales', 70000);
