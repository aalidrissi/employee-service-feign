
CREATE TABLE IF NOT EXISTS Employee (
    id SERIAL PRIMARY KEY,
    e_name VARCHAR(255),
    city VARCHAR(255)
);

INSERT INTO Employee (e_name,city)
VALUES ('Akram','1');