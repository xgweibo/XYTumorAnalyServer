/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pers.tong.backendlogin06;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "wfcomponents")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Wfcomponents.findAll", query = "SELECT w FROM Wfcomponents w")
    , @NamedQuery(name = "Wfcomponents.findByIdwfcomponent", query = "SELECT w FROM Wfcomponents w WHERE w.idwfcomponent = :idwfcomponent")
    , @NamedQuery(name = "Wfcomponents.findByExec", query = "SELECT w FROM Wfcomponents w WHERE w.exec = :exec")
    , @NamedQuery(name = "Wfcomponents.findByWorkdir", query = "SELECT w FROM Wfcomponents w WHERE w.workdir = :workdir")
    , @NamedQuery(name = "Wfcomponents.findByCmptname", query = "SELECT w FROM Wfcomponents w WHERE w.cmptname = :cmptname")})
public class Wfcomponents implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idwfcomponent")
    private Integer idwfcomponent;
    @Size(max = 256)
    @Column(name = "exec")
    private String exec;
    @Size(max = 256)
    @Column(name = "workdir")
    private String workdir;
    @Size(max = 256)
    @Column(name = "cmptname")
    private String cmptname;
    @Lob
    @Size(max = 65535)
    @Column(name = "inputparams")
    private String inputparams;
    @Lob
    @Size(max = 65535)
    @Column(name = "outputparams")
    private String outputparams;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "belongtocmpnt")
    private Collection<Wfcmpntparams> wfcmpntparamsCollection;

    public Wfcomponents() {
    }

    public Wfcomponents(Integer idwfcomponent) {
        this.idwfcomponent = idwfcomponent;
    }

    public Integer getIdwfcomponent() {
        return idwfcomponent;
    }

    public void setIdwfcomponent(Integer idwfcomponent) {
        this.idwfcomponent = idwfcomponent;
    }

    public String getExec() {
        return exec;
    }

    public void setExec(String exec) {
        this.exec = exec;
    }

    public String getWorkdir() {
        return workdir;
    }

    public void setWorkdir(String workdir) {
        this.workdir = workdir;
    }

    public String getCmptname() {
        return cmptname;
    }

    public void setCmptname(String cmptname) {
        this.cmptname = cmptname;
    }

    public String getInputparams() {
        return inputparams;
    }

    public void setInputparams(String inputparams) {
        this.inputparams = inputparams;
    }

    public String getOutputparams() {
        return outputparams;
    }

    public void setOutputparams(String outputparams) {
        this.outputparams = outputparams;
    }

    @XmlTransient
    public Collection<Wfcmpntparams> getWfcmpntparamsCollection() {
        return wfcmpntparamsCollection;
    }

    public void setWfcmpntparamsCollection(Collection<Wfcmpntparams> wfcmpntparamsCollection) {
        this.wfcmpntparamsCollection = wfcmpntparamsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idwfcomponent != null ? idwfcomponent.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Wfcomponents)) {
            return false;
        }
        Wfcomponents other = (Wfcomponents) object;
        if ((this.idwfcomponent == null && other.idwfcomponent != null) || (this.idwfcomponent != null && !this.idwfcomponent.equals(other.idwfcomponent))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pers.tong.backendlogin06.Wfcomponents[ idwfcomponent=" + idwfcomponent + " ]";
    }
    
}
