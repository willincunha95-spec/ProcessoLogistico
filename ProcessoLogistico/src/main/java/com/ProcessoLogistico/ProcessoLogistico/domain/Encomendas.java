package com.ProcessoLogistico.ProcessoLogistico.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
@Entity
@Table(name = "tb_encomendas")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Encomendas {

    //Fluxo de encomendas
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    //Publico pois o usuário do tipo cliente vai poder consultar o status da entrega por Id
    public String IdEncomendas;

    private String encomendas;
    private int quantidadeDeEncomendas;
    private String descrition;
    //Status da entrega POSTADO,EM_TRANSITO E ENTREGUE
    @Enumerated(EnumType.STRING)
    private StatusOrder status;
    private LocalDateTime historico;

}
