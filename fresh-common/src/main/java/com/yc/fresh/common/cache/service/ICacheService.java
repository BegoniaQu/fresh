package com.yc.fresh.common.cache.service;


import java.util.List;

/**
 * Created by quy on 2020/4/10.
 * Motto: you can do it
 * <p>T-是实例</p>
 * <p>S-Integer、Long、String等基础类型</p>
 */
public interface ICacheService<T,S> {

    void set(String key, S id);
    void del(String key);

    void addT(T t, long second);
    T getT(S id);
    void removeT(T t);

    void listAdd(String key, List<T> list, long second);
    void listAdd(String key, List<T> list);
    void listAdd(String key, S id, long second);
    void listRmv(String key, S id);
    void listDel(String key);

    List<T> findT(String key);
    List<T> findT(List<S> ids);
    List<S> findS(String key);

    void mapPut(String key, T t, long second);
    void mapUpt(String key, T t);
    void mapRmv(String key, T t);
    void mapDel(String key);
    List<T> fromMap(String key, int batchSize);


   /* void increment(String key, long second);
    void decrement(String key);
    Long getNum(String key);*/
}
