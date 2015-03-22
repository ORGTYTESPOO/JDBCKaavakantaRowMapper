/*
 * Getting the heroes from our HEROES database using JDBC template, RowMapper
 * interface and DataSource
 */
package dbweb;

import javax.sql.DataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author saara
 */
public class GetHeroesAsListWithRowMapper {
        public static void main(String[] args) throws Exception {        
    
        String ellie = "Ellie";
        
        ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
        DataSource datasource = (DataSource) appContext.getBean("dataSource");
        
        JDBCTemplateClass herodb = new JDBCTemplateClass();
        herodb.setDataSource(datasource); 
        
        herodb.addHero(null, ellie);
        
        System.out.println("Print heroes");
        herodb.printHeroes();
            
    }
}
