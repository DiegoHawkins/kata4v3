package katav4;

import java.io.File;

public class Katav4 {

    public static void main(String[] args) {
        File file = new File("c:\\");
        String[] names = file.list();
        for (String name : names) {
            System.out.println(name);            
        }
    }
}
