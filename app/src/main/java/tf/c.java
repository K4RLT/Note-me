package tf;

import kotlin.jvm.internal.b0;
import ya.rc;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final te.c[] f25715a = new te.c[0];

    /* renamed from: b, reason: collision with root package name */
    public static final c4.s f25716b = new c4.s("NULL", 8);

    /* renamed from: c, reason: collision with root package name */
    public static final c4.s f25717c = new c4.s("UNINITIALIZED", 8);

    /* renamed from: d, reason: collision with root package name */
    public static final c4.s f25718d = new c4.s("DONE", 8);

    public static final Object a(te.g gVar, Object obj, Object obj2, df.p pVar, te.c cVar) {
        Object invoke;
        Object l10 = uf.a.l(gVar, obj2);
        try {
            w wVar = new w(cVar, gVar);
            if (pVar == null) {
                invoke = rc.c(pVar, obj, wVar);
            } else {
                b0.b(2, pVar);
                invoke = pVar.invoke(obj, wVar);
            }
            uf.a.g(gVar, l10);
            if (invoke == ue.a.f27192u) {
                cVar.getClass();
            }
            return invoke;
        } catch (Throwable th) {
            uf.a.g(gVar, l10);
            throw th;
        }
    }
}
