
package com.udea.empleado.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ApiModel(description="Devuelve todos los detalles de la persona")
@ToString
@Entity
public class Persona implements Serializable {
    
    @ApiModelProperty(notes="la BD genera el ID de la persona")
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="idperson")
    private Long idPerson;
    
    @ApiModelProperty(notes="nombre de la persona")
    @Column(name="firstname",nullable=false,length=80)
    private @NonNull String firstName;
    @ApiModelProperty(notes="apellido de la persona")
    @Column(name="lastname",nullable=false,length=80)
    private @NonNull String lastName;
    @ApiModelProperty(notes="email de la persona")
    @Column(name="email",nullable=false,length=80)
    private @NonNull String email;
}
