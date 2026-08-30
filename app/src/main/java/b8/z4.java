package b8;
import m5.b;
import r0.m;
import r0.y;
import z7.d;
import z7.f;

import java.io.File;

/* loaded from: classes.dex */
public final /* synthetic */ class z4 implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3069u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f3070v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ df.l f3071w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ df.a f3072x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f3073y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f3074z;

    public /* synthetic */ z4(File file, boolean z3, df.l lVar, df.l lVar2, df.a aVar, int i) {
        this.f3073y = file;
        this.f3070v = z3;
        this.f3071w = lVar;
        this.f3074z = lVar2;
        this.f3072x = aVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3069u) {
            case 0:
                ((Integer) obj2).getClass();
                int L = y.L(24961);
                b((File) this.f3073y, this.f3070v, this.f3071w, (df.l) this.f3074z, this.f3072x, (m) obj, L);
                break;
            default:
                ((Integer) obj2).getClass();
                int L2 = y.L(24577);
                d.c(this.f3070v, (f) this.f3073y, (String) this.f3074z, this.f3071w, this.f3072x, (m) obj, L2);
                break;
        }
        return pe.z.f22715a;
    }

    public /* synthetic */ z4(boolean z3, f fVar, String str, df.l lVar, df.a aVar, int i) {
        this.f3070v = z3;
        this.f3073y = fVar;
        this.f3074z = str;
        this.f3071w = lVar;
        this.f3072x = aVar;
    }
}
