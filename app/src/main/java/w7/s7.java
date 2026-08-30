package w7;
import p.a;
import r0.a1;
import y8.b;
import z1.x;

import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class s7 implements df.q {
    public final /* synthetic */ a1 A;
    public final /* synthetic */ e3 B;
    public final /* synthetic */ a1 C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f29067u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ x f29068v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u7.m3 f29069w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f29070x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f29071y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ a1 f29072z;

    public /* synthetic */ s7(x xVar, pf.z zVar, u7.m3 m3Var, int i, int i10, Context context, e3 e3Var, a1 a1Var, a1 a1Var2, a1 a1Var3) {
        this.f29068v = xVar;
        this.D = zVar;
        this.f29069w = m3Var;
        this.f29070x = i;
        this.f29071y = i10;
        this.E = context;
        this.B = e3Var;
        this.f29072z = a1Var;
        this.A = a1Var2;
        this.C = a1Var3;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.jvm.internal.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.internal.v, java.lang.Object] */
    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        float f10;
        float f11;
        int i = this.f29067u;
        pe.z zVar = pe.z.f22715a;
        float f12 = 0.0f;
        Object obj4 = this.E;
        Object obj5 = this.D;
        x xVar = this.f29068v;
        switch (i) {
            case 0:
                pf.z zVar2 = (pf.z) obj5;
                Context context = (Context) obj4;
                ma maVar = (ma) obj;
                Float f13 = (Float) obj2;
                Float f14 = (Float) obj3;
                maVar.getClass();
                Object obj6 = new Object();
                obj6.f19784u = 0.5f;
                Object obj7 = new Object();
                obj7.f19784u = 0.5f;
                if (f13 != null && f14 != null && xVar != null) {
                    float floatValue = f13.floatValue();
                    float floatValue2 = f14.floatValue();
                    long E = xVar.E((Float.floatToRawIntBits(floatValue2) & 4294967295L) | (Float.floatToRawIntBits(floatValue) << 32));
                    obj6.f19784u = wa.b9.d(Float.intBitsToFloat((int) (E >> 32)) / ((int) (xVar.k() >> 32)), 0.0f, 1.0f);
                    obj7.f19784u = wa.b9.d(Float.intBitsToFloat((int) (E & 4294967295L)) / ((int) (xVar.k() & 4294967295L)), 0.0f, 1.0f);
                }
                pf.b0.x(zVar2, null, new v7(this.f29069w, this.f29070x, this.f29071y, obj6, obj7, maVar, context, this.B, this.f29072z, this.A, this.C, null), 3);
                return zVar;
            default:
                a1 a1Var = (a1) obj5;
                a1 a1Var2 = (a1) obj4;
                String str = (String) obj;
                Float f15 = (Float) obj2;
                Float f16 = (Float) obj3;
                str.getClass();
                this.f29072z.setValue(Boolean.FALSE);
                this.A.setValue(null);
                if (f15 != null && f16 != null && xVar != null) {
                    float floatValue3 = f15.floatValue();
                    float floatValue4 = f16.floatValue();
                    long E2 = xVar.E((Float.floatToRawIntBits(floatValue4) & 4294967295L) | (Float.floatToRawIntBits(floatValue3) << 32));
                    float d2 = wa.b9.d(Float.intBitsToFloat((int) (E2 >> 32)) / ((int) (xVar.k() >> 32)), 0.0f, 1.0f);
                    f11 = wa.b9.d(Float.intBitsToFloat((int) (E2 & 4294967295L)) / ((int) (xVar.k() & 4294967295L)), 0.0f, 1.0f);
                    f10 = d2;
                } else {
                    f10 = 0.5f;
                    f11 = 0.5f;
                }
                List list = y8.f29503a;
                pe.j b10 = b(str);
                float floatValue5 = ((Number) b10.f22693u).floatValue();
                float floatValue6 = ((Number) b10.f22694v).floatValue();
                String i10 = a.i();
                if (str.equals("rect")) {
                    f12 = 0.06f;
                }
                this.f29069w.o(this.f29070x, this.f29071y, new u7.c(i10, str, -11245448, null, 0.0f, f12, floatValue5, floatValue6, f10, f11, 0.0f));
                this.B.w(true);
                this.C.setValue(null);
                a1Var.setValue(null);
                a1Var2.setValue(i10);
                return zVar;
        }
    }

    public /* synthetic */ s7(x xVar, u7.m3 m3Var, int i, int i10, a1 a1Var, a1 a1Var2, e3 e3Var, a1 a1Var3, a1 a1Var4, a1 a1Var5) {
        this.f29068v = xVar;
        this.f29069w = m3Var;
        this.f29070x = i;
        this.f29071y = i10;
        this.f29072z = a1Var;
        this.A = a1Var2;
        this.B = e3Var;
        this.C = a1Var3;
        this.D = a1Var4;
        this.E = a1Var5;
    }
}