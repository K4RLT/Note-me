package com.google.android.gms.internal.measurement;
import l4.a;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class r implements Iterator {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f13894u;

    /* renamed from: v, reason: collision with root package name */
    public int f13895v = 0;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f13896w;

    public /* synthetic */ r(p pVar, int i) {
        this.f13894u = i;
        this.f13896w = pVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f13894u) {
            case 0:
                if (this.f13895v < this.f13896w.f13877u.length()) {
                    return true;
                }
                return false;
            default:
                if (this.f13895v < this.f13896w.f13877u.length()) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.f13894u) {
            case 0:
                int i = this.f13895v;
                String str = this.f13896w.f13877u;
                if (i < str.length()) {
                    int i10 = this.f13895v;
                    this.f13895v = i10 + 1;
                    return new p(String.valueOf(str.charAt(i10)));
                }
                a.c();
                return null;
            default:
                if (this.f13895v < this.f13896w.f13877u.length()) {
                    int i11 = this.f13895v;
                    this.f13895v = i11 + 1;
                    return new p(String.valueOf(i11));
                }
                a.c();
                return null;
        }
    }
}
