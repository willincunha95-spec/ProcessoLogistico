package com.ProcessoLogistico.ProcessoLogistico.domain.DTO;

import com.ProcessoLogistico.ProcessoLogistico.domain.UserRole;

public record RegisterDTO (String email , String password , UserRole role) {
}
