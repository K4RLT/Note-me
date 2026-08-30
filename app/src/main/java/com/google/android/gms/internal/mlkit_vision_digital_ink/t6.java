package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class t6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15003a;

    public /* synthetic */ t6(int i) {
        this.f15003a = i;
    }

    public final void a(d6 d6Var, Iterator it, p6 p6Var) {
        switch (this.f15003a) {
            case 0:
                return;
            default:
                if (d6Var.f14186c) {
                    if (d6Var.f14187d && ((c8) c8.f14151v.get()).f14152u > 20) {
                        while (it.hasNext()) {
                            p6Var.a(it.next(), d6Var.f14184a);
                        }
                        return;
                    }
                    d6Var.a(it, p6Var);
                    return;
                }
                q.x.o("non repeating key");
                return;
        }
    }

    private final void b(d6 d6Var, Iterator it, p6 p6Var) {
    }
}
