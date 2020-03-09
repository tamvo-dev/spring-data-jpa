package com.learnspringboot.demo.repository;

import com.learnspringboot.demo.models.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author tamvo
 * @created 09/03/2020 - 10:09 AM
 */

public interface PhoneRepository extends JpaRepository<Phone, Long> {
}
