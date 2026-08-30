package uf;
import a.a;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f27240a = 0;

    static {
        Object kVar;
        Object kVar2;
        Exception exc = new Exception();
        String simpleName = a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            kVar = ve.a.class.getCanonicalName();
        } catch (Throwable th) {
            kVar = new pe.k(th);
        }
        if (pe.a(kVar) != null) {
            kVar = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            kVar2 = s.class.getCanonicalName();
        } catch (Throwable th2) {
            kVar2 = new pe.k(th2);
        }
        if (pe.a(kVar2) != null) {
            kVar2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
