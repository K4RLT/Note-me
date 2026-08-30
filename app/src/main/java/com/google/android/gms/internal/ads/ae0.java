package com.google.android.gms.internal.ads;
import j6.s;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class ae0 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f4465u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ s f4466v;

    public /* synthetic */ ae0(s sVar, int i) {
        this.f4465u = i;
        this.f4466v = sVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f4465u) {
            case 0:
                s sVar = this.f4466v;
                ((be0) sVar.f18982w).f4770a.c((ConcurrentHashMap) sVar.f18981v);
                return;
            default:
                s sVar2 = this.f4466v;
                ((be0) sVar2.f18982w).f4770a.b((ConcurrentHashMap) sVar2.f18981v);
                return;
        }
    }
}
