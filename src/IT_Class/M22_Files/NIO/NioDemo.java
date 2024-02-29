package IT_Class.M22_Files.NIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.stream.Stream;

public class NioDemo {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            Path path = Paths.get("src/_data/" + "folder" + Integer.toString(i));
            //System.out.println(path);
            try {
                Stream<Path> walk = Files.walk(path);
                walk.sorted(Comparator.naturalOrder())
                        .map(Path::toFile)
                        .peek(System.out::println)
                        .forEach(File::delete);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static void createDir(String name){
        Path path = Paths.get("src/_data/"+name);
        try {
            Files.createDirectory(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void createFile(String name){
        Path path = Paths.get("src/_data/"+name);
        try {
            Files.createFile(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
