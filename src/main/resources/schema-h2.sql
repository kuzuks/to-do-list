CREATE TABLE Tasks(
    Id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Title VARCHAR(60) NOT NULL,
    Status BIT NOT NULL,
    Description VARCHAR(200),
    UNIQUE(id)
);