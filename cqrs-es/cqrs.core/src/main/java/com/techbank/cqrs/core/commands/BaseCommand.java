package com.techbank.cqrs.core.commands;

import com.techbank.cqrs.core.messages.Messaget;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class BaseCommand extends Messaget {

    public BaseCommand(String id) {
        super(id);
    }
}


