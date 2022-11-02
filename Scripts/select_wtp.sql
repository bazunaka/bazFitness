SELECT Workouts.WorkoutName, TrainingPlan.TrainingName, WorkoutTrainingPlan.CountApproach, WorkoutTrainingPlan.CountRepeat, Days.DayName
FROM Workouts, TrainingPlan, WorkoutTrainingPlan, Days
WHERE Workouts.WorkoutID = WorkoutTrainingPlan.WorkoutID AND TrainingPlan.TrainingID = WorkoutTrainingPlan.TrainingPlanID AND
Days.DayID = WorkoutTrainingPlan.Day;
