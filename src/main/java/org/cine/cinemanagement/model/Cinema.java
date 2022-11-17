package org.cine.cinemanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Cinema {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String phoneNumber;

    private String email;

    private Integer theaterNumber;

    @ManyToOne
    private City city;

    @OneToMany(mappedBy = "cinema", fetch = FetchType.LAZY)
    private List<Theater> theaters = new ArrayList<>();
}
