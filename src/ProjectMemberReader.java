import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ProjectMemberReader {

    public static List<ProjectMember> readProjectMembers() throws IOException {
                return Files.readAllLines(Path.of(System.getProperty("user.dir"), "src",
                        "project_members.csv")).stream()
                .skip(1)
                .filter(line -> line.matches("\\w+,\\d+,[A-Za-z _]+,\\d+"))
                .map(ProjectMember::new)
                .toList();

    }

}
