/*
 * The Program is written by dong031001(Github ID)
 * 程序由dong031001（Github ID）制作
 *
 * Any unauthorized changing codes may greatly influence the performance of the program
 * 任何未经允许的对此程序的更改都有可能造成包括但不限于 崩溃，蓝屏，死机 等症状
 *
 * 最后更改于2019/10/03
 */

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MainForm.main(null);
    }

    static boolean createAndWriteTXT(ArrayList<String> text, String LOC) {
        File file = new File(LOC);
        if (file.isFile()) return false;
        else {
            try {
                file.createNewFile();
                FileWriter writer = new FileWriter(file, true);
                for (String t : text) {
                    writer.write(t);
                    writer.write("\n");
                }
                writer.flush();
                writer.close();

                return true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    public static String convertStringToHex(@NotNull String str){

        char[] chars = str.toCharArray();

        StringBuffer hex = new StringBuffer();
        for(int i = 0; i < chars.length; i++){
            hex.append("\\"+"u");
            hex.append(Integer.toHexString((int)chars[i]));
        }
        return hex.toString();
    }

}
