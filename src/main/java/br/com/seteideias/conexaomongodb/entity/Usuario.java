package br.com.seteideias.conexaomongodb.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("usuario")
@Data
public class Usuario {

    @Id
    private String id;
    private String nome;

}
