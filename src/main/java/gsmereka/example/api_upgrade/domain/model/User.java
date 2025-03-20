package gsmereka.example.api_upgrade.domain.model;


import gsmereka.example.api_upgrade.controller.dto.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import static java.util.Collections.emptyList;
import static java.util.Optional.ofNullable;
import static java.util.stream.Collectors.toList;

@Getter
@Setter
@Entity(name = "tb_user")
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    @OneToOne(cascade = CascadeType.ALL)
    private Card card;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Feature> features;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<News> news;

    public User(UserDto dto) {
        this.id = dto.id();
        this.name = dto.name();
        this.account = ofNullable(dto.account()).map(AccountDto::toModel).orElse(null);
        this.card = ofNullable(dto.card()).map(CardDto::toModel).orElse(null);
        this.features = ofNullable(dto.features()).orElse(emptyList()).stream().map(FeatureDto::toModel).collect(toList());
        this.news = ofNullable(dto.news()).orElse(emptyList()).stream().map(NewsDto::toModel).collect(toList());
    }

}
