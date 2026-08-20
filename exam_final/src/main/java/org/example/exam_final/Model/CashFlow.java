package org.example.exam_final.Model;


import lombok.*;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data
public abstract class CashFlow {
    private String id;
    private Instant createdAt;
    private BigDecimal amount;
    private String userId;


    public abstract String getType();
}

