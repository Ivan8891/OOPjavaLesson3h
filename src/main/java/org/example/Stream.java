package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterator<Group>, Iterable<Group> {


    private List<Group> groupList = new ArrayList<>();
    private String name;

    private int currentIndex = 0;
    public int getSize(){
        return groupList.size();
    }

    public Stream(String name, List<Group> groupList){
        this.name = name;
        this.groupList=groupList;
    }
    public static void printGroups(Stream groups){
        while (groups.hasNext()){
            System.out.println(groups.next());
        }
    }

    @Override
    public boolean hasNext() {
        return currentIndex < groupList.size();
    }

    @Override
    public Group next() {
        if (hasNext()) {
            return groupList.get(currentIndex++);
        }
        throw new IllegalArgumentException();
    }
    public Group searchGroup(String name, int numberGroup, int numbersOfStudents){
        for(Group group: groupList){
            if(group.getName().equalsIgnoreCase(name) &&
            group.getNumberGroup() == numberGroup &&
            group.getNumbersOfStudents() == numbersOfStudents){
                return group;
            }
        }
        System.out.println("not group");
        throw new IllegalArgumentException();
    }


    @Override
    public Iterator<Group> iterator() {
        return (Iterator<Group>) this;
    }

    @Override
    public String toString() {
        return "ПОТОК " + name +
                "\nСписок групп:\n" + groupList;
    }

    public void remove(Group group){
        groupList.remove(group);
    }
}
