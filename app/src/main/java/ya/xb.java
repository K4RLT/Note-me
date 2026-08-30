package ya;
import xb.a;
import nd.e;
import o6.c;
import o6.m;
import o6.p;
import r0.a1;
import r0.l;
import r0.r;
import r0.v0;
import r0.y;
import s6.n;
import s6.o;
import s6.s;
import ya.xb;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class xb {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(android.content.Context r21, o r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, c r27) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.xb.a(android.content.Context, o, java.lang.String, java.lang.String, java.lang.String, java.lang.String, c):java.lang.Object");
    }

    public static final p b(Context context, o oVar, final String str) {
        a a10;
        p pVar = null;
        if (oVar instanceof o) {
            final int i = 1;
            final int i10 = 0;
            if (kotlin.jvm.internal.a(str, "__LottieInternalDefaultCacheKey__")) {
                HashMap hashMap = c.f21801a;
                final String str2 = "asset_apis_bee.json";
                e eVar = new e(context.getApplicationContext(), i, str2);
                HashMap hashMap2 = c.f21801a;
                a a11 = e.f25877b.a("asset_apis_bee.json");
                if (a11 != null) {
                    pVar = new p(a11);
                }
                if (hashMap2.containsKey("asset_apis_bee.json")) {
                    pVar = (p) hashMap2.get("asset_apis_bee.json");
                }
                if (pVar != null) {
                    return pVar;
                }
                p pVar2 = new p(eVar);
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                pVar2.b(new m() { // from class: o6.b
                    @Override // m
                    public final void onResult(Object obj) {
                        switch (i10) {
                            case 0:
                                HashMap hashMap3 = c.f21801a;
                                hashMap3.remove(str2);
                                atomicBoolean.set(true);
                                if (hashMap3.size() == 0) {
                                    c.e();
                                    return;
                                }
                                return;
                            default:
                                HashMap hashMap4 = c.f21801a;
                                hashMap4.remove(str2);
                                atomicBoolean.set(true);
                                if (hashMap4.size() == 0) {
                                    c.e();
                                    return;
                                }
                                return;
                        }
                    }
                });
                pVar2.a(new m() { // from class: o6.b
                    @Override // m
                    public final void onResult(Object obj) {
                        switch (i) {
                            case 0:
                                HashMap hashMap3 = c.f21801a;
                                hashMap3.remove(str2);
                                atomicBoolean.set(true);
                                if (hashMap3.size() == 0) {
                                    c.e();
                                    return;
                                }
                                return;
                            default:
                                HashMap hashMap4 = c.f21801a;
                                hashMap4.remove(str2);
                                atomicBoolean.set(true);
                                if (hashMap4.size() == 0) {
                                    c.e();
                                    return;
                                }
                                return;
                        }
                    }
                });
                if (!atomicBoolean.get()) {
                    hashMap2.put("asset_apis_bee.json", pVar2);
                    if (hashMap2.size() == 1) {
                        c.e();
                    }
                }
                return pVar2;
            }
            HashMap hashMap3 = c.f21801a;
            e eVar2 = new e(context.getApplicationContext(), i, str);
            HashMap hashMap4 = c.f21801a;
            if (str == null) {
                a10 = null;
            } else {
                a10 = e.f25877b.a(str);
            }
            if (a10 != null) {
                pVar = new p(a10);
            }
            if (str != null && hashMap4.containsKey(str)) {
                pVar = (p) hashMap4.get(str);
            }
            if (pVar != null) {
                return pVar;
            }
            p pVar3 = new p(eVar2);
            if (str != null) {
                final AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
                pVar3.b(new m() { // from class: o6.b
                    @Override // m
                    public final void onResult(Object obj) {
                        switch (i10) {
                            case 0:
                                HashMap hashMap32 = c.f21801a;
                                hashMap32.remove(str);
                                atomicBoolean2.set(true);
                                if (hashMap32.size() == 0) {
                                    c.e();
                                    return;
                                }
                                return;
                            default:
                                HashMap hashMap42 = c.f21801a;
                                hashMap42.remove(str);
                                atomicBoolean2.set(true);
                                if (hashMap42.size() == 0) {
                                    c.e();
                                    return;
                                }
                                return;
                        }
                    }
                });
                pVar3.a(new m() { // from class: o6.b
                    @Override // m
                    public final void onResult(Object obj) {
                        switch (i) {
                            case 0:
                                HashMap hashMap32 = c.f21801a;
                                hashMap32.remove(str);
                                atomicBoolean2.set(true);
                                if (hashMap32.size() == 0) {
                                    c.e();
                                    return;
                                }
                                return;
                            default:
                                HashMap hashMap42 = c.f21801a;
                                hashMap42.remove(str);
                                atomicBoolean2.set(true);
                                if (hashMap42.size() == 0) {
                                    c.e();
                                    return;
                                }
                                return;
                        }
                    }
                });
                if (!atomicBoolean2.get()) {
                    hashMap4.put(str, pVar3);
                    if (hashMap4.size() == 1) {
                        c.e();
                    }
                }
            }
            return pVar3;
        }
        a.o();
        return null;
    }

    public static final n c(o oVar, m mVar) {
        r rVar = (r) mVar;
        rVar.b0(-1248473602);
        r rVar2 = new r(3, null, 0);
        Context context = (Context) rVar.j(AndroidCompositionLocals_androidKt.f642b);
        rVar.b0(1388713922);
        Object O = rVar.O();
        v0 v0Var = l.f24285a;
        if (O == v0Var) {
            O = y.B(new n());
            rVar.k0(O);
        }
        a1 a1Var = (a1) O;
        rVar.p(false);
        rVar.b0(1388714213);
        boolean f10 = rVar.f("__LottieInternalDefaultCacheKey__");
        Object O2 = rVar.O();
        if (f10 || O2 == v0Var) {
            O2 = b(context, oVar, "__LottieInternalDefaultCacheKey__");
            rVar.k0(O2);
        }
        rVar.p(false);
        y.g(oVar, "__LottieInternalDefaultCacheKey__", new s(rVar2, context, oVar, a1Var, null), rVar);
        n nVar = (n) a1Var.getValue();
        rVar.p(false);
        return nVar;
    }
}
