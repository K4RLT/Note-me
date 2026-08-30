package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class pd1 implements Iterable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f9504u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f9505v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f9506w;

    public pd1(com.google.android.gms.internal.mlkit_vision_digital_ink.z4 z4Var, com.google.android.gms.internal.mlkit_vision_digital_ink.rl rlVar) {
        this.f9505v = z4Var;
        this.f9506w = rlVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f9504u) {
            case 0:
                return new qd1(((List) this.f9505v).iterator(), ((List) this.f9506w).iterator(), 0);
            case 1:
                com.google.android.gms.internal.mlkit_vision_digital_ink.w2 w2Var = (com.google.android.gms.internal.mlkit_vision_digital_ink.w2) this.f9506w;
                return w2Var.f15170c.h(w2Var, (String) this.f9505v);
            default:
                return new com.google.android.gms.internal.mlkit_vision_digital_ink.o4(((com.google.android.gms.internal.mlkit_vision_digital_ink.h4) ((Iterable) this.f9505v)).listIterator(0), (com.google.android.gms.internal.mlkit_vision_digital_ink.rl) this.f9506w);
        }
    }

    public String toString() {
        switch (this.f9504u) {
            case 1:
                StringBuilder sb2 = new StringBuilder();
                sb2.append('[');
                com.google.android.gms.internal.mlkit_vision_digital_ink.f7.i(sb2, iterator(), ", ");
                sb2.append(']');
                return sb2.toString();
            case 2:
                Iterator it = iterator();
                StringBuilder sb3 = new StringBuilder("[");
                boolean z3 = true;
                while (it.hasNext()) {
                    if (!z3) {
                        sb3.append(", ");
                    }
                    sb3.append(it.next());
                    z3 = false;
                }
                sb3.append(']');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public pd1(rd1 rd1Var, List list, List list2) {
        this.f9505v = list;
        this.f9506w = list2;
    }

    public pd1(com.google.android.gms.internal.mlkit_vision_digital_ink.w2 w2Var, String str) {
        this.f9505v = str;
        this.f9506w = w2Var;
    }
}
