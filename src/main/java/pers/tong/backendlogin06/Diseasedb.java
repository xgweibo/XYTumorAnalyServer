/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pers.tong.backendlogin06;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "diseasedb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Diseasedb.findAll", query = "SELECT d FROM Diseasedb d")
    , @NamedQuery(name = "Diseasedb.findByDiseasedbid", query = "SELECT d FROM Diseasedb d WHERE d.diseasedbid = :diseasedbid")
    , @NamedQuery(name = "Diseasedb.findByDiseasedbcname", query = "SELECT d FROM Diseasedb d WHERE d.diseasedbcname = :diseasedbcname")
    , @NamedQuery(name = "Diseasedb.findBySource", query = "SELECT d FROM Diseasedb d WHERE d.source = :source")})
public class Diseasedb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "diseasedbid")
    private Integer diseasedbid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "diseasedbcname")
    private String diseasedbcname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "source")
    private String source;

    public Diseasedb() {
    }

    public Diseasedb(Integer diseasedbid) {
        this.diseasedbid = diseasedbid;
    }

    public Diseasedb(Integer diseasedbid, String diseasedbcname, String source) {
        this.diseasedbid = diseasedbid;
        this.diseasedbcname = diseasedbcname;
        this.source = source;
    }

    public Integer getDiseasedbid() {
        return diseasedbid;
    }

    public void setDiseasedbid(Integer diseasedbid) {
        this.diseasedbid = diseasedbid;
    }

    public String getDiseasedbcname() {
        return diseasedbcname;
    }

    public void setDiseasedbcname(String diseasedbcname) {
        this.diseasedbcname = diseasedbcname;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (diseasedbid != null ? diseasedbid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Diseasedb)) {
            return false;
        }
        Diseasedb other = (Diseasedb) object;
        if ((this.diseasedbid == null && other.diseasedbid != null) || (this.diseasedbid != null && !this.diseasedbid.equals(other.diseasedbid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pers.tong.backendlogin06.Diseasedb[ diseasedbid=" + diseasedbid + " ]";
    }
    
}
