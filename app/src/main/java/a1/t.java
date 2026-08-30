package a1;

import com.google.android.gms.internal.ads.x90;
import java.util.Arrays;
import kotlin.jvm.internal.b0;
import r0.v0;
import r0.y;
import ya.x0;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final x90 f224a = new x90(new i(1), 1, new j(1));

    public static final String a(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final x90 b(df.p pVar, df.l lVar) {
        a aVar = new a(pVar);
        b0.b(1, lVar);
        return new x90(aVar, 1, lVar);
    }

    public static final Object c(Object[] objArr, s sVar, df.a aVar, r0.m mVar, int i, int i10) {
        Object[] objArr2;
        boolean z3;
        Object obj;
        Object obj2;
        Object e;
        if ((i10 & 2) != 0) {
            sVar = f224a;
        }
        s sVar2 = sVar;
        r0.r rVar = (r0.r) mVar;
        long j10 = rVar.T;
        x0.a(36);
        String l10 = Long.toString(j10, 36);
        l10.getClass();
        sVar2.getClass();
        o oVar = (o) rVar.j(q.f219a);
        Object O = rVar.O();
        Object obj3 = null;
        v0 v0Var = r0.l.f24285a;
        if (O == v0Var) {
            if (oVar != null && (e = oVar.e(l10)) != null) {
                obj2 = sVar2.c(e);
            } else {
                obj2 = null;
            }
            if (obj2 == null) {
                obj2 = aVar.invoke();
            }
            objArr2 = objArr;
            d dVar = new d(sVar2, oVar, l10, obj2, objArr2);
            rVar.k0(dVar);
            O = dVar;
        } else {
            objArr2 = objArr;
        }
        d dVar2 = (d) O;
        if (Arrays.equals(objArr2, dVar2.f191y)) {
            obj3 = dVar2.f190x;
        }
        if (obj3 == null) {
            obj3 = aVar.invoke();
        }
        boolean h3 = rVar.h(dVar2);
        if ((((i & 112) ^ 48) > 32 && rVar.h(sVar2)) || (i & 48) == 32) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean h10 = h3 | z3 | rVar.h(oVar) | rVar.f(l10) | rVar.h(obj3) | rVar.h(objArr2);
        Object O2 = rVar.O();
        if (!h10 && O2 != v0Var) {
            obj = obj3;
        } else {
            Object[] objArr3 = objArr2;
            obj = obj3;
            b bVar = new b(dVar2, sVar2, oVar, l10, obj, objArr3, 0);
            rVar.k0(bVar);
            O2 = bVar;
        }
        y.j((df.a) O2, rVar);
        return obj;
    }
}
