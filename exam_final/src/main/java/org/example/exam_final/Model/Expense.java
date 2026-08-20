package org.example.exam_final.Model;

import lombok.*;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Expense extends CashFlow {
    private String reason;
    private String frequency;

    @Override
    public String getType() {
        return "EXPENSE";
    }
}