package com.shoppings.util;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ReturnGson {

    /**
     * 返回gson类型数组
     * @param gsonlist
     * @param resp
     */
    public static void returnResult(String   gsonlist, HttpServletResponse resp){
        PrintWriter out = null;
        try {
             out = resp.getWriter();
             out.write(gsonlist);
             out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
