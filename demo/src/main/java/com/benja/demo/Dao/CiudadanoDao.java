/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.benja.demo.Dao;
import com.benja.demo.Modelo.Ciudadano;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
/**
 *
 * @author joseph
 */
@RepositoryRestResource(path = "ciudadanos",collectionResourceRel = "ciudadanos")
public interface CiudadanoDao extends CrudRepository<Ciudadano,Long>{
    @Override
    public List<Ciudadano>findAll();
}
