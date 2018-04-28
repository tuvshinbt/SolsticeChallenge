/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt.pre.prob.solstice.challenge.repository;

import bt.pre.prob.solstice.challenge.entity.Contact;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author tuvshuu
 */
public interface ContactRepository extends JpaRepository<Contact, Integer> {

    List<Contact> findByEmail(String email);

    List<Contact> findByPhoneNumber(Long phoneNumber);

    static <T> T getSingleResultOrNull(List<T> list) {
        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }
    }
}
