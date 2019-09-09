package garen.java.demo.demo19.SpringJDBC;

import garen.java.demo.demo19.ConnectionPool.JDBCUtils;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;


public class JDBCTemplateDemo {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
/*
 * 修改sid = 89757 的sname
 */
    @Test
    public void test01(){
        String sql = "UPDATE sort set sname = '类' where sid = 89757";
        int num = template.update(sql);
        System.out.println(num);
    }
/*
* 增加一条数据
* */
    @Test
    public void test02(){
        String sql = "INSERT INTO sort VALUES(?,?)";
        int update = template.update(sql,280375,"卿");
        System.out.println(update);
    }
/*删除一条记录*/
    @Test
    public void test03(){
        String sql = "DELETE FROM sort where sid = 280375";
        int update = template.update(sql);
        System.out.println(update);
    }

    @Test
    public void test04(){
        String sql = "SELECT sname FROM sort WHERE sid = 1234";
        Map<String, Object> map = template.queryForMap(sql);
        System.out.println(map);
    }
    @Test
    public void test05(){
        String sql = "SELECT * FROM sort";
        List<Map<String, Object>> maps = template.queryForList(sql);
        for (Map<String, Object> map : maps) {
            System.out.println(map);
        }
    }
}
