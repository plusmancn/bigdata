package cn.plusman.hadoop;

import java.io.File;

public class FileUtil {
    public static Boolean deleteDir(String path) {
        File dir = new File(path);
        if (dir.exists()) {
            for (File f : dir.listFiles()) {
                if (f.isDirectory()) {
                    deleteDir(f.getName());
                } else {
                    f.delete();
                }
            }

            dir.delete();
            return true;
        } else  {
            System.err.println("文件（夹）不存在");
            return false;
        }

    }
}
