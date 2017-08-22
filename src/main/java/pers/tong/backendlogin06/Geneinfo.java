/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pers.tong.backendlogin06;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author andytext
 */
@Entity
@Table(name = "geneinfo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Geneinfo.findAll", query = "SELECT g FROM Geneinfo g")
    , @NamedQuery(name = "Geneinfo.findById", query = "SELECT g FROM Geneinfo g WHERE g.id = :id")
    , @NamedQuery(name = "Geneinfo.findByGeneId", query = "SELECT g FROM Geneinfo g WHERE g.geneId = :geneId")
    , @NamedQuery(name = "Geneinfo.findByName", query = "SELECT g FROM Geneinfo g WHERE g.name = :name")
    , @NamedQuery(name = "Geneinfo.findByTime", query = "SELECT g FROM Geneinfo g WHERE g.time = :time")
    , @NamedQuery(name = "Geneinfo.findByOwnerId", query = "SELECT g FROM Geneinfo g WHERE g.ownerId = :ownerId")
    , @NamedQuery(name = "Geneinfo.findBySystem", query = "SELECT g FROM Geneinfo g WHERE g.system = :system")})
public class Geneinfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "geneId")
    private String geneId;
    @Size(max = 45)
    @Column(name = "name")
    private String name;
    @Column(name = "time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date time;
    @Size(max = 45)
    @Column(name = "ownerId")
    private String ownerId;
    @Size(max = 45)
    @Column(name = "system")
    private String system;

    public Geneinfo() {
    }

    public Geneinfo(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGeneId() {
        return geneId;
    }

    public void setGeneId(String geneId) {
        this.geneId = geneId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Geneinfo)) {
            return false;
        }
        Geneinfo other = (Geneinfo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pers.tong.backendlogin06.Geneinfo[ id=" + id + " ]";
    }
    
}
