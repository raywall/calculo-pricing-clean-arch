package com.example.microservice.infrastructure.redis;

import com.example.microservice.domain.redis.TaxaFunding;
import com.example.microservice.infrastructure.redis.RedisTaxaFundingRepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class RedisTaxaFundingRepositoryTest {

    @Mock
    private RedisTemplate<String, TaxaFunding> redisTemplate;

    @InjectMocks
    private RedisTaxaFundingRepository redisTaxaFundingRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    // @Test
    // void testFindById() {
    //     // Arrange
    //     String taxaFundingId = "taxa123";
    //     TaxaFunding taxaFunding = new TaxaFunding();
    //     taxaFunding.setTaxaFundingId(taxaFundingId);
        
    //     when(redisTemplate.opsForValue().get(taxaFundingId)).thenReturn(taxaFunding);

    //     // Act
    //     Optional<TaxaFunding> result = redisTaxaFundingRepository.findById(taxaFundingId);

    //     // Assert
    //     assertTrue(result.isPresent());
    //     assertEquals(taxaFundingId, result.get().getTaxaFundingId());
    //     verify(redisTemplate, times(1)).opsForValue().get(taxaFundingId);
    // }

    // @Test
    // void testFindByIdNotFound() {
    //     // Arrange
    //     String taxaFundingId = "taxa123";
    //     when(redisTemplate.opsForValue().get(taxaFundingId)).thenReturn(null);

    //     // Act
    //     Optional<TaxaFunding> result = redisTaxaFundingRepository.findById(taxaFundingId);

    //     // Assert
    //     assertFalse(result.isPresent());
    //     verify(redisTemplate, times(1)).opsForValue().get(taxaFundingId);
    // }
}
