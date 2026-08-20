package org.example.exam_final.Model;


import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)

public class Donation extends CashFlow {
    private String comment;

    @Override
    public String getType() {
        return "DONATION";
    }

}
