/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.db.wozek;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Ola
 */
@Stateless
public class ProduktyPinDostawFacade extends AbstractFacade<ProduktyPinDostaw> {

    @PersistenceContext(unitName = "kosmetykiPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProduktyPinDostawFacade() {
        super(ProduktyPinDostaw.class);
    }
    
}
