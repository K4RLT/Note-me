package b8;
import l.a;
import o7.b;
import u7.m2;

import com.google.android.gms.internal.ads.nw0;
import com.google.android.gms.internal.ads.qw0;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class d0 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1957u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f1958v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f1959w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(int i, String str, te.c cVar) {
        super(2, cVar);
        this.f1957u = i;
        this.f1959w = str;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f1957u) {
            case 0:
                d0 d0Var = new d0(0, this.f1959w, cVar);
                d0Var.f1958v = obj;
                return d0Var;
            case 1:
                d0 d0Var2 = new d0(1, this.f1959w, cVar);
                d0Var2.f1958v = obj;
                return d0Var2;
            case 2:
                d0 d0Var3 = new d0(2, this.f1959w, cVar);
                d0Var3.f1958v = obj;
                return d0Var3;
            default:
                d0 d0Var4 = new d0(3, this.f1959w, cVar);
                d0Var4.f1958v = obj;
                return d0Var4;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1957u) {
            case 0:
                return ((d0) create((String) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((d0) create((qw0) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 2:
                return ((d0) create((m2) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            default:
                d0 d0Var = (d0) create((b4.b) obj, (te.c) obj2);
                pe.z zVar = pe.z.f22715a;
                d0Var.invokeSuspend(zVar);
                return zVar;
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f1957u;
        boolean z3 = true;
        String str = this.f1959w;
        switch (i) {
            case 0:
                String str2 = (String) this.f1958v;
                pe.a.e(obj);
                return Boolean.valueOf(!kotlin.jvm.internal.a(str2, str));
            case 1:
                pe.a.e(obj);
                nw0 nw0Var = (nw0) ((qw0) this.f1958v).r();
                Collections.unmodifiableMap(((qw0) nw0Var.f4845v).A()).getClass();
                str.getClass();
                nw0Var.b();
                ((qw0) nw0Var.f4845v).D().remove(str);
                return (qw0) nw0Var.c();
            case 2:
                m2 m2Var = (m2) this.f1958v;
                pe.a.e(obj);
                List list = m2Var.f26527a;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (kotlin.jvm.internal.a(((b) it.next()).f21848a, str)) {
                                z3 = false;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z3);
            default:
                pe.a.e(obj);
                b4.b bVar = (b4.b) this.f1958v;
                bVar.getClass();
                b4.e eVar = vd.x.f27645a;
                eVar.getClass();
                bVar.b(eVar, str);
                return pe.z.f22715a;
        }
    }
}
