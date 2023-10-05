package org.example;

public class Group {
    private String name;
    private int numberGroup;
    private int numbersOfStudents;
    Group(String name, int numberGroup, int numbersOfStudents){
        this.name=name;
        this.numberGroup=numberGroup;
        this.numbersOfStudents=numbersOfStudents;
    }

    public String getName() {
        return name;
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    public int getNumbersOfStudents() {
        return numbersOfStudents;
    }

    @Override
    public String toString() {
        return "Название группы: " + name + "\n" +
                "Номер группы: " + numberGroup + "\n" +
                "Количество студентов: " + numbersOfStudents + "\n" +
                "______________________________\n";
    }
}
