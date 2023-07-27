package kz.kopanitsa.lesson.week8.model;

public class Student {
    public String lastName;
    public Double averageScore;

    public Student(String lastName, Double averageScore) {
        this.lastName = lastName;
        this.averageScore = averageScore;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(Double averageScore) {
        this.averageScore = averageScore;
    }
}
