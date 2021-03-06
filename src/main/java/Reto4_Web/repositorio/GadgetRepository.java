/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto4_Web.repositorio;

import Reto4_Web.interfaces.GadgetInterface;
import Reto4_Web.modelo.Gadget;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author andre
 */
@Repository
public class GadgetRepository {
    
    @Autowired
    private GadgetInterface gadgetCrudRepository;

    public List<Gadget> getAll() {
        return gadgetCrudRepository.findAll();
    }

    public Optional<Gadget> getClothe(Integer id) {
        return gadgetCrudRepository.findById(id);
    }

    public Gadget create(Gadget gadget) {
        return gadgetCrudRepository.save(gadget);
    }

    public void update(Gadget gadget) {
        gadgetCrudRepository.save(gadget);
    }

    public void delete(Gadget gadget) {
        gadgetCrudRepository.delete(gadget);
    }
    
}
