// Encapsulation = it ensure that the internal working of a class are hidden. it is use for data bundling.
class School {

    private String name;
    private int year;

    public String getName() { 
        return name; 
    }
    public void setName(String name) { 
        this.name = name; 
    }
    public int getAge() { 
        return year; 
    }
    public void setAge(int year) { 
        this.year = year; 
    }
}

public class encapsulation {
    public static void main(String[] args) {

        School objectofSchool = new School();
        objectofSchool.setName("Ashok");
        objectofSchool.setAge(25);

        System.out.println("Name is : " + objectofSchool.getName());
        System.out.println("Age is : " + objectofSchool.getAge());
    }
}
