package c2;
import n0.f;
import r0.c0;
import r0.y;
import z0.g;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: v, reason: collision with root package name */
    public static final p f3592v;

    /* renamed from: w, reason: collision with root package name */
    public static final p f3593w;

    /* renamed from: x, reason: collision with root package name */
    public static final p f3594x;

    /* renamed from: y, reason: collision with root package name */
    public static final p f3595y;

    /* renamed from: z, reason: collision with root package name */
    public static final p f3596z;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3597u;

    static {
        int i = 1;
        f3592v = new p(i, 0);
        f3593w = new p(i, 1);
        f3594x = new p(i, 2);
        f3595y = new p(i, 3);
        f3596z = new p(i, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i, int i10) {
        super(i);
        this.f3597u = i10;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f3597u) {
            case 0:
                return pe.z.f22715a;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case 3:
                g gVar = (g) obj;
                c0 c0Var = AndroidCompositionLocals_androidKt.f641a;
                gVar.getClass();
                y.E(gVar, c0Var);
                return ((Context) y.E(gVar, AndroidCompositionLocals_androidKt.f642b)).getResources();
            default:
                return Boolean.valueOf(f(obj));
        }
    }
}
