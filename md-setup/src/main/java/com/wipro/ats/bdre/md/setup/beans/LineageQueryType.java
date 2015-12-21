package com.wipro.ats.bdre.md.setup.beans;
// Generated Dec 21, 2015 11:26:14 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * LineageQueryType generated by hbm2java
 */
@Entity
@Table(name="LINEAGE_QUERY_TYPE"
    ,schema="BDRE"
    ,catalog="BDRE"
)
public class LineageQueryType  implements java.io.Serializable {


     private Integer queryTypeId;
     private String queryTypeName;

    public LineageQueryType() {
    }

    public LineageQueryType(Integer queryTypeId, String queryTypeName) {
       this.queryTypeId = queryTypeId;
       this.queryTypeName = queryTypeName;
    }
   
     @Id 
    
    @Column(name="QUERY_TYPE_ID", unique=true, nullable=false)
    public Integer getQueryTypeId() {
        return this.queryTypeId;
    }
    
    public void setQueryTypeId(Integer queryTypeId) {
        this.queryTypeId = queryTypeId;
    }
    
    @Column(name="QUERY_TYPE_NAME", nullable=false)
    public String getQueryTypeName() {
        return this.queryTypeName;
    }
    
    public void setQueryTypeName(String queryTypeName) {
        this.queryTypeName = queryTypeName;
    }




}

