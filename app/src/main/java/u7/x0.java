package u7;
import b8.l2;
import k1.f;
import r0.l;
import r0.m;
import r0.r;
import r0.y;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f27011a = new ConcurrentHashMap();

    public static final f a(v0 v0Var, Context context, m mVar) {
        v0Var.getClass();
        context.getClass();
        r rVar = (r) mVar;
        rVar.a0(-839162853);
        String str = v0Var.f26938a;
        f fVar = (f) f27011a.get(str);
        if (fVar != null) {
            rVar.p(false);
            return fVar;
        }
        te.c cVar = null;
        if (!v0Var.e && v0Var.f26940c == null) {
            rVar.p(false);
            return null;
        }
        boolean f10 = rVar.f(v0Var) | rVar.h(context);
        Object O = rVar.O();
        if (f10 || O == l.f24285a) {
            O = new l2(v0Var, context, cVar, 19);
            rVar.k0(O);
        }
        f fVar2 = (f) y.D(null, str, (df.p) O, rVar, 6).getValue();
        rVar.p(false);
        return fVar2;
    }
}
