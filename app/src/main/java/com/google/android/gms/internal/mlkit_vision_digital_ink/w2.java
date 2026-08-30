package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class w2 {

    /* renamed from: a, reason: collision with root package name */
    public final n5 f15168a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15169b;

    /* renamed from: c, reason: collision with root package name */
    public final s5 f15170c;

    public w2(s5 s5Var, boolean z3, n5 n5Var) {
        this.f15170c = s5Var;
        this.f15169b = z3;
        this.f15168a = n5Var;
    }

    public static w2 a(String str) {
        boolean z3;
        if (str.length() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if (str.length() == 1) {
                return new w2(new s5(8, new k2(str.charAt(0))));
            }
            return new w2(new s5(7, str));
        }
        q.x.n("The separator may not be the empty string.");
        return null;
    }

    public final List b(CharSequence charSequence) {
        charSequence.getClass();
        Iterator h3 = this.f15170c.h(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            v2 v2Var = (v2) h3;
            if (v2Var.hasNext()) {
                arrayList.add((String) v2Var.next());
            } else {
                return Collections.unmodifiableList(arrayList);
            }
        }
    }

    public w2(s5 s5Var) {
        this(s5Var, false, l2.f14590d);
    }
}
