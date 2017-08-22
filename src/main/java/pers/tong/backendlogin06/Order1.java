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
@Table(name = "order1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Order1.findAll", query = "SELECT o FROM Order1 o")
    , @NamedQuery(name = "Order1.findByOrderid", query = "SELECT o FROM Order1 o WHERE o.orderid = :orderid")
    , @NamedQuery(name = "Order1.findByGenomename", query = "SELECT o FROM Order1 o WHERE o.genomename = :genomename")
    , @NamedQuery(name = "Order1.findByDataname", query = "SELECT o FROM Order1 o WHERE o.dataname = :dataname")})
public class Order1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "orderid")
    private Integer orderid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "genomename")
    private String genomename;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "dataname")
    private String dataname;

    public Order1() {
    }

    public Order1(Integer orderid) {
        this.orderid = orderid;
    }

    public Order1(Integer orderid, String genomename, String dataname) {
        this.orderid = orderid;
        this.genomename = genomename;
        this.dataname = dataname;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getGenomename() {
        return genomename;
    }

    public void setGenomename(String genomename) {
        this.genomename = genomename;
    }

    public String getDataname() {
        return dataname;
    }

    public void setDataname(String dataname) {
        this.dataname = dataname;
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
        if (!(object instanceof Order1)) {
            return false;
        }
        Order1 other = (Order1) object;
        if ((this.orderid == null && other.orderid != null) || (this.orderid != null && !this.orderid.equals(other.orderid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pers.tong.backendlogin06.Order1[ orderid=" + orderid + " ]";
    }
    
}
