import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Checker {
    String[] data;
    User user;


    public Checker(String[] data, User user) {
        this.data = data;
        this.user = user;
    }

    public void checker() {
        switch (lengthChecker()) {
            case -1 -> throw new RuntimeException("Введены не все данные");
            case -2 -> throw new RuntimeException("Введено слишко много дынных");
            case 1 -> formatChecker();
        }
    }


    private int lengthChecker() {
        int length = data.length;
        if (length < 6) return -1;
        else if (length > 6) return -2;
        else {
            return 1;
        }
    }

    private void formatChecker() {
        boolean flagNum = true;
        boolean flagSex = true;
        boolean flagBirthday = true;
        int flagName = 0;
        Pattern pattern = Pattern.compile("(\\d{2}\\.){2}\\d{4}");
        for (String el : data) {
            try {
                user.phoneNum = Integer.valueOf(el);
                flagNum = !flagNum;
                while (flagNum) throw new RuntimeException("Введено два номера телефона");

            } catch (NumberFormatException e){
                if (el.equals("f") || el.equals("m")) {
                    user.sex = el.charAt(0);
                    flagSex = !flagSex;
                    while (flagSex) throw new RuntimeException("Введено два пола");

                } else {
                    Matcher matcher = pattern.matcher(el);
                    if (matcher.matches()){
                        user.birthday = el;
                        flagBirthday = !flagBirthday;
                        while (flagBirthday) throw new RuntimeException("Введено два дня рождения");

                    } else {
                        switch (flagName) {
                            case 0 :
                                user.surname = el;
                                flagName++;
                                break;
                            case 1:
                                user.name = el;
                                flagName++;
                                break;
                            case 2:
                                user.patronymic = el;
                                flagName++;
                                break;
                            default:
                                throw new RuntimeException("Не коректно введены данные");
                        }
                    }
                }
            }
        }
    }
}
