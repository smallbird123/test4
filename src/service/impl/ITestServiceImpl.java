package service.impl;

import bean.Pers;
import bean.Sex;
import dao.ITestDao;
import dao.impl.ITestDaoImpl;
import service.ITestService;

import java.util.List;

public class ITestServiceImpl implements ITestService {
    ITestDao dao =new ITestDaoImpl();

    @Override
    public List<Pers> selectAll() {
        return dao.selectAll();
    }

    @Override
    public Pers selectId(String id) {
        return dao.selectId(id);
    }

    @Override
    public int updateId(Pers pers) {
        return dao.updateId(pers);
    }

    @Override
    public List<Sex> sexAll() {
        return dao.sexAll();
    }


}
