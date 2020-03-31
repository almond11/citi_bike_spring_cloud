package com.citi;

import java.io.Serializable;

import javax.persistence.*;



@SuppressWarnings("serial")
@Entity
@Table(name = "station_information")
public class Station_information implements Serializable {

  /*  private static final long serialVersionUID = 1L; */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

 

    @Column(name = "name")
    private String name;

    @Column(name = "short_name")
    private Double short_name;

    @Column(name = "lat")
    private Double lat;

    @Column(name = "lon")
    private Double lon;

    @Column(name = "region_id")
    private Integer region_id;

    

    @Column(name = "capacity")
    private Integer capacity;

   


    public Station_information(Long id2, String n, Double sn, Double lat2, Double lon2, Integer r, Integer c) {
    	this.id=id2;
    	this.name=n;
    	this.short_name=sn;
    	this.lat=lat2;
    	this.lon=lon2;
    	this.region_id=r;
    	this.capacity=c;
    			
    	}

	public Station_information() {
		// TODO Auto-generated constructor stub
	}

	// jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

 

    public String getName() {
        return name;
    }

    public Station_information name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getShort_name() {
        return short_name;
    }

    public Station_information short_name(Double short_name) {
        this.short_name = short_name;
        return this;
    }

    public void setShort_name(Double short_name) {
        this.short_name = short_name;
    }

    public Double getLat() {
        return lat;
    }

    public Station_information lat(Double lat) {
        this.lat = lat;
        return this;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public Station_information lon(Double lon) {
        this.lon = lon;
        return this;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Integer getRegion_id() {
        return region_id;
    }

    public Station_information region_id(Integer region_id) {
        this.region_id = region_id;
        return this;
    }

    public void setRegion_id(Integer region_id) {
        this.region_id = region_id;
    }
 

    public Integer getCapacity() {
        return capacity;
    }

    public Station_information capacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
 
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Station_information)) {
            return false;
        }
        return id != null && id.equals(((Station_information) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Station_information{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", short_name=" + getShort_name() +
            ", lat=" + getLat() +
            ", lon=" + getLon() +
            ", region_id=" + getRegion_id() +  
            ", capacity=" + getCapacity() +
          
            "}";
    }
}
