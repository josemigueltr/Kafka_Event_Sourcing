package com.techbank.cqrs.core.events;

import com.techbank.cqrs.core.messages.Messaget;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public abstract class BaseEvent extends Messaget {
    private int version;
}
