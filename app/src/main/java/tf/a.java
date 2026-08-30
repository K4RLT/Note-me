package tf;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class a extends CancellationException {

    /* renamed from: u, reason: collision with root package name */
    public final transient Object f25710u;

    public a(sf.h hVar) {
        super("Flow was aborted, no more elements needed");
        this.f25710u = hVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
