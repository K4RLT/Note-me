package com.google.android.gms.internal.measurement;
import g3.a;
import l4.a;
import p4.a;

import android.view.MotionEvent;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f implements Iterator {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f13742u;

    /* renamed from: v, reason: collision with root package name */
    public int f13743v = 0;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Iterable f13744w;

    public /* synthetic */ f(Iterable iterable, int i) {
        this.f13742u = i;
        this.f13744w = iterable;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f13742u) {
            case 0:
                if (this.f13743v < ((d) this.f13744w).r()) {
                    return true;
                }
                return false;
            default:
                if (this.f13743v < ((a) this.f13744w).f22388v.getHistorySize() + 1) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f13742u) {
            case 0:
                int i = this.f13743v;
                d dVar = (d) this.f13744w;
                int r8 = dVar.r();
                int i10 = this.f13743v;
                if (i < r8) {
                    this.f13743v = i10 + 1;
                    return dVar.p(i10);
                }
                a.h(a.g(i10, "Out of bounds index: "));
                return null;
            default:
                a aVar = (a) this.f13744w;
                MotionEvent motionEvent = aVar.f22388v;
                int i11 = aVar.f22387u;
                if (this.f13743v > motionEvent.getHistorySize()) {
                    return null;
                }
                com.google.android.gms.internal.ads.f3 f3Var = new com.google.android.gms.internal.ads.f3(i11);
                MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) f3Var.f5900w;
                int i12 = 0;
                if (this.f13743v < motionEvent.getHistorySize()) {
                    while (true) {
                        int i13 = this.f13743v;
                        if (i12 < i11) {
                            motionEvent.getHistoricalPointerCoords(i12, i13, pointerCoordsArr[i12]);
                            i12++;
                        } else {
                            f3Var.f5899v = motionEvent.getHistoricalEventTime(i13);
                        }
                    }
                } else {
                    while (i12 < i11) {
                        motionEvent.getPointerCoords(i12, pointerCoordsArr[i12]);
                        i12++;
                    }
                    f3Var.f5899v = motionEvent.getEventTime();
                }
                this.f13743v++;
                return f3Var;
        }
    }
}
