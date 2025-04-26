package dao;

import jakarta.persistence.EntityManager;
import database.JPAUtil;
import model.Venda;

import java.util.List;

public class VendaDAO {

    public void salvar(Venda venda) {
        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(venda);
        em.getTransaction().commit();
        em.close();
    }

    public List<Venda> listar() {
        EntityManager em = JPAUtil.getEntityManager();
        List<Venda> vendas = em.createQuery("FROM Venda", Venda.class).getResultList();
        em.close();
        return vendas;
    }
}

