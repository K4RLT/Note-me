package q;
import t.t1;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class k0 extends CancellationException {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f22932u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(String str, int i) {
        super(str);
        this.f22932u = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f22932u) {
            case 0:
                setStackTrace(new StackTraceElement[0]);
                return this;
            case 1:
                setStackTrace(new StackTraceElement[0]);
                return this;
            default:
                setStackTrace(t1.f25522a);
                return this;
        }
    }
}
