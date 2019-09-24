package garen.java.demo.gjpProject.domain;

public class AccountApp {
    private int id;
    private String sortname;
    private double money;
    private String pay_way;
    private String createtime;
    private String description;

    public AccountApp() {
    }

    public AccountApp(int id, String sortname, double money, String pay_way, String createtime, String description) {
        this.id = id;
        this.sortname = sortname;
        this.money = money;
        this.pay_way = pay_way;
        this.createtime = createtime;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSortname() {
        return sortname;
    }

    public void setSortname(String sortname) {
        this.sortname = sortname;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getPay_way() {
        return pay_way;
    }

    public void setPay_way(String pay_way) {
        this.pay_way = pay_way;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "账目" + id +
                ", 收支类别： '" + sortname + '\'' +
                ", 金额： " + money +
                ", 收支方式： '" + pay_way + '\'' +
                ", 收支时间： '" + createtime + '\'' +
                ", 备注： '" + description + '\'' +
                " ";
    }
}
