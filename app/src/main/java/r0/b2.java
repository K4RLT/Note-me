package r0;
import l.a;
import n.w;
import n1.a;
import q.x;
import s.c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b2 implements Iterable, ef.a {
    public boolean A;
    public int B;
    public HashMap D;
    public w E;

    /* renamed from: v, reason: collision with root package name */
    public int f24192v;

    /* renamed from: x, reason: collision with root package name */
    public int f24194x;

    /* renamed from: y, reason: collision with root package name */
    public int f24195y;

    /* renamed from: u, reason: collision with root package name */
    public int[] f24191u = new int[0];

    /* renamed from: w, reason: collision with root package name */
    public Object[] f24193w = new Object[0];

    /* renamed from: z, reason: collision with root package name */
    public final Object f24196z = new Object();
    public ArrayList C = new ArrayList();

    public final int a(a aVar) {
        if (this.A) {
            c("Use active SlotWriter to determine anchor location instead");
        }
        if (!aVar.a()) {
            a("Anchor refers to a group that was removed");
        }
        return aVar.f24176a;
    }

    public final void b() {
        this.D = new HashMap();
    }

    public final a2 g() {
        if (!this.A) {
            this.f24195y++;
            return new a2(this);
        }
        x.o("Cannot read while a writer is pending");
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new n0(this, 0, this.f24192v);
    }

    public final e2 k() {
        if (this.A) {
            c("Cannot start a writer when another writer is pending");
        }
        if (this.f24195y > 0) {
            c("Cannot start a writer when a reader is pending");
        }
        this.A = true;
        this.B++;
        return new e2(this);
    }

    public final boolean n(a aVar) {
        int d2;
        if (aVar.a() && (d2 = d2.d(this.C, aVar.f24176a, this.f24192v)) >= 0 && kotlin.jvm.internal.a(this.C.get(d2), aVar)) {
            return true;
        }
        return false;
    }

    public final o0 o(int i) {
        a aVar;
        int i10;
        ArrayList arrayList;
        int d2;
        HashMap hashMap = this.D;
        if (hashMap != null) {
            if (this.A) {
                c("use active SlotWriter to crate an anchor for location instead");
            }
            if (i >= 0 && i < (i10 = this.f24192v) && (d2 = d2.d((arrayList = this.C), i, i10)) >= 0) {
                aVar = (a) arrayList.get(d2);
            } else {
                aVar = null;
            }
            if (aVar != null) {
                return (o0) hashMap.get(aVar);
            }
        }
        return null;
    }
}
