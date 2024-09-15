package com.example.microservice.infrastructure.dynamodb;

import com.example.microservice.domain.dynamodb.PrecoCalculado;
import com.example.microservice.infrastructure.dynamodb.DynamoDbRepository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.example.microservice.domain.dynamodb.PrecoCalculado;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

class DynamoDbRepositoryTest {

    @Mock
    private DynamoDBMapper dynamoDBMapper;

    @InjectMocks
    private DynamoDbRepository dynamoDbRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);  // Inicializa os mocks
    }

    // @Test
    // void testSave() {
    //     // Arrange
    //     PrecoCalculado precoCalculado = new PrecoCalculado();
    //     precoCalculado.setId("123");

    //     // Act
    //     dynamoDbRepository.save(precoCalculado);

    //     // Assert: Verifica se o método save do DynamoDBMapper foi chamado com o objeto correto
    //     verify(dynamoDBMapper, times(1)).save(precoCalculado);
    // }
}
