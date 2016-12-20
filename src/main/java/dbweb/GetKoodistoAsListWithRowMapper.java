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
public class GetKoodistoAsListWithRowMapper {
        public static void main(String[] args) throws Exception {        
    
        
        
        ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
        DataSource datasource = (DataSource) appContext.getBean("dataSource");
        
        JDBCTemplateClass koodistodb = new JDBCTemplateClass();
        koodistodb.setDataSource(datasource); 
        
        
        
        System.out.println("Print heroes");
        koodistodb.printKoodit();
            
    }
}
