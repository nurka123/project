class WorkoutRoutine {
    private String exerciseName;
    private int duration;  // В минутах
    private int caloriesBurned;  // Сожженные калории

    public WorkoutRoutine(String exerciseName, int duration, int caloriesBurned) {
        this.exerciseName = exerciseName;
        this.duration = duration;
        this.caloriesBurned = caloriesBurned;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    public void setCaloriesBurned(int caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }


    public String toString() {
        return "WorkoutRoutine{exerciseName='" + exerciseName + "', duration=" + duration + " min, caloriesBurned=" + caloriesBurned + " cal}";
    }
}
