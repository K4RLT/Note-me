package f;
import g.b;

import android.content.Context;
import android.os.Bundle;
import android.view.Choreographer;
import androidx.lifecycle.o;
import androidx.lifecycle.u;
import androidx.lifecycle.w;
import c.m;
import java.util.LinkedHashMap;
import u7.d6;
import u7.i6;
import u7.m3;
import wa.da;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements u {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f16605u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f16606v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f16607w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f16608x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f16609y;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f16605u = i;
        this.f16606v = obj;
        this.f16607w = obj2;
        this.f16608x = obj3;
        this.f16609y = obj4;
    }

    @Override // androidx.lifecycle.u
    public final void k(w wVar, o oVar) {
        switch (this.f16605u) {
            case 0:
                m mVar = (m) this.f16606v;
                String str = (String) this.f16607w;
                b bVar = (b) this.f16608x;
                b bVar2 = (b) this.f16609y;
                if (o.ON_START == oVar) {
                    LinkedHashMap linkedHashMap = mVar.e;
                    Bundle bundle = mVar.f3259g;
                    LinkedHashMap linkedHashMap2 = mVar.f3258f;
                    linkedHashMap.put(str, new d(bVar, bVar2));
                    if (linkedHashMap2.containsKey(str)) {
                        Object obj = linkedHashMap2.get(str);
                        linkedHashMap2.remove(str);
                        bVar.a(obj);
                    }
                    a aVar = (a) da.a(bundle, str, a.class);
                    if (aVar != null) {
                        bundle.remove(str);
                        bVar.a(new a(aVar.f16604v, aVar.f16603u));
                        return;
                    }
                    return;
                }
                if (o.ON_STOP == oVar) {
                    mVar.e.remove(str);
                    return;
                } else {
                    if (o.ON_DESTROY == oVar) {
                        mVar.d(str);
                        return;
                    }
                    return;
                }
            default:
                d6 d6Var = (d6) this.f16606v;
                Choreographer choreographer = (Choreographer) this.f16607w;
                m3 m3Var = (m3) this.f16608x;
                Context context = (Context) this.f16609y;
                int i = i6.f26338a[oVar.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            m3Var.L0(context);
                            return;
                        }
                        return;
                    } else {
                        d6Var.f26092u = false;
                        choreographer.removeFrameCallback(d6Var);
                        return;
                    }
                }
                if (!d6Var.f26092u) {
                    d6Var.f26092u = true;
                    choreographer.postFrameCallback(d6Var);
                    return;
                }
                return;
        }
    }
}
