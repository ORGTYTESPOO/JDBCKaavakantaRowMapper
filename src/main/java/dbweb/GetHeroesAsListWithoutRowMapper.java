/*
 * How to get the Heroes as a list from out database HEROES using DataSource
 * and JDBC template without using the RowMapper interface
 */
package dbweb;

import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author saara
 */
public class GetHeroesAsListWithoutRowMapper {
    
     public static void main(String[] args) throws Exception {   
    ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
        DataSource datasource = (DataSource) appContext.getBean("dataSource");
        
        JDBCTemplateClass herodb = new JDBCTemplateClass();
        herodb.setDataSource(datasource); 
        
        List<Map<String, Object>> names = herodb.getHeroesAsList();

        for (Map<String, Object> idname : names) {
            Integer id = (Integer) idname.get("id");
            String name = (String) idname.get("name");

            System.out.println(id + " " + name);
            System.out.println(idname);
        }
        
     }
}
