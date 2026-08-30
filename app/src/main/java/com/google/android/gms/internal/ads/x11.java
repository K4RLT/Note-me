package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class x11 {

    /* renamed from: a, reason: collision with root package name */
    public final Set f12424a;

    /* renamed from: b, reason: collision with root package name */
    public final c21 f12425b;

    public x11(c21 c21Var, Set set) {
        this.f12424a = set;
        this.f12425b = c21Var;
    }

    public final HashMap a() {
        HashMap hashMap = new HashMap();
        Iterator it = this.f12424a.iterator();
        while (it.hasNext()) {
            ((y11) it.next()).b(hashMap);
        }
        return hashMap;
    }

    public final HashMap b(Context context, View view) {
        HashMap hashMap = new HashMap();
        Iterator it = this.f12424a.iterator();
        while (it.hasNext()) {
            ((y11) it.next()).c(hashMap, context, view);
        }
        return hashMap;
    }

    public final HashMap c() {
        HashMap hashMap = new HashMap();
        Iterator it = this.f12424a.iterator();
        while (it.hasNext()) {
            ((y11) it.next()).a(hashMap);
        }
        return hashMap;
    }
}
