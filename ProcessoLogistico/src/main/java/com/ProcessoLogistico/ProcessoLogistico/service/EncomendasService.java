package com.ProcessoLogistico.ProcessoLogistico.service;

import com.ProcessoLogistico.ProcessoLogistico.domain.Encomendas;
import com.ProcessoLogistico.ProcessoLogistico.domain.StatusOrder;
import com.ProcessoLogistico.ProcessoLogistico.repositories.EncomendasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

import static com.ProcessoLogistico.ProcessoLogistico.domain.StatusOrder.POSTADO;


@Service
 public class EncomendasService {

    @Autowired
     private EncomendasRepository encomendasRepository;

     public Encomendas cadastroEncomendas(Encomendas dados) {

         if(dados.getQuantidadeDeEncomendas() <= 0 ) {
             throw new RuntimeException("A quantidade de encomendas precisa ser maior que 0");
         }
         dados.setStatus(POSTADO);

         dados.setHistorico(LocalDateTime.now());

         return encomendasRepository.save(dados);


     }

     public Encomendas atualizarStatus(UUID id, StatusOrder NovoStatus) {

         Encomendas encomendas = encomendasRepository.findById(id)
                 .orElseThrow(() -> new RuntimeException("Não foi possível achar a encomendas"));

         if (NovoStatus == StatusOrder.ENTREGUE && encomendas.getStatus() != StatusOrder.EM_TRANSITO) {
             throw new RuntimeException("A encomenda precisa estar em transito para ser entregue!");
         }

         encomendas.setStatus(NovoStatus);
         encomendas.setHistorico(LocalDateTime.now());

         return encomendasRepository.save(encomendas);



     }

     public Encomendas consultarId(UUID id) {

         Encomendas encomendas = encomendasRepository.findById(id)
                 .orElseThrow(() -> new RuntimeException("A encomenda não existe! ou foi digitado o seu ID errado"));


         System.out.println("Encomenda Encontrada : " + encomendas.getDescrition());

         return encomendas;
     }


 }