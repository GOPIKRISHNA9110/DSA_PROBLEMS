# Write your MySQL query state
DELETE P1 FROM Person P1
JOIN Person p2
ON p1.email = p2.email
WHERE p1.id > p2.id ;