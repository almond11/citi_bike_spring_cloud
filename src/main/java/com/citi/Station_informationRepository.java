package com.citi;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


@Repository
public class Station_informationRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    class StationRowMapper implements RowMapper < Station_information > {
        @Override
        public Station_information mapRow(ResultSet rs, int rowNum) throws SQLException {
        	Station_information s = new Station_information();
            s.setId((Long) rs.getLong("id"));
            s.setName(rs.getString("name"));
            s.setShort_name(rs.getDouble("short_name"));
            s.setLat(rs.getDouble("lat"));
            s.setLon(rs.getDouble("lon")); 
            s.setRegion_id(rs.getInt("region_id")); 
            s.setCapacity(rs.getInt("capacity"));
            return s;
        }
    }

    public List < Station_information > findAll() {
        return jdbcTemplate.query("select * from station_information", new StationRowMapper());
    }

    public  Station_information findById(Long id) {  
    		return jdbcTemplate.queryForObject("select * from station_information where id=?", new Object[] {
                    id
                },
                new BeanPropertyRowMapper < Station_information > (Station_information.class));
    }

    public int deleteById(long id) {
        return jdbcTemplate.update("delete from station_information where id=?", new Object[] {
            id
        });
    }

    /*
    public int insert(Station_information user) {

        return jdbcTemplate.update("insert into station_information (id, first_name, last_name, email_address, address) " + "values(?, ?, ?, ?,?)",
            new Object[] {
                user.getId(), user.getName(), user.getLastName(), user.getEmailId(),user.getAddress()
            });
    }
    */

 
    }
