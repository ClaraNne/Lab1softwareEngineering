package clara.com;

public class Person {
    String name;
    int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String reverseName (String name){

        char[] reversed = new char[name.length()];
        int reversedIndex = 0;
        for (int i =  name.length() -1; i >= 0; i--) {
            reversed[reversedIndex] = name.charAt(i);
            reversedIndex++;
        }
        String reverseName = "";
        for (int i = 0; i < name.length(); i++) {
            reverseName = reverseName + reversed[i];
            
        }
        return new String(reversed);
    }
}
