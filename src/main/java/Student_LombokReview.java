//every class need a no parameter constructor / like defaul constructor

//this is boilerplate: meaning the code that is used a lot but still doesn't change or small change
import lombok.*;

//this replaces all the code down in the comments
//Static fields are not initialized in the constructors tho
//Final fields are not initialized in the constructor too, but to have it
//you can write @RequiredArgsConstructor -> We won't use it
@NoArgsConstructor
@AllArgsConstructor
//@AllArgsConstructor(ACCESS = AccessLevel.PRIVATE) --> Have a private constructor -> Not very important
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Data
public class Student_LombokReview {

    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private int age;

    /*

    commenting below because we will use LOMBOK on top of the class name


    public Student(){

    }

    public Student(String firstName, String lastName, String userName, String email, String password, String confirmPassword, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(userName, student.userName) && Objects.equals(email, student.email) && Objects.equals(password, student.password) && Objects.equals(confirmPassword, student.confirmPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, userName, email, password, confirmPassword, age);
    }


     */
}
