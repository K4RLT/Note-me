package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class cu1 {

    /* renamed from: b, reason: collision with root package name */
    public static final cu1 f5175b = new cu1(new lt0(10));

    /* renamed from: a, reason: collision with root package name */
    public final j51 f5176a;

    public cu1(lt0 lt0Var) {
        this.f5176a = (j51) lt0Var.f8135v;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof cu1) && this.f5176a.equals(((cu1) obj).f5176a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f5176a, null, null, bool, bool, bool, bool, bool);
    }
}
