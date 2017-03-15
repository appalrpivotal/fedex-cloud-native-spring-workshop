package com.womack;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Collection;
import java.util.stream.Stream;

@SpringBootApplication
public class OrdersServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrdersServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(OrderRepository orderRepository) {
        return args -> {
            Stream.of("47774", "77333", "99333", "27772")
                    .forEach(customerNumber -> orderRepository.save(new Order(customerNumber, "Customer1")));
            orderRepository.findAll().forEach(System.out::println);
        };
    }

    @RepositoryRestResource
    interface OrderRepository extends PagingAndSortingRepository<Order, Long> {

        @RestResource(path = "by-name")
        Collection<Order> findByCustomerName(@Param("customerName") String customerName);
    }
}
