package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public abstract class hn implements Cloneable, ho {

    /* renamed from: u, reason: collision with root package name */
    public final nn f14429u;

    /* renamed from: v, reason: collision with root package name */
    public nn f14430v;

    public hn(nn nnVar) {
        this.f14429u = nnVar;
        if (!nnVar.o()) {
            this.f14430v = nnVar.i();
        } else {
            q.x.n("Default instance must be immutable.");
            throw null;
        }
    }

    public static void d(int i, List list) {
        String i10 = g3.a.i("Element at index ", list.size() - i, " is null.");
        int size = list.size();
        while (true) {
            size--;
            if (size >= i) {
                list.remove(size);
            } else {
                throw new NullPointerException(i10);
            }
        }
    }

    public static void e(Object obj, Object obj2) {
        oo.f14756c.a(obj.getClass()).e(obj, obj2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ho
    public final boolean a() {
        return nn.s(this.f14430v, false);
    }

    public final void b() {
        if (!this.f14430v.o()) {
            c();
        }
    }

    public void c() {
        nn i = this.f14429u.i();
        e(i, this.f14430v);
        this.f14430v = i;
    }

    public final Object clone() {
        hn hnVar = (hn) this.f14429u.q(5, null);
        hnVar.f14430v = j();
        return hnVar;
    }

    public final hn f(km kmVar) {
        if (this.f14429u.getClass().isInstance(kmVar)) {
            h((nn) kmVar);
            return this;
        }
        q.x.n("mergeFrom(MessageLite) can only merge messages of the same type.");
        return null;
    }

    public final hn g(um umVar, bn bnVar) {
        if (!this.f14430v.o()) {
            c();
        }
        try {
            ro a10 = oo.f14756c.a(this.f14430v.getClass());
            nn nnVar = this.f14430v;
            androidx.datastore.preferences.protobuf.i iVar = (androidx.datastore.preferences.protobuf.i) umVar.f10247c;
            if (iVar == null) {
                iVar = new androidx.datastore.preferences.protobuf.i(umVar, (byte) 0);
            }
            a10.i(nnVar, iVar, bnVar);
            return this;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }

    public final void h(nn nnVar) {
        if (!this.f14429u.equals(nnVar)) {
            if (!this.f14430v.o()) {
                c();
            }
            e(this.f14430v, nnVar);
        }
    }

    public final nn i() {
        nn j10 = j();
        j10.getClass();
        if (nn.s(j10, true)) {
            return j10;
        }
        throw new xo();
    }

    public nn j() {
        boolean o10 = this.f14430v.o();
        nn nnVar = this.f14430v;
        if (!o10) {
            return nnVar;
        }
        nnVar.k();
        return this.f14430v;
    }

    public /* bridge */ km k() {
        return j();
    }
}
