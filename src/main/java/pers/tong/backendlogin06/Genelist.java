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
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "genelist")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Genelist.findAll", query = "SELECT g FROM Genelist g")
    , @NamedQuery(name = "Genelist.findByGeneID", query = "SELECT g FROM Genelist g WHERE g.geneID = :geneID")
    , @NamedQuery(name = "Genelist.findByGeneSymbol", query = "SELECT g FROM Genelist g WHERE g.geneSymbol = :geneSymbol")
    , @NamedQuery(name = "Genelist.findByClinicalSignificance", query = "SELECT g FROM Genelist g WHERE g.clinicalSignificance = :clinicalSignificance")
    , @NamedQuery(name = "Genelist.findByRsid", query = "SELECT g FROM Genelist g WHERE g.rsid = :rsid")
    , @NamedQuery(name = "Genelist.findByRefGenome", query = "SELECT g FROM Genelist g WHERE g.refGenome = :refGenome")
    , @NamedQuery(name = "Genelist.findByChromosome", query = "SELECT g FROM Genelist g WHERE g.chromosome = :chromosome")
    , @NamedQuery(name = "Genelist.findByGeneType", query = "SELECT g FROM Genelist g WHERE g.geneType = :geneType")
    , @NamedQuery(name = "Genelist.findByIds", query = "SELECT g FROM Genelist g WHERE g.ids = :ids")})
public class Genelist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "geneID")
    private Integer geneID;
    @Size(max = 20)
    @Column(name = "geneSymbol")
    private String geneSymbol;
    @Size(max = 40)
    @Column(name = "ClinicalSignificance")
    private String clinicalSignificance;
    @Size(max = 15)
    @Column(name = "rsid")
    private String rsid;
    @Lob
    @Size(max = 65535)
    @Column(name = "phenoType")
    private String phenoType;
    @Size(max = 6)
    @Column(name = "ref_genome")
    private String refGenome;
    @Size(max = 5)
    @Column(name = "chromosome")
    private String chromosome;
    @Size(max = 2)
    @Column(name = "geneType")
    private String geneType;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ids")
    private Integer ids;

    public Genelist() {
    }

    public Genelist(Integer ids) {
        this.ids = ids;
    }

    public Integer getGeneID() {
        return geneID;
    }

    public void setGeneID(Integer geneID) {
        this.geneID = geneID;
    }

    public String getGeneSymbol() {
        return geneSymbol;
    }

    public void setGeneSymbol(String geneSymbol) {
        this.geneSymbol = geneSymbol;
    }

    public String getClinicalSignificance() {
        return clinicalSignificance;
    }

    public void setClinicalSignificance(String clinicalSignificance) {
        this.clinicalSignificance = clinicalSignificance;
    }

    public String getRsid() {
        return rsid;
    }

    public void setRsid(String rsid) {
        this.rsid = rsid;
    }

    public String getPhenoType() {
        return phenoType;
    }

    public void setPhenoType(String phenoType) {
        this.phenoType = phenoType;
    }

    public String getRefGenome() {
        return refGenome;
    }

    public void setRefGenome(String refGenome) {
        this.refGenome = refGenome;
    }

    public String getChromosome() {
        return chromosome;
    }

    public void setChromosome(String chromosome) {
        this.chromosome = chromosome;
    }

    public String getGeneType() {
        return geneType;
    }

    public void setGeneType(String geneType) {
        this.geneType = geneType;
    }

    public Integer getIds() {
        return ids;
    }

    public void setIds(Integer ids) {
        this.ids = ids;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ids != null ? ids.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Genelist)) {
            return false;
        }
        Genelist other = (Genelist) object;
        if ((this.ids == null && other.ids != null) || (this.ids != null && !this.ids.equals(other.ids))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pers.tong.backendlogin06.Genelist[ ids=" + ids + " ]";
    }
    
}
