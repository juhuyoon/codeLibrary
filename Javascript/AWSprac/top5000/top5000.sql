DROP DATABASE IF EXISTS top5000Songs;
CREATE database top5000Songs;

USE top5000Songs;

CREATE TABLE top5000 (
    position int NOT NULL PRIMARY KEY,
    artist VARCHAR(100) NOT NULL,
    song VARCHAR(100) NOT NULL,
    year INT,
    raw_total DECIMAL(10,4) NULL,
    raw_usa DECIMAL(10,4) NULL,
    raw_uk DECIMAL(10,4) NULL,
    raw_eur DECIMAL(10,4) NULL,
    raw_row DECIMAL(10,4) NULL
)