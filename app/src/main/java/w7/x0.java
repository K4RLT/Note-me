package w7;
import cb.a;
import r0.a1;
import r0.m;
import r0.y;

import android.content.Context;

/* loaded from: classes.dex */
public final /* synthetic */ class x0 implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f29413u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u7.m3 f29414v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f29415w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f29416x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f29417y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f29418z;

    public /* synthetic */ x0(u7.m3 m3Var, int i, int i10, kotlin.jvm.internal.y yVar, a1 a1Var) {
        this.f29413u = 0;
        this.f29414v = m3Var;
        this.f29415w = i;
        this.f29416x = i10;
        this.f29417y = yVar;
        this.f29418z = a1Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29413u) {
            case 0:
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) this.f29417y;
                a1 a1Var = (a1) this.f29418z;
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                if (kotlin.jvm.internal.l.a((String) a1Var.getValue(), str)) {
                    this.f29414v.t(this.f29415w, this.f29416x, (Context) yVar.f19787u, str);
                    a1Var.setValue(str2);
                }
                return pe.z.f22715a;
            case 1:
                ((Integer) obj2).getClass();
                int L = y.L(1);
                n4.I0((u7.c) this.f29417y, this.f29414v, this.f29415w, this.f29416x, (df.a) this.f29418z, (m) obj, L);
                return pe.z.f22715a;
            default:
                ((Integer) obj2).getClass();
                int L2 = y.L(1);
                a((u7.d) this.f29417y, this.f29414v, this.f29415w, this.f29416x, (df.a) this.f29418z, (m) obj, L2);
                return pe.z.f22715a;
        }
    }

    public /* synthetic */ x0(Object obj, u7.m3 m3Var, int i, int i10, df.a aVar, int i11, int i12) {
        this.f29413u = i12;
        this.f29417y = obj;
        this.f29414v = m3Var;
        this.f29415w = i;
        this.f29416x = i10;
        this.f29418z = aVar;
    }
}
