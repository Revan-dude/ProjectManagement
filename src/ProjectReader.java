import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ProjectReader {

    public static List<Project> readProjects() throws IOException {
        return Files.readAllLines(Path.of(System.getProperty("user.dir"), "src",
                        "projects.csv")).stream()
                .skip(1)
                .filter(line -> line.matches("\\w+,\\w+,(IT|SALES|HR|FINANCE),\\d+"))
                .map(Project::new)
                .toList();

    }

}
