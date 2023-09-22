package com.proveinfor.controller;

import com.proveinfor.dtos.ClienteRecordDto;
import com.proveinfor.model.ClienteModel;
import com.proveinfor.repository.ClienteRespository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

@Controller
@RestController
public class ClienteController {

    @Autowired
    ClienteRespository clienteRespository;


    @PostMapping("/cliente")
    public ResponseEntity<ClienteModel> saveCliente(@RequestBody @Valid ClienteRecordDto clienteRecordDto){

        ClienteModel clienteModel = new ClienteModel();
        BeanUtils.copyProperties(clienteRecordDto, clienteModel);

        return ResponseEntity.status(HttpStatus.CREATED).body(clienteRespository.save(clienteModel));
    }

    @GetMapping("/cliente")
    public ResponseEntity<List<ClienteModel>> getTodosOsClientes(){
        return ResponseEntity.status(HttpStatus.OK).body(clienteRespository.findAll());
    }
@GetMapping("/cliente/{id}")
    public ResponseEntity<Object> getUmCliente(@PathVariable(value = "id") UUID id){
    Optional<ClienteModel> cliente = clienteRespository.findById(id);
    if (cliente.isEmpty()){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente não encontrado");
    }
    return ResponseEntity.status(HttpStatus.OK).body(cliente.get());

    
}







}
