package com.google.android.filament;

import y2.m;

/* loaded from: classes.dex */
public final class g implements x.d, x.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4246a;

    /* renamed from: b, reason: collision with root package name */
    public float f4247b;

    public g(int i) {
        this.f4246a = i;
        switch (i) {
            case 1:
                this.f4247b = 0;
                return;
            case 2:
                this.f4247b = 0;
                return;
            case 3:
                this.f4247b = 0;
                return;
            case 4:
                this.f4247b = 0;
                return;
            default:
                return;
        }
    }

    @Override // x.d, x.f
    public float a() {
        switch (this.f4246a) {
            case 1:
                return this.f4247b;
            case 2:
                return this.f4247b;
            case 3:
                return this.f4247b;
            default:
                return this.f4247b;
        }
    }

    @Override // x.f
    public void b(y2.c cVar, int i, int[] iArr, int[] iArr2) {
        switch (this.f4246a) {
            case 1:
                x.h.c(i, iArr, iArr2, false);
                return;
            case 2:
                x.h.f(i, iArr, iArr2, false);
                return;
            case 3:
                x.h.g(i, iArr, iArr2, false);
                return;
            default:
                x.h.h(i, iArr, iArr2, false);
                return;
        }
    }

    @Override // x.d
    public void c(y2.c cVar, int i, int[] iArr, m mVar, int[] iArr2) {
        switch (this.f4246a) {
            case 1:
                if (mVar == m.f30814u) {
                    x.h.c(i, iArr, iArr2, false);
                    return;
                } else {
                    x.h.c(i, iArr, iArr2, true);
                    return;
                }
            case 2:
                if (mVar == m.f30814u) {
                    x.h.f(i, iArr, iArr2, false);
                    return;
                } else {
                    x.h.f(i, iArr, iArr2, true);
                    return;
                }
            case 3:
                if (mVar == m.f30814u) {
                    x.h.g(i, iArr, iArr2, false);
                    return;
                } else {
                    x.h.g(i, iArr, iArr2, true);
                    return;
                }
            default:
                if (mVar == m.f30814u) {
                    x.h.h(i, iArr, iArr2, false);
                    return;
                } else {
                    x.h.h(i, iArr, iArr2, true);
                    return;
                }
        }
    }

    public String toString() {
        switch (this.f4246a) {
            case 1:
                return "Arrangement#Center";
            case 2:
                return "Arrangement#SpaceAround";
            case 3:
                return "Arrangement#SpaceBetween";
            case 4:
                return "Arrangement#SpaceEvenly";
            default:
                return super.toString();
        }
    }
}
