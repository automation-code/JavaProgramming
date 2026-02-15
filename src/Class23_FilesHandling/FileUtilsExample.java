package Class23_FilesHandling;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Properties;

public class FileUtilsExample {
    private FileUtilsExample() {
        // Prevent instantiation
    }

    public static String readFileAsString(String filePath) {
        try {
            return Files.readString(Paths.get(filePath), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException("Failed to read file: " + filePath, e);
        }
    }

    public static List<String> readFileAsLines(String filePath) {
        try {
            return Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException("Failed to read lines from file: " + filePath, e);
        }
    }

    public static void writeToFile(String filePath, String content) {
        try {
            Files.write(Paths.get(filePath), content.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException("Failed to write file: " + filePath, e);
        }
    }

    public static void appendToFile(String filePath, String content) {
        try {
            Files.write(
                    Paths.get(filePath),
                    content.getBytes(StandardCharsets.UTF_8),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );
        } catch (IOException e) {
            throw new RuntimeException("Failed to append to file: " + filePath, e);
        }
    }

    public static void copyFile(String sourcePath, String destinationPath) {
        try {
            Path source = Paths.get(sourcePath);
            Path destination = Paths.get(destinationPath);
            Files.createDirectories(destination.getParent());
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException("Failed to copy file from " + sourcePath + " to " + destinationPath, e);
        }
    }

    public static void moveFile(String sourcePath, String destinationPath) {
        try {
            Path source = Paths.get(sourcePath);
            Path destination = Paths.get(destinationPath);
            Files.createDirectories(destination.getParent());
            Files.move(source, destination, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException("Failed to move file from " + sourcePath + " to " + destinationPath, e);
        }
    }

    public static void deleteFile(String filePath) {
        try {
            Files.deleteIfExists(Paths.get(filePath));
        } catch (IOException e) {
            throw new RuntimeException("Failed to delete file: " + filePath, e);
        }
    }

    public static void createDirectory(String dirPath) {
        try {
            Files.createDirectories(Paths.get(dirPath));
        } catch (IOException e) {
            throw new RuntimeException("Failed to create directory: " + dirPath, e);
        }
    }

    public static Properties loadProperties(String filePath) {
        Properties props = new Properties();
        try {
            props.load(Files.newBufferedReader(Paths.get(filePath), StandardCharsets.UTF_8));
            return props;
        } catch (IOException e) {
            throw new RuntimeException("Failed to load properties from: " + filePath, e);
        }
    }

    public static String getTimestamp() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
    }

    public static Path writeLog(String folderPath, String message) {
        String fileName = "log_" + LocalDateTime.now().toLocalDate() + ".txt";
        Path logFile = Paths.get(folderPath, fileName);
        try {
            Files.createDirectories(logFile.getParent());
            Files.write(
                    logFile,
                    (getTimestamp() + " - " + message + System.lineSeparator()).getBytes(StandardCharsets.UTF_8),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );
            return logFile;
        } catch (IOException e) {
            throw new RuntimeException("Failed to write log file: " + logFile, e);
        }
    }

    public static void main(String[] args) {
        String fileName = System.getProperty("user.dir") + "/src/Class23_FilesHandling/SampleFile.txt";
        System.out.println(readFileAsString(fileName));
        System.out.println(readFileAsLines(fileName));
        writeToFile(fileName, "This is write file content.");
        appendToFile(fileName, "This is an appended content.");
    }
}
