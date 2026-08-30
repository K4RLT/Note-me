package o5;

import androidx.lifecycle.o;
import androidx.lifecycle.u;
import androidx.lifecycle.w;
import b1.y;
import p7.e0;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements u {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f21775u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f21776v;

    public /* synthetic */ a(int i, Object obj) {
        this.f21775u = i;
        this.f21776v = obj;
    }

    @Override // androidx.lifecycle.u
    public final void k(w wVar, o oVar) {
        switch (this.f21775u) {
            case 0:
                b bVar = (b) this.f21776v;
                if (oVar == o.ON_START) {
                    bVar.f21779c = true;
                    return;
                } else {
                    if (oVar == o.ON_STOP) {
                        bVar.f21779c = false;
                        return;
                    }
                    return;
                }
            case 1:
                e0 e0Var = (e0) this.f21776v;
                if (oVar == o.ON_PAUSE) {
                    e0Var.b();
                    return;
                }
                return;
            default:
                y yVar = (y) this.f21776v;
                if (oVar == o.ON_STOP) {
                    yVar.clear();
                    return;
                }
                return;
        }
    }
}
