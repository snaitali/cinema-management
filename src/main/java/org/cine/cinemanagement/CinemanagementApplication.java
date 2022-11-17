package org.cine.cinemanagement;

import org.cine.cinemanagement.model.*;
import org.cine.cinemanagement.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class CinemanagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(CinemanagementApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CinemaService cinemaService,
                            CityService cityService,
                            TheaterService theaterService,
                            MovieService movieService,
                            MovieProjectionService movieProjectionService,
                            CategoryService categoryService,
                            SeatService seatService,
                            TicketService ticketService) {
        return args -> {

            /* ********************** CITY ************************************* */

            Stream.of("Rabat", "Tanger", "Casablanca", "Marrakech")
                    .forEach(name -> {
                        City city = new City();
                        city.setCityName(name);
                        cityService.saveCity(city);
                    });

            City rabat = cityService.findCityByName("Rabat");
            City tanger = cityService.findCityByName("Tanger");
            City marrakech = cityService.findCityByName("Marrakech");
            City casa = cityService.findCityByName("Casablanca");

            /* ********************** CINEMA ************************************* */

            Cinema cineMegaramaRabat = new Cinema();
            cineMegaramaRabat.setName("Megarama Rabat");
            cineMegaramaRabat.setPhoneNumber("+212522468734");
            cineMegaramaRabat.setEmail("megarama@gmail.com");
            cineMegaramaRabat.setTheaterNumber(9);
            cineMegaramaRabat.setCity(rabat);
            cinemaService.saveCinema(cineMegaramaRabat);

            Cinema cineMegaramaMarrakech = new Cinema();
            cineMegaramaMarrakech.setName("Megarama Marrakech");
            cineMegaramaMarrakech.setPhoneNumber("+212522468734");
            cineMegaramaMarrakech.setEmail("megarama@gmail.com");
            cineMegaramaMarrakech.setTheaterNumber(10);
            cineMegaramaMarrakech.setCity(marrakech);
            cinemaService.saveCinema(cineMegaramaMarrakech);

            Cinema cineMegaramaCasa = new Cinema();
            cineMegaramaCasa.setName("Megarama Casa");
            cineMegaramaCasa.setPhoneNumber("+212522468734");
            cineMegaramaCasa.setEmail("megarama@gmail.com");
            cineMegaramaCasa.setTheaterNumber(13);
            cineMegaramaCasa.setCity(casa);
            cinemaService.saveCinema(cineMegaramaCasa);

            Cinema cineMegaramaTanger = new Cinema();
            cineMegaramaTanger.setName("Megarama Tanger");
            cineMegaramaTanger.setPhoneNumber("+212522468734");
            cineMegaramaTanger.setEmail("megarama@gmail.com");
            cineMegaramaTanger.setTheaterNumber(13);
            cineMegaramaTanger.setCity(tanger);
            cinemaService.saveCinema(cineMegaramaTanger);


            /* ********************** THEATER ************************************* */


            Theater mimosas = new Theater();
            mimosas.setTheaterName("Mimosas");
            mimosas.setSeatsNumber(Math.random() > 0.5 ? 100 : 150);
            mimosas.setCinema(cineMegaramaRabat);
            theaterService.saveTheater(mimosas);

            Theater lixus = new Theater();
            lixus.setTheaterName("Lixus");
            lixus.setSeatsNumber(Math.random() > 0.5 ? 100 : 150);
            lixus.setCinema(cineMegaramaRabat);
            theaterService.saveTheater(lixus);

            Theater axios = new Theater();
            axios.setTheaterName("Axios");
            axios.setSeatsNumber(Math.random() > 0.5 ? 100 : 150);
            axios.setCinema(cineMegaramaTanger);
            theaterService.saveTheater(axios);

            Theater salle1 = new Theater();
            salle1.setTheaterName("Salle 1");
            salle1.setSeatsNumber(Math.random() > 0.5 ? 100 : 150);
            salle1.setCinema(cineMegaramaCasa);
            theaterService.saveTheater(salle1);

            Theater salle2 = new Theater();
            salle2.setTheaterName("Salle 2");
            salle2.setSeatsNumber(Math.random() > 0.5 ? 100 : 150);
            salle2.setCinema(cineMegaramaMarrakech);
            theaterService.saveTheater(salle2);


            /* ********************** Category ************************************* */

            Category comedyCategory = new Category();
            comedyCategory.setName("Comedy");
            categoryService.saveCategory(comedyCategory);

            Category dramaCategory = new Category();
            dramaCategory.setName("Drama");
            categoryService.saveCategory(dramaCategory);

            Category actionCategory = new Category();
            actionCategory.setName("Action");
            categoryService.saveCategory(actionCategory);




            /* ********************** MOVIE ************************************* */


            Movie djangoMovie = new Movie();
            djangoMovie.setName("Django Unchained");
            djangoMovie.setCategory(dramaCategory);
            movieService.saveMovie(djangoMovie);

            Movie godFatherMovie = new Movie();
            godFatherMovie.setName("The Godfather");
            godFatherMovie.setCategory(dramaCategory);
            movieService.saveMovie(godFatherMovie);

            Movie darkKnightMovie = new Movie();
            darkKnightMovie.setName("The Dark Knight");
            darkKnightMovie.setCategory(actionCategory);
            movieService.saveMovie(darkKnightMovie);

            Movie pulpFictionMovie = new Movie();
            pulpFictionMovie.setName("Pulp Fiction");
            pulpFictionMovie.setCategory(comedyCategory);
            movieService.saveMovie(pulpFictionMovie);


            /* ********************** MOVIE_PROJECTION ************************************* */


            MovieProjection djangoProjection = new MovieProjection();
            djangoProjection.setProjectionDate(new Date());
            djangoProjection.setMovie(djangoMovie);
            djangoProjection.setTheater(mimosas);
            djangoProjection.setPrice(70.00);
            movieProjectionService.saveProjection(djangoProjection);

            MovieProjection godFatherProjection = new MovieProjection();
            godFatherProjection.setProjectionDate(new Date());
            godFatherProjection.setPrice(80.00);
            godFatherProjection.setMovie(godFatherMovie);
            godFatherProjection.setTheater(lixus);
            movieProjectionService.saveProjection(godFatherProjection);

            MovieProjection darkKnightProjection = new MovieProjection();
            darkKnightProjection.setProjectionDate(new Date());
            darkKnightProjection.setPrice(100.00);
            darkKnightProjection.setMovie(darkKnightMovie);
            darkKnightProjection.setTheater(axios);
            movieProjectionService.saveProjection(darkKnightProjection);

            MovieProjection pulpFictionProjection = new MovieProjection();
            pulpFictionProjection.setProjectionDate(new Date());
            pulpFictionProjection.setPrice(60.00);
            pulpFictionProjection.setMovie(pulpFictionMovie);
            pulpFictionProjection.setTheater(salle1);
            movieProjectionService.saveProjection(pulpFictionProjection);



            /* ********************** SEAT ************************************* */

            Seat seat1 = new Seat();
            seat1.setNumber(1);
            seat1.setTheater(mimosas);
            seatService.saveSeat(seat1);

            Seat seat2 = new Seat();
            seat2.setNumber(2);
            seat2.setTheater(mimosas);
            seatService.saveSeat(seat2);

            Seat seat3 = new Seat();
            seat3.setNumber(3);
            seat3.setTheater(mimosas);
            seatService.saveSeat(seat3);

            Seat seat4 = new Seat();
            seat4.setNumber(4);
            seat4.setTheater(axios);
            seatService.saveSeat(seat4);


            /* ********************** TICKET ************************************* */

            Ticket ticket1 = new Ticket();
            ticket1.setClientName("Soufiane");
            ticket1.setSeat(seat3);
            ticketService.saveTicket(ticket1);

            Ticket ticket2 = new Ticket();
            ticket2.setClientName("Oumaima");
            ticket2.setSeat(seat1);
            ticketService.saveTicket(ticket2);




           /* Stream.of("Mimosas", "Lixus", "Axios", "Salle 1", "Salle 2", "Salle 3", "Theater 1", "Theater 2", "Theater 3")
                    .forEach(name -> {
                        Theater theater = new Theater();
                        theater.setTheaterName(name);
                        theater.setSeatsNumber(Math.random() > 0.5 ? 100 : 150);
                        theaterService.saveTheater(theater);
                    });*/


        };
    }

}
