package com.google.android.gms.internal.ads;
import g9.y1;

import android.content.Context;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class lq0 implements v60 {

    /* renamed from: u, reason: collision with root package name */
    public final HashSet f8105u = new HashSet();

    /* renamed from: v, reason: collision with root package name */
    public final Context f8106v;

    /* renamed from: w, reason: collision with root package name */
    public final sx f8107w;

    public lq0(Context context, sx sxVar) {
        this.f8106v = context;
        this.f8107w = sxVar;
    }

    public final synchronized void a(HashSet hashSet) {
        HashSet hashSet2 = this.f8105u;
        hashSet2.clear();
        hashSet2.addAll(hashSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle b() {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lq0.b():android.os.Bundle");
    }

    @Override // com.google.android.gms.internal.ads.v60
    public final synchronized void x(y1 y1Var) {
        if (y1Var.f17714u != 3) {
            sx sxVar = this.f8107w;
            HashSet hashSet = this.f8105u;
            synchronized (sxVar.f11183u) {
                sxVar.f11187y.addAll(hashSet);
            }
        }
    }
}
