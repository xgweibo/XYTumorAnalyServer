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
@Table(name = "tumorgene")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tumorgene.findAll", query = "SELECT t FROM Tumorgene t")
    , @NamedQuery(name = "Tumorgene.findByTumorgeneid", query = "SELECT t FROM Tumorgene t WHERE t.tumorgeneid = :tumorgeneid")
    , @NamedQuery(name = "Tumorgene.findByTumorgenename", query = "SELECT t FROM Tumorgene t WHERE t.tumorgenename = :tumorgenename")
    , @NamedQuery(name = "Tumorgene.findBySource", query = "SELECT t FROM Tumorgene t WHERE t.source = :source")
    , @NamedQuery(name = "Tumorgene.findByType", query = "SELECT t FROM Tumorgene t WHERE t.type = :type")})
public class Tumorgene implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Tumorgeneid")
    private Integer tumorgeneid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Tumorgenename")
    private String tumorgenename;
    @Size(max = 45)
    @Column(name = "Source")
    private String source;
    @Size(max = 45)
    @Column(name = "Type")
    private String type;

    public Tumorgene() {
    }

    public Tumorgene(Integer tumorgeneid) {
        this.tumorgeneid = tumorgeneid;
    }

    public Tumorgene(Integer tumorgeneid, String tumorgenename) {
        this.tumorgeneid = tumorgeneid;
        this.tumorgenename = tumorgenename;
    }

    public Integer getTumorgeneid() {
        return tumorgeneid;
    }

    public void setTumorgeneid(Integer tumorgeneid) {
        this.tumorgeneid = tumorgeneid;
    }

    public String getTumorgenename() {
        return tumorgenename;
    }

    public void setTumorgenename(String tumorgenename) {
        this.tumorgenename = tumorgenename;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tumorgeneid != null ? tumorgeneid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tumorgene)) {
            return false;
        }
        Tumorgene other = (Tumorgene) object;
        if ((this.tumorgeneid == null && other.tumorgeneid != null) || (this.tumorgeneid != null && !this.tumorgeneid.equals(other.tumorgeneid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pers.tong.backendlogin06.Tumorgene[ tumorgeneid=" + tumorgeneid + " ]";
    }
    
}
