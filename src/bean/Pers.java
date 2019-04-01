package bean;

import java.sql.Date;

public class Pers {
    private int id;
    private String name;
    private Date birthday;
    private int sexid;
    private String work;
    private String address;
    private String phone;

    private Sex sex;

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String toString1() {
        return  name + "," + birthday + "," + sexid + "," + work + "," + address +  "," + phone+","+id;

    }

    @Override
    public String toString() {
        return "Pers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", sexid=" + sexid +
                ", work='" + work + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public Pers() {
    }

    public Pers(int id, String name, Date birthday, int sexid, String work, String address, String phone) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.sexid = sexid;
        this.work = work;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getSexid() {
        return sexid;
    }

    public void setSexid(int sexid) {
        this.sexid = sexid;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
