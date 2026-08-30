package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class v2 implements Iterator {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    /* renamed from: u, reason: collision with root package name */
    public String f15108u;

    /* renamed from: w, reason: collision with root package name */
    public final CharSequence f15110w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f15111x;

    /* renamed from: v, reason: collision with root package name */
    public int f15109v = 2;

    /* renamed from: y, reason: collision with root package name */
    public int f15112y = 0;

    /* renamed from: z, reason: collision with root package name */
    public int f15113z = Integer.MAX_VALUE;

    public v2(w2 w2Var, CharSequence charSequence, Object obj, int i) {
        this.A = i;
        this.B = obj;
        this.f15111x = w2Var.f15169b;
        this.f15110w = charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        r2 = r2 + 1;
     */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean hasNext() {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.v2.hasNext():boolean");
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f15109v = 2;
            String str = this.f15108u;
            this.f15108u = null;
            return str;
        }
        l4.a.c();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
