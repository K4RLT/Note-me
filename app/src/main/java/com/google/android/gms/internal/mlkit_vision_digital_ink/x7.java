package com.google.android.gms.internal.mlkit_vision_digital_ink;
import c4.t;

import com.google.android.gms.internal.ads.zb1;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class x7 extends zb1 {

    /* renamed from: x, reason: collision with root package name */
    public static final Map f15233x;

    /* renamed from: w, reason: collision with root package name */
    public final n6 f15234w;

    static {
        EnumMap enumMap = new EnumMap(n6.class);
        for (n6 n6Var : n6.values()) {
            x7[] x7VarArr = new x7[10];
            for (int i = 0; i < 10; i++) {
                x7VarArr[i] = new x7(i, n6Var, o6.e);
            }
            enumMap.put((EnumMap) n6Var, (n6) x7VarArr);
        }
        f15233x = Collections.unmodifiableMap(enumMap);
    }

    public x7(int i, n6 n6Var, o6 o6Var) {
        super(o6Var, i);
        n5.e(n6Var, "format char");
        this.f15234w = n6Var;
        if (!o6Var.b()) {
            int i10 = n6Var.f14700u;
            i10 = o6Var.c() ? i10 & 65503 : i10;
            StringBuilder sb2 = new StringBuilder("%");
            o6Var.a(sb2);
            sb2.append((char) i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zb1
    public final void h(c4.t tVar, Object obj) {
        tVar.e(obj, this.f15234w, (o6) this.f13135v);
    }
}
