INSERT INTO WorkoutTrainingPlan (WorkoutID, TrainingPlanID, CountApproach, CountRepeat, Day)
VALUES ((SELECT WorkoutID FROM Workouts WHERE WorkoutName = 'Жим лежа с поднятым головным концом скамьи'), 2, 4, 8, 2),
((SELECT WorkoutID FROM Workouts WHERE WorkoutName = 'Жим лежа на горизонтальной скамье'), 2, 3, 10, 2),
((SELECT WorkoutID FROM Workouts WHERE WorkoutName = 'Сведение рук на кроссовере вверх'), 2, 3, 12, 2),
((SELECT WorkoutID FROM Workouts WHERE WorkoutName = 'Тяга за голову на высоком блоке'), 2, 3, 12, 2),
((SELECT WorkoutID FROM Workouts WHERE WorkoutName = 'Тяга нижнего блока обратным хватом'), 2, 3, 15, 2),

((SELECT WorkoutID FROM Workouts WHERE WorkoutName = 'Приседания со штангой на плечах'), 2, 3, 10, 4),
((SELECT WorkoutID FROM Workouts WHERE WorkoutName = 'Жим ногами с узкой постановкой'), 2, 3, 10, 4),
((SELECT WorkoutID FROM Workouts WHERE WorkoutName = 'Становая тяга со штангой на прямых ногах'), 2, 3, 10, 4),
((SELECT WorkoutID FROM Workouts WHERE WorkoutName = 'Сгибания ног в тренажере'), 2, 3, 10, 4),
((SELECT WorkoutID FROM Workouts WHERE WorkoutName = 'Подъем на носках сидя'), 2, 3, 10, 4),
((SELECT WorkoutID FROM Workouts WHERE WorkoutName = 'Шраги со штангой'), 2, 3, 10, 4),

((SELECT WorkoutID FROM Workouts WHERE WorkoutName = 'Армейский жим с гантелями'), 2, 3, 10, 6),
((SELECT WorkoutID FROM Workouts WHERE WorkoutName = 'Разведение рук с гантелями'), 2, 4, 8, 6),
((SELECT WorkoutID FROM Workouts WHERE WorkoutName = 'Тяга Т-грифа в тренажере'), 2, 4, 8, 6),
((SELECT WorkoutID FROM Workouts WHERE WorkoutName = 'Разгибание рук на трицепс с использованием канатной рукояти'), 2, 3, 12, 6),
((SELECT WorkoutID FROM Workouts WHERE WorkoutName = 'Сгибание рук с гантелями хватом «молоток»'), 2, 3, 12, 6),
((SELECT WorkoutID FROM Workouts WHERE WorkoutName = 'Поочередное сгибание рук с гантелями'), 2, 3, 12, 6),


((SELECT WorkoutID FROM Workouts WHERE WorkoutName = 'Тяга гантелей в наклоне'), 3, 3, 10, 3),
((SELECT WorkoutID FROM Workouts WHERE WorkoutName = 'Подтягивания широким хватом'), 3, 4, 8, 3),
((SELECT WorkoutID FROM Workouts WHERE WorkoutName = 'Тяга верхнего блока к груди обратным хватом'), 3, 3, 10, 3),
((SELECT WorkoutID FROM Workouts WHERE WorkoutName = 'Жим гантелей на горизонтальной скамье'), 3, 3, 12, 3),
((SELECT WorkoutID FROM Workouts WHERE WorkoutName = 'Разведение гантелей с поднятым головным концом скамьи'), 3, 3, 15, 3);

'доделать тренировочный план через ПО - sportwiki.to/тренировочная программа 3 и 4 тренировки в неделю' 