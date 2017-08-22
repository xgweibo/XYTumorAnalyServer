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
@Table(name = "tumordisease")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tumordisease.findAll", query = "SELECT t FROM Tumordisease t")
    , @NamedQuery(name = "Tumordisease.findByTumordiseaseid", query = "SELECT t FROM Tumordisease t WHERE t.tumordiseaseid = :tumordiseaseid")
    , @NamedQuery(name = "Tumordisease.findByTumordiseasename", query = "SELECT t FROM Tumordisease t WHERE t.tumordiseasename = :tumordiseasename")
    , @NamedQuery(name = "Tumordisease.findByGene", query = "SELECT t FROM Tumordisease t WHERE t.gene = :gene")})
public class Tumordisease implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Tumordiseaseid")
    private Integer tumordiseaseid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Tumordiseasename")
    private String tumordiseasename;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Gene")
    private String gene;

    public Tumordisease() {
    }

    public Tumordisease(Integer tumordiseaseid) {
        this.tumordiseaseid = tumordiseaseid;
    }

    public Tumordisease(Integer tumordiseaseid, String tumordiseasename, String gene) {
        this.tumordiseaseid = tumordiseaseid;
        this.tumordiseasename = tumordiseasename;
        this.gene = gene;
    }

    public Integer getTumordiseaseid() {
        return tumordiseaseid;
    }

    public void setTumordiseaseid(Integer tumordiseaseid) {
        this.tumordiseaseid = tumordiseaseid;
    }

    public String getTumordiseasename() {
        return tumordiseasename;
    }

    public void setTumordiseasename(String tumordiseasename) {
        this.tumordiseasename = tumordiseasename;
    }

    public String getGene() {
        return gene;
    }

    public void setGene(String gene) {
        this.gene = gene;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tumordiseaseid != null ? tumordiseaseid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tumordisease)) {
            return false;
        }
        Tumordisease other = (Tumordisease) object;
        if ((this.tumordiseaseid == null && other.tumordiseaseid != null) || (this.tumordiseaseid != null && !this.tumordiseaseid.equals(other.tumordiseaseid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pers.tong.backendlogin06.Tumordisease[ tumordiseaseid=" + tumordiseaseid + " ]";
    }
    
}
