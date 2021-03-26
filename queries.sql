## Part 1: Test it with SQL
columns: id (int), employer (varchar(255)), name (varchar(255)), skills (varchar(255));

## Part 2: Test it with SQL
SELECT * FROM employer WHERE location = 'St. Louis City';

## Part 3: Test it with SQL
DROP TABLE job;

## Part 4: Test it with SQL
SELECT skill.name, skill.description FROM skill INNER JOIN job_skills WHERE skill.id = job_skills.skills_id AND job_skills.jobs_id IS NOT NULL ORDER BY skill.name ASC;