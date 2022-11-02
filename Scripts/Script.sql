SELECT * FROM MuscleGroups mg ;

SELECT * FROM Workouts w ;

SELECT w.WorkoutName FROM Workouts w, MuscleGroups mg WHERE mg.GroupName = "Живот" ;

SELECT WorkoutID, WorkoutName, count(*) FROM Workouts w GROUP BY WorkoutName HAVING count(*) > 1;

SELECT * FROM Workouts w WHERE WorkoutName LIKE 'Шраги%';