package org.link_shortener.repository;

import org.link_shortener.entities.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Long> {
}
