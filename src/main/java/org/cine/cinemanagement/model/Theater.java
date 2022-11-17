package org.cine.cinemanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Theater {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String theaterName;

    private Integer seatsNumber;

    @ManyToOne
    private Cinema cinema;

    @OneToMany(mappedBy = "theater", fetch = FetchType.LAZY)
    private List<MovieProjection> movieProjections = new ArrayList<>();

    @OneToMany(mappedBy = "theater", fetch = FetchType.LAZY)
    private List<Seat> seats = new ArrayList<>();
}
