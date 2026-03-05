import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EmployeeReader {

    public static List<Employee> readEmployees() throws IOException {
        return Files.readAllLines(Path.of(System.getProperty("user.dir"), "src",
                "employee.csv")).stream()
                .skip(1)
                .filter(line -> line.matches("\\d+,[A-Za-z]+,(IT|SALES|HR|FINANCE),\\d+,\\d+,(\\w+([|])?)+"))
                .map(Employee::new)
                .toList();

    }

}
