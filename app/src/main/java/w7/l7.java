package w7;
import a1.g;
import r0.a1;
import r0.e1;
import v1.w;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l7 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f28640a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f28641b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e1 f28642c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u7.m3 f28643d;
    public final /* synthetic */ int e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f28644f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a1 f28645g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ArrayList f28646h;
    public final /* synthetic */ float i;

    public l7(String str, a1 a1Var, e1 e1Var, u7.m3 m3Var, int i, int i10, a1 a1Var2, ArrayList arrayList, float f10) {
        this.f28640a = str;
        this.f28641b = a1Var;
        this.f28642c = e1Var;
        this.f28643d = m3Var;
        this.e = i;
        this.f28644f = i10;
        this.f28645g = a1Var2;
        this.f28646h = arrayList;
        this.i = f10;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w wVar, te.c cVar) {
        String str = this.f28640a;
        a1 a1Var = this.f28641b;
        e1 e1Var = this.f28642c;
        g gVar = new g(20, str, a1Var, e1Var);
        int i = this.e;
        int i10 = this.f28644f;
        a1 a1Var2 = this.f28645g;
        Object h3 = t.f0.h(wVar, gVar, new i0(i, i10, 1, a1Var2, a1Var, e1Var, this.f28643d), new androidx.ink.brush.e(this.f28646h, a1Var, e1Var, a1Var2, 4), new b8.t5(str, this.i, e1Var, a1Var2), cVar);
        if (h3 == ue.a.f27192u) {
            return h3;
        }
        return pe.z.f22715a;
    }
}
