package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class g0 implements Iterator {

    /* renamed from: u, reason: collision with root package name */
    public String f13409u;

    /* renamed from: w, reason: collision with root package name */
    public final String f13411w;

    /* renamed from: v, reason: collision with root package name */
    public int f13410v = 2;

    /* renamed from: x, reason: collision with root package name */
    public int f13412x = 0;

    /* renamed from: y, reason: collision with root package name */
    public int f13413y = Integer.MAX_VALUE;

    public g0(String str) {
        this.f13411w = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i10 = this.f13410v;
        if (i10 != 4) {
            int i11 = i10 - 1;
            String str = null;
            if (i10 != 0) {
                if (i11 == 0) {
                    return true;
                }
                if (i11 != 2) {
                    this.f13410v = 4;
                    int i12 = this.f13412x;
                    while (true) {
                        int i13 = this.f13412x;
                        if (i13 != -1) {
                            String str2 = this.f13411w;
                            int length = str2.length();
                            f0.d(i13, length);
                            while (true) {
                                if (i13 < length) {
                                    if (str2.charAt(i13) == ',') {
                                        break;
                                    }
                                    i13++;
                                } else {
                                    i13 = -1;
                                    break;
                                }
                            }
                            if (i13 == -1) {
                                i13 = str2.length();
                                this.f13412x = -1;
                                i = -1;
                            } else {
                                i = i13 + 1;
                                this.f13412x = i;
                            }
                            if (i == i12) {
                                int i14 = i + 1;
                                this.f13412x = i14;
                                if (i14 > str2.length()) {
                                    this.f13412x = -1;
                                }
                            } else {
                                if (i12 < i13) {
                                    str2.charAt(i12);
                                }
                                if (i12 < i13) {
                                    str2.charAt(i13 - 1);
                                }
                                int i15 = this.f13413y;
                                if (i15 == 1) {
                                    i13 = str2.length();
                                    this.f13412x = -1;
                                    if (i13 > i12) {
                                        str2.charAt(i13 - 1);
                                    }
                                } else {
                                    this.f13413y = i15 - 1;
                                }
                                str = str2.subSequence(i12, i13).toString();
                            }
                        } else {
                            this.f13410v = 3;
                            break;
                        }
                    }
                    this.f13409u = str;
                    if (this.f13410v != 3) {
                        this.f13410v = 1;
                        return true;
                    }
                }
                return false;
            }
            throw null;
        }
        g5.q.l();
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f13410v = 2;
            String str = this.f13409u;
            this.f13409u = null;
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
