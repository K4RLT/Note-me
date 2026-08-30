package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ll implements jl {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14603a;

    public ll(Context context, il ilVar) {
        ArrayList arrayList = new ArrayList();
        this.f14603a = arrayList;
        arrayList.add(new pl(context, ilVar));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.jl
    public final void a(s5 s5Var) {
        ArrayList arrayList = this.f14603a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((jl) obj).a(s5Var);
        }
    }
}
