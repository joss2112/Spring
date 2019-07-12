/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.benja.demo.Dao;
import com.benja.demo.Modelo.Ciudad;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
/**
 *
 * @author joseph
 */


/**
 *
 * @author joseph
 */
@RepositoryRestResource(path = "ciudades",collectionResourceRel = "ciudades")
public interface CiudadDao extends CrudRepository<Ciudad, Long> {
     @Override
    public List<Ciudad>findAll();
}
