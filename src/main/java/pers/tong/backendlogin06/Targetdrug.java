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
@Table(name = "targetdrug")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Targetdrug.findAll", query = "SELECT t FROM Targetdrug t")
    , @NamedQuery(name = "Targetdrug.findByTargetdrugid", query = "SELECT t FROM Targetdrug t WHERE t.targetdrugid = :targetdrugid")
    , @NamedQuery(name = "Targetdrug.findByTargetdrugname", query = "SELECT t FROM Targetdrug t WHERE t.targetdrugname = :targetdrugname")
    , @NamedQuery(name = "Targetdrug.findByGene", query = "SELECT t FROM Targetdrug t WHERE t.gene = :gene")
    , @NamedQuery(name = "Targetdrug.findByDisease", query = "SELECT t FROM Targetdrug t WHERE t.disease = :disease")})
public class Targetdrug implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Targetdrugid")
    private Integer targetdrugid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Targetdrugname")
    private String targetdrugname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "gene")
    private String gene;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "disease")
    private String disease;

    public Targetdrug() {
    }

    public Targetdrug(Integer targetdrugid) {
        this.targetdrugid = targetdrugid;
    }

    public Targetdrug(Integer targetdrugid, String targetdrugname, String gene, String disease) {
        this.targetdrugid = targetdrugid;
        this.targetdrugname = targetdrugname;
        this.gene = gene;
        this.disease = disease;
    }

    public Integer getTargetdrugid() {
        return targetdrugid;
    }

    public void setTargetdrugid(Integer targetdrugid) {
        this.targetdrugid = targetdrugid;
    }

    public String getTargetdrugname() {
        return targetdrugname;
    }

    public void setTargetdrugname(String targetdrugname) {
        this.targetdrugname = targetdrugname;
    }

    public String getGene() {
        return gene;
    }

    public void setGene(String gene) {
        this.gene = gene;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (targetdrugid != null ? targetdrugid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Targetdrug)) {
            return false;
        }
        Targetdrug other = (Targetdrug) object;
        if ((this.targetdrugid == null && other.targetdrugid != null) || (this.targetdrugid != null && !this.targetdrugid.equals(other.targetdrugid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pers.tong.backendlogin06.Targetdrug[ targetdrugid=" + targetdrugid + " ]";
    }
    
}
