package dao;

import jakarta.persistence.EntityManager;
import database.JPAUtil;
import model.Cliente;

import java.util.List;

public class ClienteDAO {

    public void salvar(Cliente cliente) {
        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();
        em.close();
    }

    public List<Cliente> listar() {
        EntityManager em = JPAUtil.getEntityManager();
        List<Cliente> clientes = em.createQuery("FROM Cliente", Cliente.class).getResultList();
        em.close();
        return clientes;
    }
}
