package b8;
import j.s;
import b2.f1;
import d.a;
import j1.b;
import r0.m;
import r0.y;
import u7.m3;
import v1.h0;
import v1.t;
import v1.w;
import x7.j;
import z0.c;

import android.content.Context;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class z7 implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3091u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f3092v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f3093w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f3094x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f3095y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f3096z;

    public /* synthetic */ z7(String str, String str2, df.l lVar, String str3, int i, int i10) {
        this.f3091u = 0;
        this.f3093w = str;
        this.f3094x = str2;
        this.f3096z = lVar;
        this.f3095y = str3;
        this.f3092v = i10;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        String str;
        switch (this.f3091u) {
            case 0:
                String str2 = (String) this.f3093w;
                String str3 = (String) this.f3094x;
                df.l lVar = (df.l) this.f3096z;
                String str4 = (String) this.f3095y;
                int i = this.f3092v;
                ((Integer) obj2).getClass();
                z9.n(str2, str3, lVar, str4, (m) obj, y.L(385), i);
                return pe.z.f22715a;
            case 1:
                kotlin.jvm.internal.u uVar = (kotlin.jvm.internal.u) this.f3093w;
                m3 m3Var = (m3) this.f3094x;
                int i10 = this.f3092v;
                Context context = (Context) this.f3095y;
                w wVar = (w) this.f3096z;
                t tVar = (t) obj;
                b bVar = (b) obj2;
                tVar.getClass();
                if (uVar.f19783u) {
                    tVar.a();
                    v7.d d02 = m3Var.d0(context, i10);
                    if (d02.f27409d) {
                        float f10 = m3Var.f26550x.f26949d * ((int) (((h0) wVar).S & 4294967295L));
                        if (f10 > 1.0f) {
                            float d2 = wa.b9.d(d02.f27412h + (Float.intBitsToFloat((int) (bVar.f18762a & 4294967295L)) / f10), 0.07f, 0.93f);
                            b bVar2 = (b) qe.l.y(i10, m3Var.f26547u);
                            if (bVar2 != null && (str = bVar2.f21848a) != null) {
                                f1 f1Var = m3Var.f26541o;
                                f1Var.getClass();
                                ((ConcurrentHashMap) f1Var.f1458x).put(str, v7.a(f1Var.m(context, str), null, false, 0, false, null, null, 0, d2, 0.0f, 0.0f, 0.0f, null, 0, null, 32639));
                                f1Var.f(str);
                            }
                        }
                    }
                }
                return pe.z.f22715a;
            case 2:
                String str5 = (String) this.f3093w;
                String str6 = (String) this.f3094x;
                String str7 = (String) this.f3095y;
                df.a aVar = (df.a) this.f3096z;
                int i11 = this.f3092v;
                ((Integer) obj2).getClass();
                j.s(str5, str6, str7, aVar, (m) obj, y.L(i11 | 1));
                return pe.z.f22715a;
            default:
                c cVar = (c) this.f3093w;
                Object obj3 = this.f3094x;
                Number number = (Number) this.f3095y;
                Number number2 = (Number) this.f3096z;
                int i12 = this.f3092v;
                ((Integer) obj2).getClass();
                cVar.h(obj3, number, number2, (m) obj, y.L(i12) | 1);
                return pe.z.f22715a;
        }
    }

    public /* synthetic */ z7(Object obj, Object obj2, Serializable serializable, Object obj3, int i, int i10) {
        this.f3091u = i10;
        this.f3093w = obj;
        this.f3094x = obj2;
        this.f3095y = serializable;
        this.f3096z = obj3;
        this.f3092v = i;
    }

    public /* synthetic */ z7(kotlin.jvm.internal.u uVar, m3 m3Var, int i, Context context, w wVar) {
        this.f3091u = 1;
        this.f3093w = uVar;
        this.f3094x = m3Var;
        this.f3092v = i;
        this.f3095y = context;
        this.f3096z = wVar;
    }
}
