package ExerciseTryWithResources;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Course: Java Fundamentals - The Core Platform by Pluralsight 
 * ExerciseTryWithResources attempted by @AStyrvold
 *  
 * Created by Jim on 1/9/2016.
 */
public class Helper {
    static public Reader openReader(String fileName) throws IOException {
        return Files.newBufferedReader(Paths.get(fileName));
    }

    static public Writer openWriter(String fileName) throws IOException {
        return Files.newBufferedWriter(Paths.get(fileName));
    }

}
