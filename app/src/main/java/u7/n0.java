package u7;
import t1.e;
import a1.g;
import b8.z7;
import r0.a1;
import t.f0;
import t.t1;
import v1.w;

import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* loaded from: classes.dex */
public final class n0 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26586a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f26587b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m3 f26588c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f26589d;
    public final /* synthetic */ Context e;

    public /* synthetic */ n0(int i, int i10, Context context, a1 a1Var, m3 m3Var) {
        this.f26586a = i10;
        this.f26587b = a1Var;
        this.f26588c = m3Var;
        this.f26589d = i;
        this.e = context;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.internal.u, java.lang.Object] */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w wVar, te.c cVar) {
        switch (this.f26586a) {
            case 0:
                if (u0.c(this.f26587b)) {
                    Object obj = new Object();
                    m3 m3Var = this.f26588c;
                    g gVar = new g(13, m3Var, obj, wVar);
                    int i = this.f26589d;
                    Context context = this.e;
                    Object g8 = f0.g(wVar, gVar, new p(obj, m3Var, i, context), new z7(obj, m3Var, i, context, wVar), cVar, 4);
                    if (g8 == ue.a.f27192u) {
                        return g8;
                    }
                }
                return pe.z.f22715a;
            default:
                if (u0.e(this.f26587b)) {
                    Object e = t1.e(wVar, new o0(this.f26589d, this.e, null, this.f26588c), cVar);
                    if (e == ue.a.f27192u) {
                        return e;
                    }
                }
                return pe.z.f22715a;
        }
    }
}