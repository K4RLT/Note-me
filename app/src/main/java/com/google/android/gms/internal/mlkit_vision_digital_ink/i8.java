package com.google.android.gms.internal.mlkit_vision_digital_ink;
import a0.f0;
import ca.d;
import ea.h;
import fa.y;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14467a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14468b;

    /* renamed from: c, reason: collision with root package name */
    public int f14469c;

    /* renamed from: d, reason: collision with root package name */
    public Object f14470d;
    public Object e;

    public i8(MessageDigest messageDigest, int i) {
        this.f14467a = 0;
        this.f14470d = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.e = messageDigest;
        this.f14469c = i;
    }

    public i8 a() {
        boolean z3;
        if (((h) this.f14470d) != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        y.a("execute parameter required", z3);
        return new i8(this, (d[]) this.e, this.f14468b, this.f14469c);
    }

    public void b(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            ((ByteBuffer) this.f14470d).putChar(str.charAt(i));
            d(2);
        }
    }

    public e8 c() {
        pa.s("Cannot re-use a Hasher after calling hash() on it", !this.f14468b);
        this.f14468b = true;
        int i = this.f14469c;
        MessageDigest messageDigest = (MessageDigest) this.e;
        if (i == messageDigest.getDigestLength()) {
            byte[] digest = messageDigest.digest();
            char[] cArr = f8.f14304u;
            return new e8(digest);
        }
        byte[] copyOf = Arrays.copyOf(messageDigest.digest(), i);
        char[] cArr2 = f8.f14304u;
        return new e8(copyOf);
    }

    public void d(int i) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f14470d;
        try {
            byte[] array = byteBuffer.array();
            pa.s("Cannot re-use a Hasher after calling hash() on it", !this.f14468b);
            ((MessageDigest) this.e).update(array, 0, i);
        } finally {
            byteBuffer.clear();
        }
    }

    public String toString() {
        switch (this.f14467a) {
            case 3:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("BackStackEntry{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                if (this.f14469c >= 0) {
                    sb2.append(" #");
                    sb2.append(this.f14469c);
                }
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public i8(i8 i8Var, d[] dVarArr, boolean z3, int i) {
        this.f14467a = 2;
        this.e = i8Var;
        this.f14470d = dVarArr;
        boolean z9 = false;
        if (dVarArr != null && z3) {
            z9 = true;
        }
        this.f14468b = z9;
        this.f14469c = i;
    }

    public /* synthetic */ i8() {
        this.f14467a = 1;
    }

    public i8(f0 f0Var) {
        this.f14467a = 3;
        f0Var.getClass();
        this.f14470d = new ArrayList();
        this.f14469c = -1;
        this.e = f0Var;
    }
}
