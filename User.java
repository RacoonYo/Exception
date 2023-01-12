public class User {

    String birthday;
    String surname;
    String name;
    String patronymic;
    Integer phoneNum;
    Character sex;

    @Override
    public String toString() {
        return "User{" +
                "birthday='" + birthday + '\'' +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", phoneNum=" + phoneNum +
                ", sex=" + sex +
                '}';
    }
}
