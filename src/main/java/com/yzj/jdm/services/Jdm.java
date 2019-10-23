package com.yzj.jdm.services;

import com.develop.jawin.COMException;
import com.yzj.jdm.Dm.Idmsoft;
import com.yzj.jdm.utils.JdmUtil;

/**
 * @Auth yaozhongjie
 * @Date 2019/6/25 11:22
 **/
public class Jdm {

    public static void main(String[] args) throws COMException {
        JdmUtil.setLibPath();
        Idmsoft idmsoft=new Idmsoft("dm.dmsoft");
        String ver = idmsoft.Ver();
        System.out.println(ver);
        //很人多反应说 FindPic  引用类型的值无法返回，那就是真的无法返回，
        // 但是dm提供了个FindPicEx是专门针对像java这种用不了指针类型的语言使用的
        //所以当你遇到用不了的接口的时候你应该都能找到一个Ex的增强型接口，使用它就行了
        String s = idmsoft.GetColor(100, 100);
        System.out.println(s);
        String str = idmsoft.FindPicEx(0, 0, 2000, 2000, "D:\\1.bmp", "000000", 0.8, 0);
        System.out.println(str);

    }

}
