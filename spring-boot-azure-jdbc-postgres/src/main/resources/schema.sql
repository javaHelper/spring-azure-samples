DROP TABLE IF EXISTS todo;
CREATE TABLE todo (id SERIAL PRIMARY KEY, description VARCHAR(255), details VARCHAR(4096), done BOOLEAN);

INSERT INTO public.todo
(description, details, done)
VALUES('configuration', 'congratulations, you have set up JDBC correctly!', true);