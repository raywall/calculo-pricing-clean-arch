package com.example.microservice.infrastructure.redis;

import com.example.microservice.domain.redis.Convenio;
import com.example.microservice.infrastructure.redis.RedisConvenioRepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class RedisConvenioRepositoryTest {

    @Mock
    private RedisTemplate<String, Convenio> redisTemplate;

    @InjectMocks
    private RedisConvenioRepository redisConvenioRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    // @Test
    // void testFindById() {
    //     // Arrange
    //     String convenioId = "conv123";
    //     com.example.microservice.domain.redis.Convenio convenio = new Convenio();
    //     convenio.setCodigoConvenio(convenioId);
        
    //     when(redisTemplate.opsForValue().get(convenioId)).thenReturn(convenio);

    //     // Act
    //     Optional<Convenio> result = redisConvenioRepository.findById(convenioId);

    //     // Assert
    //     assertTrue(result.isPresent());
    //     assertEquals(convenioId, result.get().getCodigoConvenio());
    //     verify(redisTemplate, times(1)).opsForValue().get(convenioId);
    // }

    // @Test
    // void testFindByIdNotFound() {
    //     // Arrange
    //     String convenioId = "conv123";
    //     when(redisTemplate.opsForValue().get(convenioId)).thenReturn(null);

    //     // Act
    //     Optional<Convenio> result = redisConvenioRepository.findById(convenioId);

    //     // Assert
    //     assertFalse(result.isPresent());
    //     verify(redisTemplate, times(1)).opsForValue().get(convenioId);
    // }
}
