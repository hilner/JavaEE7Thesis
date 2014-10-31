/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vasouv.javaee7thesis.courses.sessionbeans;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import vasouv.javaee7thesis.courses.Lecture;

/**
 *
 * @author vasouv
 */
@Stateless
public class LectureFacade extends AbstractFacade<Lecture> {
    @PersistenceContext(unitName = "vasouvPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LectureFacade() {
        super(Lecture.class);
    }
    
    public List<Lecture> findLecturesByCourseName(String courseName) {
        return em.createQuery("select l from Lecture l where l.courseid.idcourse = 2").getResultList();
    }
    
}
