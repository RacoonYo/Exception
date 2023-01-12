import java.io.FileWriter;
import java.io.IOException;

public class FileCreator {
    User user = new User();

    public FileCreator(User user) {
        this.user = user;
    }

    void fc() {
        try (FileWriter fw = new FileWriter(user.surname + ".txt", true)) {
            StringBuilder sb = new StringBuilder("<" + user.surname + ">" + "<" + user.name + ">" +
                    "<" + user.patronymic + ">" + "<" + user.birthday + ">" + "<" + user.phoneNum + ">" +
                    "<" + user.sex + ">" + "\n");
            fw.write(sb.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
