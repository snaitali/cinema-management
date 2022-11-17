package org.cine.cinemanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Seat {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer number;

    @ManyToOne
    private Theater theater;

    @OneToMany(mappedBy = "seat", fetch = FetchType.LAZY)
    private List<Ticket> tickets = new ArrayList<>();
}
