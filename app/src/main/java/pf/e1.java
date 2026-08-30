package pf;
import l.a;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class e1 extends CancellationException {

    /* renamed from: u, reason: collision with root package name */
    public final transient k1 f22742u;

    public e1(String str, Throwable th, k1 k1Var) {
        super(str);
        this.f22742u = k1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof e1) {
                e1 e1Var = (e1) obj;
                if (!kotlin.jvm.internal.a(e1Var.getMessage(), getMessage()) || !kotlin.jvm.internal.a(e1Var.f22742u, this.f22742u) || !kotlin.jvm.internal.a(e1Var.getCause(), getCause())) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int i;
        String message = getMessage();
        message.getClass();
        int hashCode = (this.f22742u.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i = cause.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f22742u;
    }
}
