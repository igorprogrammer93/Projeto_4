package dao;

import jakarta.persistence.EntityManager;
import database.JPAUtil;
import model.Produto;

import java.util.List;

public class ProdutoDAO {

    public void salvar(Produto produto) {
        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(produto);
        em.getTransaction().commit();
        em.close();
    }

    public List<Produto> listar() {
        EntityManager em = JPAUtil.getEntityManager();
        List<Produto> produtos = em.createQuery("FROM Produto", Produto.class).getResultList();
        em.close();
        return produtos;
    }
}
