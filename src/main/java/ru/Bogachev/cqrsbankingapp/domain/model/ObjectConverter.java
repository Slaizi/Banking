package ru.Bogachev.cqrsbankingapp.domain.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Convert;
import lombok.SneakyThrows;

@Convert
public class ObjectConverter implements AttributeConverter<Object, String> {
    @SneakyThrows
    @Override
    public String convertToDatabaseColumn(Object attribute) {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(attribute);
    }

    @Override
    public Object convertToEntityAttribute(String dbData) {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.convertValue(dbData, Object.class);
    }
}
