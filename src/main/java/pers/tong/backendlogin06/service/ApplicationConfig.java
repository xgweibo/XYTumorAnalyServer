/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pers.tong.backendlogin06.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author andytext
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(pers.tong.backendlogin06.service.CancerpersonFacadeREST.class);
        resources.add(pers.tong.backendlogin06.service.DiseasedbFacadeREST.class);
        resources.add(pers.tong.backendlogin06.service.DiseasedrugFacadeREST.class);
        resources.add(pers.tong.backendlogin06.service.DiseasegeneFacadeREST.class);
        resources.add(pers.tong.backendlogin06.service.GeneinfoFacadeREST.class);
        resources.add(pers.tong.backendlogin06.service.GenelistFacadeREST.class);
        resources.add(pers.tong.backendlogin06.service.NewCrossOriginResourceSharingFilter.class);
        resources.add(pers.tong.backendlogin06.service.Order1FacadeREST.class);
        resources.add(pers.tong.backendlogin06.service.Order2FacadeREST.class);
        resources.add(pers.tong.backendlogin06.service.PersonalgenomeFacadeREST.class);
        resources.add(pers.tong.backendlogin06.service.PredictinfoFacadeREST.class);
        resources.add(pers.tong.backendlogin06.service.TargetdrugFacadeREST.class);
        resources.add(pers.tong.backendlogin06.service.TumordiseaseFacadeREST.class);
        resources.add(pers.tong.backendlogin06.service.TumorgeneFacadeREST.class);
        resources.add(pers.tong.backendlogin06.service.UserinfoFacadeREST.class);
        resources.add(pers.tong.backendlogin06.service.UserlistFacadeREST.class);
        resources.add(pers.tong.backendlogin06.service.WfcmpntparamsFacadeREST.class);
        resources.add(pers.tong.backendlogin06.service.WfcomponentsFacadeREST.class);
    }
    
}
