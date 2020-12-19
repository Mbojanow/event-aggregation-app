package pl.sdacademy.eventaggregationapp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "cars")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {

  @Id
  @GeneratedValue
  private Long id;

  @Column(name = "model")
  private String model;

  @ManyToOne
  private User user;
}
