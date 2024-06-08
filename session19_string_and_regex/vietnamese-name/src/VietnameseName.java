import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class VietnameseName {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        String namePattern  = "^[A-ZÀÁẢẠÃĂẰẮẲẶẴÂẦẤẨẬẪĐÈÉẺẸẼÊỀẾỂỆỄÌÍỈỊĨÒÓỎỌÕÔỒỐỔỘỖƠỜỚỞỢỠÙÚỦỤŨƯỪỨỬỰỮỲÝỶỴỸ]" +
                "[a-zàáảạãăằắẳặẵâầấẩậẫđèéẻẹẽêềếểệễìíỉịĩòóỏọõôồốổộỗơờớởợỡùúủụũưừứửựữỳýỷỵỹ]" +
                "*([\\s][A-ZÀÁẢẠÃĂẰẮẲẶẴÂẦẤẨẬẪĐÈÉẺẸẼÊỀẾỂỆỄÌÍỈỊĨÒÓỎỌÕÔỒỐỔỘỖƠỜỚỞỢỠÙÚỦỤŨƯỪỨỬỰỮỲÝỶỴỸ]" +
                "[a-zàáảạãăằắẳặẵâầấẩậẫđèéẻẹẽêềếểệễìíỉịĩòóỏọõôồốổộỗơờớởợỡùúủụũưừứửựữỳýỷỵỹ]*)*$";
        Pattern pattern = Pattern.compile(namePattern);

        System.out.print("Enter the name : ");
        name = sc.nextLine();
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()) {
            System.out.println("Name is valid: " + name);
        } else {
            System.out.println("Name is invalid: " + name);
        }
    }
}
