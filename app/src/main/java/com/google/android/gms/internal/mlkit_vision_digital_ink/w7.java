package com.google.android.gms.internal.mlkit_vision_digital_ink;
import c4.t;

import com.google.android.gms.internal.ads.zb1;
import java.util.Calendar;
import java.util.Date;

/* loaded from: classes.dex */
public final class w7 extends zb1 {

    /* renamed from: w, reason: collision with root package name */
    public final v7 f15184w;

    public w7(o6 o6Var, int i, v7 v7Var) {
        super(o6Var, i);
        char c10;
        this.f15184w = v7Var;
        StringBuilder sb2 = new StringBuilder("%");
        o6Var.a(sb2);
        if (true != o6Var.c()) {
            c10 = 't';
        } else {
            c10 = 'T';
        }
        sb2.append(c10);
        sb2.append(v7Var.f15122u);
    }

    @Override // com.google.android.gms.internal.ads.zb1
    public final void h(c4.t tVar, Object obj) {
        char c10;
        o6 o6Var = (o6) this.f13135v;
        StringBuilder sb2 = (StringBuilder) tVar.f3863g;
        boolean z3 = obj instanceof Date;
        v7 v7Var = this.f15184w;
        if (!z3 && !(obj instanceof Calendar) && !(obj instanceof Long)) {
            c4.t.h(sb2, obj, "%t" + v7Var.f15122u);
            return;
        }
        StringBuilder sb3 = new StringBuilder("%");
        o6Var.a(sb3);
        if (true != o6Var.c()) {
            c10 = 't';
        } else {
            c10 = 'T';
        }
        sb3.append(c10);
        sb3.append(v7Var.f15122u);
        sb2.append(String.format(q6.f14844a, sb3.toString(), obj));
    }
}
