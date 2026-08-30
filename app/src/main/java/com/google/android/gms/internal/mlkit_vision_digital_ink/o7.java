package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class o7 extends cp {

    /* renamed from: f, reason: collision with root package name */
    public static final Set f14740f;

    /* renamed from: g, reason: collision with root package name */
    public static final u6 f14741g;

    /* renamed from: h, reason: collision with root package name */
    public static final m7 f14742h;

    /* renamed from: b, reason: collision with root package name */
    public final String f14743b;

    /* renamed from: c, reason: collision with root package name */
    public final Level f14744c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f14745d;
    public final u6 e;

    static {
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(u5.f15043a, l6.f14596a, m6.f14661a)));
        f14740f = unmodifiableSet;
        u6 u6Var = new u6(f7.a(unmodifiableSet));
        f14741g = u6Var;
        f14742h = new m7(Level.ALL, unmodifiableSet, u6Var);
    }

    public /* synthetic */ o7(String str, Level level, Set set, u6 u6Var) {
        super(str);
        this.f14743b = nw.g(str);
        this.f14744c = level;
        this.f14745d = set;
        this.e = u6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0492  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m(com.google.android.gms.internal.mlkit_vision_digital_ink.q5 r31, java.lang.String r32, java.util.logging.Level r33, java.util.Set r34, com.google.android.gms.internal.mlkit_vision_digital_ink.u6 r35) {
        /*
            Method dump skipped, instructions count: 1190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.o7.m(com.google.android.gms.internal.mlkit_vision_digital_ink.q5, java.lang.String, java.util.logging.Level, java.util.Set, com.google.android.gms.internal.mlkit_vision_digital_ink.u6):void");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.cp
    public final void f(q5 q5Var) {
        m(q5Var, this.f14743b, this.f14744c, this.f14745d, this.e);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.cp
    public final boolean i(Level level) {
        int i = nw.i(level);
        if (!Log.isLoggable(this.f14743b, i) && !Log.isLoggable("all", i)) {
            return false;
        }
        return true;
    }
}
