CREATE TABLE IF NOT EXISTS movies(
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    minutes INT NOT NULL,
    genre VARCHAR(50) NOT NULL,
    director VARCHAR(50) NOT NULL
);

INSERT INTO movies (name, minutes, genre, director) VALUES
    ('Dark Knight', 152, 'ACTION', 'Steven Spielberg'),
    ('Memento', 113, 'THRILLER', 'Steven Spielberg'),
    ('Matrix', 136, 'ACTION', 'Richard Fort')