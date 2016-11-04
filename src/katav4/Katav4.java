package katav4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Katav4 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String fileName = "emailsfilev1.txt";
        ArrayList<String>  mailList = MailListReader.read(fileName);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histodisplay = new HistogramDisplay(histogram);
        histodisplay.execute();
    }
}
