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
@Table(name = "diseasegene")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Diseasegene.findAll", query = "SELECT d FROM Diseasegene d")
    , @NamedQuery(name = "Diseasegene.findByGeneID", query = "SELECT d FROM Diseasegene d WHERE d.geneID = :geneID")
    , @NamedQuery(name = "Diseasegene.findByDiseasename", query = "SELECT d FROM Diseasegene d WHERE d.diseasename = :diseasename")
    , @NamedQuery(name = "Diseasegene.findByGenename", query = "SELECT d FROM Diseasegene d WHERE d.genename = :genename")
    , @NamedQuery(name = "Diseasegene.findByDiseasepheno", query = "SELECT d FROM Diseasegene d WHERE d.diseasepheno = :diseasepheno")})
public class Diseasegene implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "geneID")
    private Integer geneID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "diseasename")
    private String diseasename;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "genename")
    private String genename;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "diseasepheno")
    private String diseasepheno;

    public Diseasegene() {
    }

    public Diseasegene(Integer geneID) {
        this.geneID = geneID;
    }

    public Diseasegene(Integer geneID, String diseasename, String genename, String diseasepheno) {
        this.geneID = geneID;
        this.diseasename = diseasename;
        this.genename = genename;
        this.diseasepheno = diseasepheno;
    }

    public Integer getGeneID() {
        return geneID;
    }

    public void setGeneID(Integer geneID) {
        this.geneID = geneID;
    }

    public String getDiseasename() {
        return diseasename;
    }

    public void setDiseasename(String diseasename) {
        this.diseasename = diseasename;
    }

    public String getGenename() {
        return genename;
    }

    public void setGenename(String genename) {
        this.genename = genename;
    }

    public String getDiseasepheno() {
        return diseasepheno;
    }

    public void setDiseasepheno(String diseasepheno) {
        this.diseasepheno = diseasepheno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (geneID != null ? geneID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Diseasegene)) {
            return false;
        }
        Diseasegene other = (Diseasegene) object;
        if ((this.geneID == null && other.geneID != null) || (this.geneID != null && !this.geneID.equals(other.geneID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pers.tong.backendlogin06.Diseasegene[ geneID=" + geneID + " ]";
    }
    
}
