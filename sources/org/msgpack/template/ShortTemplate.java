package org.msgpack.template;

import java.io.IOException;
import org.msgpack.C53798c;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class ShortTemplate extends AbstractTemplate<Short> {
    static final ShortTemplate instance = new ShortTemplate();

    private ShortTemplate() {
    }

    public static ShortTemplate getInstance() {
        return instance;
    }

    public Short read(Unpacker unpacker, Short sh, boolean z) throws IOException {
        if (z || !unpacker.trySkipNil()) {
            return Short.valueOf(unpacker.readShort());
        }
        return null;
    }

    public void write(Packer packer, Short sh, boolean z) throws IOException {
        if (sh != null) {
            packer.write(sh);
        } else if (!z) {
            packer.writeNil();
        } else {
            throw new C53798c("Attempted to write null");
        }
    }
}
