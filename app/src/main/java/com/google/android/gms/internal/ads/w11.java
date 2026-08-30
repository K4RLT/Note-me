package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class w11 implements t11 {

    /* renamed from: a, reason: collision with root package name */
    public final h21 f12094a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12095b;

    public w11(h21 h21Var, long j10) {
        this.f12094a = h21Var;
        this.f12095b = j10;
    }

    public static boolean c(vy0 vy0Var) {
        int z3 = vy0Var.A().z().z();
        int A = vy0Var.A().z().A();
        byte[] p10 = x21.p();
        p10.getClass();
        ByteBuffer allocate = ByteBuffer.allocate(6);
        allocate.getClass();
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putShort((short) z3);
        allocate.putInt(A);
        byte[] array = allocate.array();
        array.getClass();
        return Arrays.equals(array, p10);
    }

    @Override // com.google.android.gms.internal.ads.t11
    public final boolean a(vy0 vy0Var) {
        boolean z3 = true;
        h21 h21Var = this.f12094a;
        if (vy0Var != null && !vy0Var.equals(vy0.F())) {
            if (!c(vy0Var)) {
                h21Var.b(20205);
                return true;
            }
            if (vy0Var.A().B() - System.currentTimeMillis() > this.f12095b) {
                z3 = false;
            }
            if (z3) {
                h21Var.b(20203);
            }
            return z3;
        }
        h21Var.b(20202);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.t11
    public final boolean b(vy0 vy0Var) {
        h21 h21Var = this.f12094a;
        if (vy0Var != null && !vy0Var.equals(vy0.F())) {
            if (!c(vy0Var)) {
                h21Var.b(20206);
                return false;
            }
            return true;
        }
        h21Var.b(20204);
        return false;
    }
}
