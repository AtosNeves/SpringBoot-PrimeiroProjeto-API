package com.proveinfor.repository;

import com.proveinfor.dtos.ClienteRecordDto;
import com.proveinfor.model.ClienteModel;
import jakarta.validation.Valid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

@Repository
public interface ClienteRespository extends JpaRepository<ClienteModel, UUID> {



}
