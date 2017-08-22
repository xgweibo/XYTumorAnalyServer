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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author andytext
 */
@Entity
@Table(name = "userinfo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Userinfo.findAll", query = "SELECT u FROM Userinfo u")
    , @NamedQuery(name = "Userinfo.findById", query = "SELECT u FROM Userinfo u WHERE u.id = :id")
    , @NamedQuery(name = "Userinfo.findByEmail", query = "SELECT u FROM Userinfo u WHERE u.email = :email")
    , @NamedQuery(name = "Userinfo.findByPassword", query = "SELECT u FROM Userinfo u WHERE u.password = :password")
    , @NamedQuery(name = "Userinfo.findByCategory", query = "SELECT u FROM Userinfo u WHERE u.category = :category")
    , @NamedQuery(name = "Userinfo.findBySystem", query = "SELECT u FROM Userinfo u WHERE u.system = :system")
    , @NamedQuery(name = "Userinfo.findByPredictSum", query = "SELECT u FROM Userinfo u WHERE u.predictSum = :predictSum")
    , @NamedQuery(name = "Userinfo.findByGeneInfoSum", query = "SELECT u FROM Userinfo u WHERE u.geneInfoSum = :geneInfoSum")})
public class Userinfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 45)
    @Column(name = "email")
    private String email;
    @Size(max = 45)
    @Column(name = "password")
    private String password;
    @Size(max = 45)
    @Column(name = "category")
    private String category;
    @Size(max = 45)
    @Column(name = "system")
    private String system;
    @Column(name = "predictSum")
    private Integer predictSum;
    @Column(name = "geneInfoSum")
    private Integer geneInfoSum;

    public Userinfo() {
    }

    public Userinfo(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public Integer getPredictSum() {
        return predictSum;
    }

    public void setPredictSum(Integer predictSum) {
        this.predictSum = predictSum;
    }

    public Integer getGeneInfoSum() {
        return geneInfoSum;
    }

    public void setGeneInfoSum(Integer geneInfoSum) {
        this.geneInfoSum = geneInfoSum;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Userinfo)) {
            return false;
        }
        Userinfo other = (Userinfo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pers.tong.backendlogin06.Userinfo[ id=" + id + " ]";
    }
    
}
