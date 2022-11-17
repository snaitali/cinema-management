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
public class Movie {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    /*private Double duration;

    private String director;

    private String description;

    private String picture;

    private Date releaseDate;*/

    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "movie", fetch = FetchType.LAZY)
    private List<MovieProjection> projections = new ArrayList<>();
}
