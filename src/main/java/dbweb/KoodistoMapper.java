/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbweb;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author pakars4
 */
public class KoodistoMapper implements RowMapper<Koodisto>{

  

    public Koodisto mapRow(ResultSet resultSet, int rowIndex) throws SQLException {
        Koodisto koodisto = new Koodisto();
        
        
//         private int id;
//    private int koodi;
//    private int ryhmakoodi;
//    private String ryhma;
//    private String kuvaus;
//    private String lisainfo;
//    
        
        koodisto.setId(resultSet.getInt("id"));
        koodisto.setKoodi(resultSet.getInt("koodi"));
        koodisto.setKuvaus(resultSet.getString("kuvaus"));
        koodisto.setLisainfo(resultSet.getString("lisainfo"));
        koodisto.setRyhma(resultSet.getString("ryhma"));
        koodisto.setRyhmakoodi(resultSet.getInt("ryhmakoodi"));

        return koodisto;
    }

}
    
    

