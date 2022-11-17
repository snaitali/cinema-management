package org.cine.cinemanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class MovieProjection {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date projectionDate;

    private Double price;

    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Theater theater;

    @OneToMany
    private List<Session> sessions = new ArrayList<>();

    @OneToMany(mappedBy = "projection", fetch = FetchType.LAZY)
    private List<Ticket> tickets = new ArrayList<>();
}
