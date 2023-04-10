public class User {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalNameException {
        if (name.length() > 20) {
            throw new IllegalNameException("Length of name must be less than 20. You entered : " + name.length());
        }
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age < 0 || age > 100) {
            throw new IllegalAgeException("Exception. Age can't be less than 0 or more " +
                    "than 100. You entered : " + age);
        }
        this.age = age;
    }
}
