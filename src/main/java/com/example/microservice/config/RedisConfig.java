package com.example.microservice.config;

import com.example.microservice.domain.redis.Convenio;
import com.example.microservice.domain.redis.LimiteOperacional;
import com.example.microservice.domain.redis.TaxaFunding;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;


@Configuration
public class RedisConfig {

    @Bean
    public RedisTemplate<String, Convenio> redisConvenioTemplate(RedisConnectionFactory connectionFactory) 
    {
        RedisTemplate<String, Convenio> template = new RedisTemplate<>();
        template.setConnectionFactory(connectionFactory);
        template.setKeySerializer(new StringRedisSerializer());
        template.setValueSerializer(new GenericJackson2JsonRedisSerializer());
        return template;
    }

    @Bean
    public RedisTemplate<String, LimiteOperacional> redisLimiteOperacionalTemplate(RedisConnectionFactory connectionFactory) 
    {
        RedisTemplate<String, LimiteOperacional> template = new RedisTemplate<>();
        template.setConnectionFactory(connectionFactory);
        template.setKeySerializer(new StringRedisSerializer());
        template.setValueSerializer(new GenericJackson2JsonRedisSerializer());
        return template;
    }

    @Bean
    public RedisTemplate<String, TaxaFunding> redisTaxaFundingTemplate(RedisConnectionFactory connectionFactory) 
    {
        RedisTemplate<String, TaxaFunding> template = new RedisTemplate<>();
        template.setConnectionFactory(connectionFactory);
        template.setKeySerializer(new StringRedisSerializer());
        template.setValueSerializer(new GenericJackson2JsonRedisSerializer());
        return template;
    }
}