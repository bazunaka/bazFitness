INSERT INTO WorkoutTrainingPlan (WorkoutID, TrainingPlanID, CountApproach, CountRepeat, Day)
VALUES ((SELECT WorkoutID FROM Workouts WHERE WorkoutName = 'Жим ногами'), 1, 2, 18, 2),
((SELECT WorkoutID FROM Workouts WHERE WorkoutName = 'Подъем на носках сидя'), 1, 3, 15, 2),
((SELECT WorkoutID FROM Workouts WHERE WorkoutName = 'Жим лежа узким хватом'), 1, 2, 12, 2),
((SELECT WorkoutID FROM Workouts WHERE WorkoutName = 'Французский жим'), 1, 1, 12, 2),
((SELECT WorkoutID FROM Workouts WHERE WorkoutName = 'Скручивания'), 1, 3, NULL, 2);