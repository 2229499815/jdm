package com.yzj.jdm.utils;

import java.lang.reflect.Field;

/**
 * @Auth yaozhongjie
 * @Date 2019/6/25 11:30
 **/
public class JdmUtil {


    public static void setLibPath(){
        try{
            String libraryPath=ClassLoader.class.getResource("/lib").getPath();
            Field userPathsField = ClassLoader.class.getDeclaredField("usr_paths");
            userPathsField.setAccessible(true);
            String[] paths = (String[]) userPathsField.get(null);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < paths.length; i++) {
                if (libraryPath.equals(paths[i])) {
                    continue;
                }
                sb.append(paths[i]).append(';');
            }
            sb.append(libraryPath);
            System.setProperty("java.library.path", sb.toString());
            final Field sysPathsField = ClassLoader.class.getDeclaredField("sys_paths");
            sysPathsField.setAccessible(true);
            sysPathsField.set(null, null);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

}
