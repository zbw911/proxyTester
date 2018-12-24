package com.zhangbaowei.classinterfaces;

/**
 * Create by  zhangbaowei on 2018/9/7 14:21.
 */
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println(" 这会儿在Add方法里");
    }

    @Override
    public int count(int b) {
        return 0;
    }
}
