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
@Table(name = "order2")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Order2.findAll", query = "SELECT o FROM Order2 o")
    , @NamedQuery(name = "Order2.findByOrderid", query = "SELECT o FROM Order2 o WHERE o.orderid = :orderid")
    , @NamedQuery(name = "Order2.findByPersonname", query = "SELECT o FROM Order2 o WHERE o.personname = :personname")
    , @NamedQuery(name = "Order2.findByDiseasename", query = "SELECT o FROM Order2 o WHERE o.diseasename = :diseasename")})
public class Order2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Orderid")
    private Integer orderid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Personname")
    private String personname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Diseasename")
    private String diseasename;

    public Order2() {
    }

    public Order2(Integer orderid) {
        this.orderid = orderid;
    }

    public Order2(Integer orderid, String personname, String diseasename) {
        this.orderid = orderid;
        this.personname = personname;
        this.diseasename = diseasename;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getPersonname() {
        return personname;
    }

    public void setPersonname(String personname) {
        this.personname = personname;
    }

    public String getDiseasename() {
        return diseasename;
    }

    public void setDiseasename(String diseasename) {
        this.diseasename = diseasename;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderid != null ? orderid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Order2)) {
            return false;
        }
        Order2 other = (Order2) object;
        if ((this.orderid == null && other.orderid != null) || (this.orderid != null && !this.orderid.equals(other.orderid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pers.tong.backendlogin06.Order2[ orderid=" + orderid + " ]";
    }
    
}
