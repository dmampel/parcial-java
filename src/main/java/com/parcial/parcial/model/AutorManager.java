package com.parcial.parcial.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import jakarta.persistence.*;
import java.util.List;

public class AutorManager {
    private ObservableList<Autor> autores;
    private EntityManagerFactory emf;
    private EntityManager em;

    public AutorManager() {
        emf = Persistence.createEntityManagerFactory("parcialPU");
        em = emf.createEntityManager();
        autores = FXCollections.observableArrayList();
        cargarAutores();
    }

    private void cargarAutores() {
        autores.clear();
        List<Autor> lista = em.createQuery("SELECT a FROM Autor a", Autor.class).getResultList();
        autores.addAll(lista);
    }

    public ObservableList<Autor> getAutores() {
        return autores;
    }

    public void addAutor(Autor autor) {
        if (autor != null) {
            em.getTransaction().begin();
            em.persist(autor);
            em.getTransaction().commit();
            autores.add(autor);
        }
    }

    public void removeAutor(Autor autor) {
        if (autor != null) {
            em.getTransaction().begin();
            Autor toRemove = em.find(Autor.class, autor.getDni());
            if (toRemove != null) {
                em.remove(toRemove);
            }
            em.getTransaction().commit();
            autores.remove(autor);
        }
    }

    public void close() {
        if (em != null && em.isOpen()) em.close();
        if (emf != null && emf.isOpen()) emf.close();
    }
}
