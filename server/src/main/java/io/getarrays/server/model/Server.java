package io.getarrays.server.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.AUTO;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Server {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    @Column(unique=true)
    @NotEmpty(message = "IP can not be empty or null ")
    private String ipAddress;
    private String memory;
    private String name ;
    private String imageURL;
    private Status status  ;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
