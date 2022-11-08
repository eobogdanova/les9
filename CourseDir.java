package les9;

import les1.Course;

public class CourseDir implements Course {
    private String name;

    public CourseDir (String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}