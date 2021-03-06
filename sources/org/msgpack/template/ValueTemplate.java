package org.msgpack.template;

import java.io.IOException;
import org.msgpack.C53798c;
import org.msgpack.packer.Packer;
import org.msgpack.type.Value;
import org.msgpack.unpacker.Unpacker;

public class ValueTemplate extends AbstractTemplate<Value> {
    static final ValueTemplate instance = new ValueTemplate();

    private ValueTemplate() {
    }

    public static ValueTemplate getInstance() {
        return instance;
    }

    public Value read(Unpacker unpacker, Value value, boolean z) throws IOException {
        if (z || !unpacker.trySkipNil()) {
            return unpacker.readValue();
        }
        return null;
    }

    public void write(Packer packer, Value value, boolean z) throws IOException {
        if (value != null) {
            value.writeTo(packer);
        } else if (!z) {
            packer.writeNil();
        } else {
            throw new C53798c("Attempted to write null");
        }
    }
}
