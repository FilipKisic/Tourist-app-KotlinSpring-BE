DROP TABLE sight;
CREATE TABLE sight (
    id      INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
    title   VARCHAR NOT NULL,
    description VARCHAR,
    address VARCHAR,
    lat     FLOAT   NOT NULL,
    lng     FLOAT   NOT NULL,
    rating  INTEGER NOT NULL
);