package qa.util;

import java.io.File;

public class DeleteReportFiles {
    public void deleteAllFilesFromDirectory(String delDirectory, String fileType) {

        File folder = new File(delDirectory);
        File[] fList = folder.listFiles();

        for (File f : fList) {
            if (f.getName().endsWith(fileType)) {
                f.delete();
            }
        }
    }
}
