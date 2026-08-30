package xa;
import q.f;

import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes.dex */
public abstract class b0 {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            m2 m2Var = new m2(stringWriter);
            m2Var.B = 1;
            c2.f30395z.getClass();
            o1.c(m2Var, this);
            return stringWriter.toString();
        } catch (IOException e) {
            g5.f(e);
            return null;
        }
    }
}
