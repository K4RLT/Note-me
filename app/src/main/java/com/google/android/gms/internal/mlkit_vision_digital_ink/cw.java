package com.google.android.gms.internal.mlkit_vision_digital_ink;
import a5.a;
import g5.q;

/* loaded from: classes.dex */
public final class cw {

    /* renamed from: a, reason: collision with root package name */
    public final fs f14173a;

    /* renamed from: b, reason: collision with root package name */
    public final tr f14174b;

    public cw(fs fsVar, tr trVar) {
        this.f14173a = fsVar;
        if (trVar != null) {
            this.f14174b = trVar;
        } else {
            q.h("Null dataFileGroup");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof cw) {
                cw cwVar = (cw) obj;
                if (this.f14173a.equals(cwVar.f14173a) && this.f14174b.equals(cwVar.f14174b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f14173a.hashCode() ^ 1000003) * 1000003) ^ this.f14174b.hashCode();
    }

    public final String toString() {
        return a.h("GroupKeyAndGroup{groupKey=", this.f14173a.toString(), ", dataFileGroup=", this.f14174b.toString(), "}");
    }
}
