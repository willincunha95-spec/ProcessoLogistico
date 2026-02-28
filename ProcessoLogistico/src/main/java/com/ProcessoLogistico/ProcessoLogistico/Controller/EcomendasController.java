package com.ProcessoLogistico.ProcessoLogistico.Controller;


import com.ProcessoLogistico.ProcessoLogistico.domain.Encomendas;
import com.ProcessoLogistico.ProcessoLogistico.domain.StatusOrder;
import com.ProcessoLogistico.ProcessoLogistico.service.EncomendasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/Encomenda")
public class EcomendasController {

    @Autowired
    private EncomendasService service;
    //Endpoint para cadastrar (Apenas para os usuários do tipo ADMIN)
    public ResponseEntity<Encomendas>cadastrar(@RequestBody Encomendas dados){
        var encomenda = service.cadastroEncomendas(dados);
        return ResponseEntity.ok(encomenda);

    }

    //Endpoint para atualizar os status das encomendas(Apenas para usuários do tipo ADMIN)
    @PutMapping("/{id}")
    public  ResponseEntity<Encomendas> atualizar(@PathVariable UUID id , @RequestBody StatusOrder novoStatus){
        var encomenda = service.atualizarStatus(id , novoStatus);
        return ResponseEntity.ok(encomenda);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Encomendas> consultar(@PathVariable UUID id ){
        var encomenda = service.consultarId(id);
        return ResponseEntity.ok(encomenda);
    }

}
