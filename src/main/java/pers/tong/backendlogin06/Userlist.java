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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "userlist")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Userlist.findAll", query = "SELECT u FROM Userlist u")
    , @NamedQuery(name = "Userlist.findByIduserlist", query = "SELECT u FROM Userlist u WHERE u.iduserlist = :iduserlist")
    , @NamedQuery(name = "Userlist.findByUsername", query = "SELECT u FROM Userlist u WHERE u.username = :username")})
public class Userlist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iduserlist")
    private Integer iduserlist;
    @Size(max = 45)
    @Column(name = "username")
    private String username;

    public Userlist() {
    }

    public Userlist(Integer iduserlist) {
        this.iduserlist = iduserlist;
    }

    public Integer getIduserlist() {
        return iduserlist;
    }

    public void setIduserlist(Integer iduserlist) {
        this.iduserlist = iduserlist;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iduserlist != null ? iduserlist.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Userlist)) {
            return false;
        }
        Userlist other = (Userlist) object;
        if ((this.iduserlist == null && other.iduserlist != null) || (this.iduserlist != null && !this.iduserlist.equals(other.iduserlist))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pers.tong.backendlogin06.Userlist[ iduserlist=" + iduserlist + " ]";
    }
    
}
