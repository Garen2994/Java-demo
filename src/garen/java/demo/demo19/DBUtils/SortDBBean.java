package garen.java.demo.demo19.DBUtils;

public class SortDBBean{
    private int sid;
    private String sname;  //要与数据库中的字段名一致

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }


    public SortDBBean() {
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                '}';
    }
}

