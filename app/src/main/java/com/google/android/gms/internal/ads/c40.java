package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class c40 extends e20 {
    public final /* synthetic */ int i;

    public /* synthetic */ c40(int i) {
        this.i = i;
    }

    public static void o(int i, ByteBuffer byteBuffer) {
        int floatToIntBits;
        float f10 = (float) (i * 4.656612875245797E-10d);
        if (Float.isNaN(f10)) {
            floatToIntBits = 0;
        } else {
            floatToIntBits = Float.floatToIntBits(f10);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x02b7 A[ADDED_TO_REGION, LOOP:19: B:118:0x02b7->B:119:0x02b9, LOOP_START, PHI: r2
      0x02b7: PHI (r2v2 int) = (r2v1 int), (r2v3 int) binds: [B:75:0x017e, B:119:0x02b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0180  */
    @Override // com.google.android.gms.internal.ads.t10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.nio.ByteBuffer r21) {
        /*
            Method dump skipped, instructions count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c40.g(java.nio.ByteBuffer):void");
    }

    @Override // com.google.android.gms.internal.ads.e20
    public final a00 k(a00 a00Var) {
        switch (this.i) {
            case 0:
                int i = a00Var.f4301c;
                if (bq0.d(i)) {
                    if (i != 2) {
                        return new a00(a00Var.f4299a, a00Var.f4300b, 2);
                    }
                    return a00.e;
                }
                throw new i10("Unhandled input format:", a00Var);
            default:
                int i10 = a00Var.f4301c;
                if (bq0.d(i10)) {
                    if (i10 != 4) {
                        return new a00(a00Var.f4299a, a00Var.f4300b, 4);
                    }
                    return a00.e;
                }
                throw new i10("Unhandled input format:", a00Var);
        }
    }
}
