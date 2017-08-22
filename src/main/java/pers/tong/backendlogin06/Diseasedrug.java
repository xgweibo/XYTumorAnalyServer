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
@Table(name = "diseasedrug")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Diseasedrug.findAll", query = "SELECT d FROM Diseasedrug d")
    , @NamedQuery(name = "Diseasedrug.findByDrugID", query = "SELECT d FROM Diseasedrug d WHERE d.drugID = :drugID")
    , @NamedQuery(name = "Diseasedrug.findByDrugname", query = "SELECT d FROM Diseasedrug d WHERE d.drugname = :drugname")
    , @NamedQuery(name = "Diseasedrug.findByGenename", query = "SELECT d FROM Diseasedrug d WHERE d.genename = :genename")
    , @NamedQuery(name = "Diseasedrug.findByTreat", query = "SELECT d FROM Diseasedrug d WHERE d.treat = :treat")
    , @NamedQuery(name = "Diseasedrug.findByDiseasename", query = "SELECT d FROM Diseasedrug d WHERE d.diseasename = :diseasename")
    , @NamedQuery(name = "Diseasedrug.findByAdversereactions", query = "SELECT d FROM Diseasedrug d WHERE d.adversereactions = :adversereactions")})
public class Diseasedrug implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "drugID")
    private Integer drugID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "drugname")
    private String drugname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "genename")
    private String genename;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "treat")
    private String treat;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "diseasename")
    private String diseasename;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "adversereactions")
    private String adversereactions;

    public Diseasedrug() {
    }

    public Diseasedrug(Integer drugID) {
        this.drugID = drugID;
    }

    public Diseasedrug(Integer drugID, String drugname, String genename, String treat, String diseasename, String adversereactions) {
        this.drugID = drugID;
        this.drugname = drugname;
        this.genename = genename;
        this.treat = treat;
        this.diseasename = diseasename;
        this.adversereactions = adversereactions;
    }

    public Integer getDrugID() {
        return drugID;
    }

    public void setDrugID(Integer drugID) {
        this.drugID = drugID;
    }

    public String getDrugname() {
        return drugname;
    }

    public void setDrugname(String drugname) {
        this.drugname = drugname;
    }

    public String getGenename() {
        return genename;
    }

    public void setGenename(String genename) {
        this.genename = genename;
    }

    public String getTreat() {
        return treat;
    }

    public void setTreat(String treat) {
        this.treat = treat;
    }

    public String getDiseasename() {
        return diseasename;
    }

    public void setDiseasename(String diseasename) {
        this.diseasename = diseasename;
    }

    public String getAdversereactions() {
        return adversereactions;
    }

    public void setAdversereactions(String adversereactions) {
        this.adversereactions = adversereactions;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (drugID != null ? drugID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Diseasedrug)) {
            return false;
        }
        Diseasedrug other = (Diseasedrug) object;
        if ((this.drugID == null && other.drugID != null) || (this.drugID != null && !this.drugID.equals(other.drugID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pers.tong.backendlogin06.Diseasedrug[ drugID=" + drugID + " ]";
    }
    
}
