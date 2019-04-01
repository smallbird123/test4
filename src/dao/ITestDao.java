package dao;

import bean.Pers;
import bean.Sex;

import java.util.List;

public interface ITestDao {
    List<Pers> selectAll();


    Pers selectId(String id);

    int updateId(Pers pers);

    List<Sex> sexAll();

}
