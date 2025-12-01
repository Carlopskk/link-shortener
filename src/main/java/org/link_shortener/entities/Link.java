package org.link_shortener.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "link")
public class Link {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String url;

}
