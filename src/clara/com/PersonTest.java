package clara.com;

class PersonTest {

    private Person personObject = new Person("Clara",11);
    String name;
    String age;

    @org.junit.jupiter.api.Test
    String getName() {
        return name;
    }

    @org.junit.jupiter.api.Test
    void setName() {
        this.name=name;
    }

    @org.junit.jupiter.api.Test
    String getAge() {
        return age;
    }

    @org.junit.jupiter.api.Test
    void setAge() {
        this.name=age;
    }

    @org.junit.jupiter.api.Test
    String reverseName() {
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