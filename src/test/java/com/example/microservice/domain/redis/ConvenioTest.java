package com.example.microservice.domain.redis;

import com.example.microservice.domain.redis.Convenio;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConvenioTest {

    @Test
    void testConvenioCreation() {
        // Arrange
        String codigoConvenio = "conv123";
        String nomeConvenio = "Convenio A";
        
        // Act
        Convenio convenio = new Convenio();
        convenio.setCodigoConvenio(codigoConvenio);
        convenio.setNomeConvenio(nomeConvenio);
        
        // Assert
        assertEquals(codigoConvenio, convenio.getCodigoConvenio());
        assertEquals(nomeConvenio, convenio.getNomeConvenio());
    }
}
