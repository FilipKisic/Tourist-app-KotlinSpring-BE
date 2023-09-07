CREATE TABLE IF NOT EXISTS sight (
    id      VARCHAR(60) DEFAULT RANDOM_UUID()   PRIMARY KEY,
    title   VARCHAR NOT NULL,
    description VARCHAR,
    address VARCHAR,
    lat     FLOAT   NOT NULL,
    lng     FLOAT   NOT NULL,
    rating  INTEGER NOT NULL
);