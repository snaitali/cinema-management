package org.cine.cinemanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Session {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date debutDate;

}
