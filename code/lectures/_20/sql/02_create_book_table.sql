USE lecture20;

CREATE TABLE book(
     id INT AUTO_INCREMENT,
     title VARCHAR(255) NOT NULL,
     author VARCHAR(255) NOT NULL,
     ISBN BIGINT UNIQUE NOT NULL,
     PRIMARY KEY(id)
);