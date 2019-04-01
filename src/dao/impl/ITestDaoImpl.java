package dao.impl;

import bean.Pers;
import bean.Sex;
import dao.ITestDao;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import utils.JdbcUtil;

import java.sql.SQLException;
import java.util.List;

public class ITestDaoImpl implements ITestDao {
    @Override
    public List<Pers> selectAll() {
        QueryRunner qr = new QueryRunner(JdbcUtil.getDs());
        try {
            List<Pers> pers = qr.query("select * from pers", new BeanListHandler<Pers>(Pers.class));
            for (Pers pers1:pers){
                Sex sex = qr.query("select * from sex where sid=?", new BeanHandler<Sex>(Sex.class), pers1.getSexid());
                pers1.setSex(sex);
            }
            return pers;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Pers selectId(String id) {
        QueryRunner qr = new QueryRunner(JdbcUtil.getDs());
        try {
            Pers pers = qr.query("select * from pers where id=?", new BeanHandler<Pers>(Pers.class), id);

                Sex sex = qr.query("select * from sex where sid=?", new BeanHandler<Sex>(Sex.class), pers.getSexid());
               pers.setSex(sex);

            return pers;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int updateId(Pers pers) {
        QueryRunner qr = new QueryRunner(JdbcUtil.getDs());
        try {
            return qr.update("update pers set name=?,birthday=?,sexid=?,work=?,address=?,phone=? where id=?",pers.toString1().split(","));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Sex> sexAll() {
        QueryRunner qr = new QueryRunner(JdbcUtil.getDs());
        try {
            return qr.query("select * from sex",new BeanListHandler<Sex>(Sex.class));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    //"select * from salary where 1=1";
    // sql+=" and city like '%"+city+"%'";
    // sql+=" limit ?,?";
    //"INSERT INTO `salary`(`city`,`workYears`,`jobId`,`education`,`pay`) VALUES (?,?,?,?,?)";
    //salary.toString1().split(",")
    //"update salary set city=?,workYears=?,jobId=?,education=?,pay=? where id=?"
    //(sql,new ScalarHandler<Long>()).intValue();
}
