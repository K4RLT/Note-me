package com.google.android.gms.internal.ads;
import z8.b;

import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public final class jt0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7536a;

    /* renamed from: b, reason: collision with root package name */
    public final b f7537b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7538c;

    public /* synthetic */ jt0(hq0 hq0Var) {
        this.f7536a = (String) hq0Var.f6872v;
        this.f7537b = (b) hq0Var.f6873w;
        this.f7538c = (String) hq0Var.f6874x;
    }

    public final String a() {
        b bVar = this.f7537b;
        if (bVar == null) {
            return "unknown";
        }
        return bVar.name().toLowerCase(Locale.ENGLISH);
    }

    public final boolean equals(Object obj) {
        b bVar;
        b bVar2;
        if (obj instanceof jt0) {
            jt0 jt0Var = (jt0) obj;
            if (this.f7536a.equals(jt0Var.f7536a) && (bVar = this.f7537b) != null && (bVar2 = jt0Var.f7537b) != null && bVar.equals(bVar2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f7536a, this.f7537b);
    }
}
