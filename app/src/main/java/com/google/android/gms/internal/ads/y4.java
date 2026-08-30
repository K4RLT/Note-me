package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class y4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12770a;

    /* renamed from: b, reason: collision with root package name */
    public final j2 f12771b;

    /* renamed from: c, reason: collision with root package name */
    public final v1 f12772c;

    /* renamed from: d, reason: collision with root package name */
    public final a7 f12773d;
    public final b0 e;

    static {
        b51 b51Var = d51.f5314v;
        y51 y51Var = y51.f12781y;
        List list = Collections.EMPTY_LIST;
        o3 o3Var = o3.f8931a;
        new n();
        a7 a7Var = a7.C;
        String str = bq0.f4860a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ y4(String str, b0 b0Var, j2 j2Var, v1 v1Var, a7 a7Var) {
        o3 o3Var = o3.f8931a;
        this.f12770a = str;
        this.f12771b = j2Var;
        this.f12772c = v1Var;
        this.f12773d = a7Var;
        this.e = b0Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof y4) {
                y4 y4Var = (y4) obj;
                if (this.f12770a.equals(y4Var.f12770a) && this.e.equals(y4Var.e) && Objects.equals(this.f12771b, y4Var.f12771b) && this.f12772c.equals(y4Var.f12772c) && Objects.equals(this.f12773d, y4Var.f12773d)) {
                    o3 o3Var = o3.f8931a;
                    if (o3Var.equals(o3Var)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f12770a.hashCode() * 31;
        j2 j2Var = this.f12771b;
        if (j2Var != null) {
            i = j2Var.hashCode();
        } else {
            i = 0;
        }
        return (this.f12773d.hashCode() + ((this.e.hashCode() + ((this.f12772c.hashCode() + ((hashCode + i) * 31)) * 31)) * 31)) * 31;
    }
}
