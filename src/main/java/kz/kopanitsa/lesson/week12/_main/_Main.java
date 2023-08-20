package kz.kopanitsa.lesson.week12._main;
import java.io.*;

public class _Main {
    public static void main(String[] args) {
        String sourceFileName = "src/main/resources/text.txt"; // Имя файла-источника
        String destinationFileName = "src/main/resources/text1.txt"; // Имя файла-копии
        try (
                BufferedReader reader = new BufferedReader(new FileReader(sourceFileName));
                BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFileName))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // Добавляем перенос строки
            }
            System.out.println("Файл успешно скопирован.");
        } catch (IOException e) {
            System.err.println("Произошла ошибка при копировании файла: " + e.getMessage());
        }
    }
}
