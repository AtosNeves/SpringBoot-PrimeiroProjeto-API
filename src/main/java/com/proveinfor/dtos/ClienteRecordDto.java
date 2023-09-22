package com.proveinfor.dtos;


import com.proveinfor.model.ClienteModel;
import jakarta.validation.constraints.NotBlank;

public record ClienteRecordDto(@NotBlank String nome,@NotBlank String pontoDeReferencia) {



}
