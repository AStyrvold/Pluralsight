package ExerciseTryWithResources;

import java.io.IOException;

/**
 * Course: Java Fundamentals - The Core Platform by Pluralsight 
 * ExerciseTryWithResources attempted by @AStyrvold
 *
 * Created by Jim on 1/9/2016.
 */
public class MyAutoCloseable implements AutoCloseable {
    public void saySomething() throws IOException{
    	throw new IOException("Exception from saySomething");
        //System.out.println("Something");
    }
    @Override
    public void close() throws IOException {
    	throw new IOException("Exception from close");
        //System.out.println("close");
    }
}
