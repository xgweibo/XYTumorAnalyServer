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
@Table(name = "personalgenome")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personalgenome.findAll", query = "SELECT p FROM Personalgenome p")
    , @NamedQuery(name = "Personalgenome.findByPersonalgenomeid", query = "SELECT p FROM Personalgenome p WHERE p.personalgenomeid = :personalgenomeid")
    , @NamedQuery(name = "Personalgenome.findByPersonalgenomename", query = "SELECT p FROM Personalgenome p WHERE p.personalgenomename = :personalgenomename")
    , @NamedQuery(name = "Personalgenome.findByEncode", query = "SELECT p FROM Personalgenome p WHERE p.encode = :encode")
    , @NamedQuery(name = "Personalgenome.findByType", query = "SELECT p FROM Personalgenome p WHERE p.type = :type")})
public class Personalgenome implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "personalgenomeid")
    private Integer personalgenomeid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "personalgenomename")
    private String personalgenomename;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "encode")
    private String encode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "type")
    private String type;

    public Personalgenome() {
    }

    public Personalgenome(Integer personalgenomeid) {
        this.personalgenomeid = personalgenomeid;
    }

    public Personalgenome(Integer personalgenomeid, String personalgenomename, String encode, String type) {
        this.personalgenomeid = personalgenomeid;
        this.personalgenomename = personalgenomename;
        this.encode = encode;
        this.type = type;
    }

    public Integer getPersonalgenomeid() {
        return personalgenomeid;
    }

    public void setPersonalgenomeid(Integer personalgenomeid) {
        this.personalgenomeid = personalgenomeid;
    }

    public String getPersonalgenomename() {
        return personalgenomename;
    }

    public void setPersonalgenomename(String personalgenomename) {
        this.personalgenomename = personalgenomename;
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
        hash += (personalgenomeid != null ? personalgenomeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personalgenome)) {
            return false;
        }
        Personalgenome other = (Personalgenome) object;
        if ((this.personalgenomeid == null && other.personalgenomeid != null) || (this.personalgenomeid != null && !this.personalgenomeid.equals(other.personalgenomeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pers.tong.backendlogin06.Personalgenome[ personalgenomeid=" + personalgenomeid + " ]";
    }
    
}
