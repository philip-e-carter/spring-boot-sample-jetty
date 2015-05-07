/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.jetty.service;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author phil
 */

@Repository
public interface TaskRepository extends CrudRepository<Task, Integer> {
    
}
