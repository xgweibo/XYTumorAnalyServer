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
import javax.persistence.Lob;
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
@Table(name = "predictinfo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Predictinfo.findAll", query = "SELECT p FROM Predictinfo p")
    , @NamedQuery(name = "Predictinfo.findById", query = "SELECT p FROM Predictinfo p WHERE p.id = :id")
    , @NamedQuery(name = "Predictinfo.findByGeneId", query = "SELECT p FROM Predictinfo p WHERE p.geneId = :geneId")
    , @NamedQuery(name = "Predictinfo.findByOwnerId", query = "SELECT p FROM Predictinfo p WHERE p.ownerId = :ownerId")
    , @NamedQuery(name = "Predictinfo.findByPredictTime", query = "SELECT p FROM Predictinfo p WHERE p.predictTime = :predictTime")
    , @NamedQuery(name = "Predictinfo.findBySystem", query = "SELECT p FROM Predictinfo p WHERE p.system = :system")
    , @NamedQuery(name = "Predictinfo.findByShowed", query = "SELECT p FROM Predictinfo p WHERE p.showed = :showed")})
public class Predictinfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "geneId")
    private String geneId;
    @Column(name = "ownerId")
    private Integer ownerId;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "result")
    private String result;
    @Column(name = "predictTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date predictTime;
    @Size(max = 45)
    @Column(name = "system")
    private String system;
    @Size(max = 10)
    @Column(name = "showed")
    private String showed;

    public Predictinfo() {
    }

    public Predictinfo(Integer id) {
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

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Date getPredictTime() {
        return predictTime;
    }

    public void setPredictTime(Date predictTime) {
        this.predictTime = predictTime;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getShowed() {
        return showed;
    }

    public void setShowed(String showed) {
        this.showed = showed;
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
        if (!(object instanceof Predictinfo)) {
            return false;
        }
        Predictinfo other = (Predictinfo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pers.tong.backendlogin06.Predictinfo[ id=" + id + " ]";
    }
    
}
