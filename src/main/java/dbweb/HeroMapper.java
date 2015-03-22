
package dbweb;

  import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author saara
 */
public class HeroMapper implements RowMapper<Hero> {
  

    public Hero mapRow(ResultSet resultSet, int rowIndex) throws SQLException {
        Hero hero = new Hero();
        hero.setId(resultSet.getInt("id"));
        hero.setName(resultSet.getString("name"));

        return hero;
    }

}
