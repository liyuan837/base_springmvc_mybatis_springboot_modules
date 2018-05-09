package com.liyuan.demo.util;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

public class PageHelperUtil {

    public static <E> Page<E> startPage(int pageNum, int pageSize) {
        return PageHelper.startPage(pageNum + 1, pageSize, false);
    }
}
