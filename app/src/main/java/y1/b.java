package y1;

import java.util.concurrent.CancellationException;
import z0.h;

/* loaded from: classes.dex */
public abstract class b extends CancellationException {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f30797u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i) {
        super(str);
        this.f30797u = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f30797u) {
            case 0:
                setStackTrace(c.f30798a);
                return this;
            default:
                setStackTrace(h.f31762a);
                return this;
        }
    }
}
