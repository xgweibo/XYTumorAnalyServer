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
@Table(name = "cancerperson")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cancerperson.findAll", query = "SELECT c FROM Cancerperson c")
    , @NamedQuery(name = "Cancerperson.findByPersongenomeid", query = "SELECT c FROM Cancerperson c WHERE c.persongenomeid = :persongenomeid")
    , @NamedQuery(name = "Cancerperson.findByPersongenomename", query = "SELECT c FROM Cancerperson c WHERE c.persongenomename = :persongenomename")
    , @NamedQuery(name = "Cancerperson.findByEncode", query = "SELECT c FROM Cancerperson c WHERE c.encode = :encode")
    , @NamedQuery(name = "Cancerperson.findByType", query = "SELECT c FROM Cancerperson c WHERE c.type = :type")})
public class Cancerperson implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Persongenomeid")
    private Integer persongenomeid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Persongenomename")
    private String persongenomename;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Encode")
    private String encode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Type")
    private String type;

    public Cancerperson() {
    }

    public Cancerperson(Integer persongenomeid) {
        this.persongenomeid = persongenomeid;
    }

    public Cancerperson(Integer persongenomeid, String persongenomename, String encode, String type) {
        this.persongenomeid = persongenomeid;
        this.persongenomename = persongenomename;
        this.encode = encode;
        this.type = type;
    }

    public Integer getPersongenomeid() {
        return persongenomeid;
    }

    public void setPersongenomeid(Integer persongenomeid) {
        this.persongenomeid = persongenomeid;
    }

    public String getPersongenomename() {
        return persongenomename;
    }

    public void setPersongenomename(String persongenomename) {
        this.persongenomename = persongenomename;
    }

    public String getEncode() {
        return encode;
    }

    public void setEncode(String encode) {
        this.encode = encode;
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
        hash += (persongenomeid != null ? persongenomeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cancerperson)) {
            return false;
        }
        Cancerperson other = (Cancerperson) object;
        if ((this.persongenomeid == null && other.persongenomeid != null) || (this.persongenomeid != null && !this.persongenomeid.equals(other.persongenomeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pers.tong.backendlogin06.Cancerperson[ persongenomeid=" + persongenomeid + " ]";
    }
    
}
