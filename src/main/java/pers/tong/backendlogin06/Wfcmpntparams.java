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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "wfcmpntparams")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Wfcmpntparams.findAll", query = "SELECT w FROM Wfcmpntparams w")
    , @NamedQuery(name = "Wfcmpntparams.findByIdwfcmpntparams", query = "SELECT w FROM Wfcmpntparams w WHERE w.idwfcmpntparams = :idwfcmpntparams")
    , @NamedQuery(name = "Wfcmpntparams.findByParamname", query = "SELECT w FROM Wfcmpntparams w WHERE w.paramname = :paramname")
    , @NamedQuery(name = "Wfcmpntparams.findByDirection", query = "SELECT w FROM Wfcmpntparams w WHERE w.direction = :direction")
    , @NamedQuery(name = "Wfcmpntparams.findByComment", query = "SELECT w FROM Wfcmpntparams w WHERE w.comment = :comment")
    , @NamedQuery(name = "Wfcmpntparams.findByValtype", query = "SELECT w FROM Wfcmpntparams w WHERE w.valtype = :valtype")
    , @NamedQuery(name = "Wfcmpntparams.findByParamtype", query = "SELECT w FROM Wfcmpntparams w WHERE w.paramtype = :paramtype")
    , @NamedQuery(name = "Wfcmpntparams.findByPrefix", query = "SELECT w FROM Wfcmpntparams w WHERE w.prefix = :prefix")
    , @NamedQuery(name = "Wfcmpntparams.findByPost", query = "SELECT w FROM Wfcmpntparams w WHERE w.post = :post")
    , @NamedQuery(name = "Wfcmpntparams.findByDefaultval", query = "SELECT w FROM Wfcmpntparams w WHERE w.defaultval = :defaultval")})
public class Wfcmpntparams implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idwfcmpntparams")
    private Integer idwfcmpntparams;
    @Size(max = 45)
    @Column(name = "paramname")
    private String paramname;
    @Column(name = "direction")
    private Integer direction;
    @Size(max = 45)
    @Column(name = "comment")
    private String comment;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valtype")
    private int valtype;
    @Basic(optional = false)
    @NotNull
    @Column(name = "paramtype")
    private int paramtype;
    @Size(max = 45)
    @Column(name = "prefix")
    private String prefix;
    @Column(name = "post")
    private Integer post;
    @Size(max = 45)
    @Column(name = "defaultval")
    private String defaultval;
    @JoinColumn(name = "belongtocmpnt", referencedColumnName = "idwfcomponent")
    @ManyToOne(optional = false)
    private Wfcomponents belongtocmpnt;

    public Wfcmpntparams() {
    }

    public Wfcmpntparams(Integer idwfcmpntparams) {
        this.idwfcmpntparams = idwfcmpntparams;
    }

    public Wfcmpntparams(Integer idwfcmpntparams, int valtype, int paramtype) {
        this.idwfcmpntparams = idwfcmpntparams;
        this.valtype = valtype;
        this.paramtype = paramtype;
    }

    public Integer getIdwfcmpntparams() {
        return idwfcmpntparams;
    }

    public void setIdwfcmpntparams(Integer idwfcmpntparams) {
        this.idwfcmpntparams = idwfcmpntparams;
    }

    public String getParamname() {
        return paramname;
    }

    public void setParamname(String paramname) {
        this.paramname = paramname;
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getValtype() {
        return valtype;
    }

    public void setValtype(int valtype) {
        this.valtype = valtype;
    }

    public int getParamtype() {
        return paramtype;
    }

    public void setParamtype(int paramtype) {
        this.paramtype = paramtype;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Integer getPost() {
        return post;
    }

    public void setPost(Integer post) {
        this.post = post;
    }

    public String getDefaultval() {
        return defaultval;
    }

    public void setDefaultval(String defaultval) {
        this.defaultval = defaultval;
    }

    public Wfcomponents getBelongtocmpnt() {
        return belongtocmpnt;
    }

    public void setBelongtocmpnt(Wfcomponents belongtocmpnt) {
        this.belongtocmpnt = belongtocmpnt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idwfcmpntparams != null ? idwfcmpntparams.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Wfcmpntparams)) {
            return false;
        }
        Wfcmpntparams other = (Wfcmpntparams) object;
        if ((this.idwfcmpntparams == null && other.idwfcmpntparams != null) || (this.idwfcmpntparams != null && !this.idwfcmpntparams.equals(other.idwfcmpntparams))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pers.tong.backendlogin06.Wfcmpntparams[ idwfcmpntparams=" + idwfcmpntparams + " ]";
    }
    
}
