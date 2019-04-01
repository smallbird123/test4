package service;

import bean.Pers;
import bean.Sex;

import java.util.List;

public interface ITestService {
    List<Pers> selectAll();


    Pers selectId(String id);

    int updateId(Pers pers);

    List<Sex> sexAll();
}
