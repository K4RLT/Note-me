package v1;
import r.b;
import r.d;

import android.os.Build;
import android.view.MotionEvent;
import com.google.android.gms.internal.ads.mf;
import java.util.List;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f27327a;

    /* renamed from: b, reason: collision with root package name */
    public final mf f27328b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27329c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27330d;
    public int e;

    public k(List list, mf mfVar) {
        int i;
        int i10;
        MotionEvent b10;
        this.f27327a = list;
        this.f27328b = mfVar;
        int i11 = 0;
        if (Build.VERSION.SDK_INT >= 29 && (b10 = b()) != null) {
            i = b10.getClassification();
        } else {
            i = 0;
        }
        this.f27329c = i;
        MotionEvent b11 = b();
        if (b11 != null) {
            i10 = b11.getButtonState();
        } else {
            i10 = 0;
        }
        this.f27330d = i10;
        MotionEvent b12 = b();
        if (b12 != null) {
            b12.getMetaState();
        }
        MotionEvent b13 = b();
        if (b13 != null) {
            int actionMasked = b13.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 8:
                                i11 = 6;
                                break;
                            case 9:
                                i11 = 4;
                                break;
                            case 10:
                                i11 = 5;
                                break;
                        }
                    }
                    i11 = 3;
                }
                i11 = 2;
            }
            i11 = 1;
        } else {
            int size = list.size();
            while (i11 < size) {
                t tVar = (t) list.get(i11);
                if (d(tVar)) {
                    i11 = 2;
                } else if (b(tVar)) {
                    i11 = 1;
                } else {
                    i11++;
                }
            }
            i11 = 3;
        }
        this.e = i11;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final List a() {
        return this.f27327a;
    }

    public final MotionEvent b() {
        mf mfVar = this.f27328b;
        if (mfVar != null) {
            return (MotionEvent) ((j6.l) mfVar.f8338w).f18934w;
        }
        return null;
    }
}
