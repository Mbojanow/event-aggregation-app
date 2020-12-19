package pl.sdacademy.eventaggregationapp.domain;

import java.util.List;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "roles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {

  @Id
  @GeneratedValue
  private UUID id;//---------------------------------------------------

  @Column(name = "name")
  private String name;

  @ManyToMany
  @JoinTable(name = "roles_to_users",
    joinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"))
  private Set<User> users;
}
