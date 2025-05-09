package hust.soict.dsai.garbage;
import java.io.IOException;
import java.nio.file.*;

public class GarbageCreator {
    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\admin\\Documents\\GitHub\\IT3103.744528.2024.1.20225656.NguyenTrinhHoangNguyen\\OtherProjects\\src\\hust\\soict\\dsai\\garbage\\text.txt";
        byte[] inputBytes = {0};
        long startTime, endTime;

        inputBytes = Files.readAllBytes(Paths.get(filename));
        startTime = System.currentTimeMillis();
        String outputString = "";
        for (byte b : inputBytes) {
            outputString += (char) b;
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
