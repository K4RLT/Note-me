package com.google.android.gms.internal.mlkit_vision_digital_ink;
import q1.b;
import ra.e;

import com.google.android.gms.internal.ads.x90;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class xs implements ea {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15244a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dt f15245b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y6 f15246c;

    public /* synthetic */ xs(dt dtVar, y6 y6Var) {
        this.f15245b = dtVar;
        this.f15246c = y6Var;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
    public final ya l(Object obj) {
        Object obj2;
        q2 q2Var;
        switch (this.f15244a) {
            case 0:
                dt dtVar = this.f15245b;
                y6 y6Var = this.f15246c;
                String str = y6Var.f15279a;
                lt ltVar = (lt) obj;
                int b10 = ltVar.b() - 1;
                if (b10 != 1) {
                    if (b10 != 2) {
                        q2 q2Var2 = y6Var.f15280b;
                        es t3 = fs.t();
                        t3.m(str);
                        t3.n(dtVar.f14213a.getPackageName());
                        fs fsVar = (fs) t3.i();
                        try {
                            if (q2Var2.c()) {
                                byte[] d2 = ((lm) q2Var2.a()).d();
                                bn bnVar = bn.f14099b;
                                oo ooVar = oo.f14756c;
                                vr v2 = vr.v(d2, bn.f14100c);
                                v2.getClass();
                                obj2 = new s2(v2);
                            } else {
                                obj2 = j2.f14494u;
                            }
                            int i = h8.f14398a;
                            i8 t10 = g8.f14365a.t();
                            t10.b(str);
                            String f8Var = t10.c().toString();
                            ht htVar = new ht(f8Var);
                            za zaVar = new za(new fa(2));
                            lx w10 = lx.w(zaVar);
                            int i10 = 4;
                            c1 c1Var = new c1(i10, dtVar, fsVar, obj2);
                            eb ebVar = dtVar.f14218g;
                            lx x9 = w10.y(c1Var, ebVar).y(new xs(dtVar, fsVar, y6Var), ebVar).x(new ys(i10), ebVar);
                            e eVar = dtVar.f14217f;
                            eVar.getClass();
                            cx.l("%s: submitting request to add in-progress download future with key: %s", f8Var);
                            int i11 = 0;
                            lx y10 = lx.w(((s5) eVar.f24675v).i(new e(24, eVar, f8Var, x9), (Executor) eVar.f24676w)).y(new bt(zaVar, x9, 0), ebVar);
                            lx y11 = y10.y(new r0(dtVar, 7, htVar), ebVar).y(new vs(y10, i11), ebVar);
                            y11.g(new ra(y11, i11, new pw(b(), 12, new x90(13, dtVar, htVar, false))), ebVar);
                            return y11;
                        } catch (xn e) {
                            return n5.l(e);
                        }
                    }
                    return n5.m(ltVar.a());
                }
                return ltVar.c();
            default:
                dt dtVar2 = this.f15245b;
                y6 y6Var2 = this.f15246c;
                tr trVar = (tr) obj;
                if (trVar != null) {
                    String S = trVar.S();
                    S.getClass();
                    q2Var = new s2(S);
                } else {
                    q2Var = j2.f14494u;
                }
                return dt.c(trVar, q2Var, null, b.DOWNLOADED, y6Var2.f15281c, dtVar2.f14214b, dtVar2.f14218g, dtVar2.f14215c);
        }
    }

    public /* synthetic */ xs(dt dtVar, fs fsVar, y6 y6Var) {
        this.f15245b = dtVar;
        this.f15246c = y6Var;
    }
}
