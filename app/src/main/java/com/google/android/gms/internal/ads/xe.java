package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class xe implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12554a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12555b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12556c;

    public /* synthetic */ xe(com.google.android.gms.internal.mlkit_vision_digital_ink.w9 w9Var, com.google.android.gms.internal.mlkit_vision_digital_ink.or orVar) {
        this.f12554a = 15;
        com.google.android.gms.internal.mlkit_vision_digital_ink.va vaVar = com.google.android.gms.internal.mlkit_vision_digital_ink.va.f15125v;
        this.f12555b = w9Var;
        this.f12556c = orVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:282:0x0665 A[Catch: InterruptedException | ExecutionException -> 0x06d4, TRY_ENTER, TRY_LEAVE, TryCatch #14 {InterruptedException | ExecutionException -> 0x06d4, blocks: (B:282:0x0665, B:283:0x06c7, B:283:0x06c7, B:294:0x06c3, B:294:0x06c3), top: B:280:0x0663 }] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x066a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object call() {
        /*
            Method dump skipped, instructions count: 1824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xe.call():java.lang.Object");
    }

    public String toString() {
        switch (this.f12554a) {
            case 14:
                return "propagating=[" + ((Callable) this.f12556c) + "]";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ xe(int i, Object obj, Object obj2, boolean z3) {
        this.f12554a = i;
        this.f12555b = obj2;
        this.f12556c = obj;
    }

    public /* synthetic */ xe(Object obj, int i, Object obj2) {
        this.f12554a = i;
        this.f12555b = obj;
        this.f12556c = obj2;
    }

    public xe(lx0 lx0Var, Context context) {
        this.f12554a = 2;
        this.f12556c = context;
        Objects.requireNonNull(lx0Var);
        this.f12555b = lx0Var;
    }
}
