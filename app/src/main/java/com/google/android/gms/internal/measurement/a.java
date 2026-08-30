package com.google.android.gms.internal.measurement;
import j6.c;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13620a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ v f13621b;

    public /* synthetic */ a(int i) {
        this.f13620a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f13620a) {
            case 0:
                c cVar = this.f13621b.f13944d;
                l5 l5Var = new l5("internal.registerCallback");
                l5Var.f13835x = cVar;
                return l5Var;
            default:
                return new l5(this.f13621b.f13943c);
        }
    }
}
