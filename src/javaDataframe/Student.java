package javaDataframe;

public class Student implements Comparable<Student>{
    public int age;
    public String name;
    public int weight;
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public int getWeight(){
        return weight;
    }
    public Student(int age,String name,int weight){
        this.age = age;
        this.name = name;
        this.weight = weight;
     }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Student that) {
//        this method is call for current object
//        we will define our sorting logic here
//        sorting basic own age
        return that.age - this.age;
    }


}
