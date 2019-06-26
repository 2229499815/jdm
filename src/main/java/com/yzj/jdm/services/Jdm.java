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



    }

}
