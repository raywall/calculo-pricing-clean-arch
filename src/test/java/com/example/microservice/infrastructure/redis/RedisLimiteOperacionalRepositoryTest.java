package com.example.microservice.infrastructure.redis;

import com.example.microservice.domain.redis.LimiteOperacional;
import com.example.microservice.infrastructure.redis.RedisLimiteOperacionalRepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class RedisLimiteOperacionalRepositoryTest {

    @Mock
    private RedisTemplate<String, LimiteOperacional> redisTemplate;

    @InjectMocks
    private RedisLimiteOperacionalRepository redisLimiteOperacionalRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    // @Test
    // void testFindById() {
    //     // Arrange
    //     String limiteOperacionalId = "limite123";
    //     LimiteOperacional limiteOperacional = new LimiteOperacional();
    //     limiteOperacional.setLimiteOperacionalId(limiteOperacionalId);
        
    //     when(redisTemplate.opsForValue().get(limiteOperacionalId)).thenReturn(limiteOperacional);

    //     // Act
    //     Optional<LimiteOperacional> result = redisLimiteOperacionalRepository.findById(limiteOperacionalId);

    //     // Assert
    //     assertTrue(result.isPresent());
    //     assertEquals(limiteOperacionalId, result.get().getLimiteOperacionalId());
    //     verify(redisTemplate, times(1)).opsForValue().get(limiteOperacionalId);
    // }

    // @Test
    // void testFindByIdNotFound() {
    //     // Arrange
    //     String limiteOperacionalId = "limite123";
    //     when(redisTemplate.opsForValue().get(limiteOperacionalId)).thenReturn(null);

    //     // Act
    //     Optional<LimiteOperacional> result = redisLimiteOperacionalRepository.findById(limiteOperacionalId);

    //     // Assert
    //     assertFalse(result.isPresent());
    //     verify(redisTemplate, times(1)).opsForValue().get(limiteOperacionalId);
    // }
}