-- Create cats table
CREATE TABLE cats (
  id INTEGER PRIMARY KEY,
  name TEXT,
  age INTEGER,
  favoriteFood TEXT
);
-- Create dogs table
CREATE TABLE dogs (
  id INTEGER PRIMARY KEY,
  name TEXT,
  age INTEGER,
  favoriteFood TEXT
);

-- sample inserts into cats table
INSERT INTO cats (name, age, favoriteFood) VALUES ('Mittens', 3, 'tuna');
INSERT INTO cats (name, age, favoriteFood) VALUES ('Fluffy', 2, 'catnip');

-- sample inserts into dogs table
INSERT INTO dogs (name, age, favoriteFood) VALUES ('Fido', 4, 'steak');
INSERT INTO dogs (name, age, favoriteFood) VALUES ('Spot', 1, 'kibble');