package com.google.android.gms.internal.ads;
import f9.k;

import java.util.LinkedList;

/* loaded from: classes.dex */
public final class nq0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f8821b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8822c;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f8820a = new LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public final br0 f8823d = new br0();

    public nq0(int i, int i10) {
        this.f8821b = i;
        this.f8822c = i10;
    }

    public final void a() {
        while (true) {
            LinkedList linkedList = this.f8820a;
            if (!linkedList.isEmpty()) {
                rq0 rq0Var = (rq0) linkedList.getFirst();
                k.C.f16819k.getClass();
                if (System.currentTimeMillis() - rq0Var.f10275d >= this.f8822c) {
                    br0 br0Var = this.f8823d;
                    br0Var.f4873f++;
                    br0Var.f4870b.f4605v++;
                    linkedList.remove();
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
