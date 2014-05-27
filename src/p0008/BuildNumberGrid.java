package p0008;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Eric on 5/26/2014.
 */
public class BuildNumberGrid {

    public String numberGrid(String fileName) {
        String grid = "";

        try (FileInputStream fis =
                     new FileInputStream(new File(fileName));
            Scanner sc =
                     new Scanner(fis)) {

            while (sc.hasNext()) {
                grid += sc.next();
            }

        } catch (IOException e) {
            System.out.println("File could not be found.");
        }

        return grid;
    }

}
