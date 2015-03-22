/*
 * 
 */
package dbweb;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author saara
 */


public class JDBCTemplateClass {
    
    private JdbcTemplate jdbcTemplate;

    
    public final void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void addHero(String id, String name) throws SQLException {
        this.jdbcTemplate.update("INSERT INTO hero VALUES (?, ?)", id, name);
    }

    public void deleteHero(String name){
        this.jdbcTemplate.update("DELETE FROM hero WHERE name LIKE '"+name+"'");
    }
    
    public List<Map<String, Object>> getHeroesAsList() throws SQLException {
        return this.jdbcTemplate.queryForList("SELECT * FROM hero");
    }
    
    public void printHeroes(){
    List<Hero> heroes = this.jdbcTemplate.query("SELECT * FROM hero", new HeroMapper());
     for(Hero h: heroes) {
            System.out.println(h.getId() + " " + h.getName());
        }
}
}
