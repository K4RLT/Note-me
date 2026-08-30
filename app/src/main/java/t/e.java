package t;
import j1.b;
import r0.y;
import v1.t;
import z0.g;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import r0.o2;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.m implements df.l {
    public static final e A;
    public static final e B;

    /* renamed from: v, reason: collision with root package name */
    public static final e f25369v;

    /* renamed from: w, reason: collision with root package name */
    public static final e f25370w;

    /* renamed from: x, reason: collision with root package name */
    public static final e f25371x;

    /* renamed from: y, reason: collision with root package name */
    public static final e f25372y;

    /* renamed from: z, reason: collision with root package name */
    public static final e f25373z;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f25374u;

    static {
        int i = 1;
        f25369v = new e(i, 0);
        f25370w = new e(i, 1);
        f25371x = new e(i, 2);
        f25372y = new e(i, 3);
        f25373z = new e(i, 4);
        A = new e(i, 5);
        B = new e(i, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, int i10) {
        super(i);
        this.f25374u = i10;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        boolean z3;
        switch (this.f25374u) {
            case 0:
                g gVar = (g) obj;
                o2 o2Var = AndroidCompositionLocals_androidKt.f642b;
                gVar.getClass();
                if (!((Context) y.E(gVar, o2Var)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    d.f25356a.getClass();
                    return c.f25343c;
                }
                return g.f25393b;
            case 1:
                long j10 = ((b) obj).f18762a;
                return pe.z.f22715a;
            case 2:
                long j11 = ((b) obj).f18762a;
                return pe.z.f22715a;
            case 3:
                long j12 = ((b) obj).f18762a;
                return pe.z.f22715a;
            case 4:
                ((Number) obj).longValue();
                return pe.z.f22715a;
            case 5:
                if (((t) obj).i == 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(!z3);
            default:
                ((Number) obj).floatValue();
                return pe.z.f22715a;
        }
    }
}
