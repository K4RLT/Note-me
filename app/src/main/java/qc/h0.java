package qc;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class h0 extends q1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f23780a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f23781b;

    public h0(String str, byte[] bArr) {
        this.f23780a = str;
        this.f23781b = bArr;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj != this) {
            if (obj instanceof q1) {
                q1 q1Var = (q1) obj;
                h0 h0Var = (h0) q1Var;
                if (this.f23780a.equals(h0Var.f23780a)) {
                    if (q1Var instanceof h0) {
                        bArr = ((h0) q1Var).f23781b;
                    } else {
                        bArr = h0Var.f23781b;
                    }
                    if (Arrays.equals(this.f23781b, bArr)) {
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
        return ((this.f23780a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f23781b);
    }

    public final String toString() {
        return "File{filename=" + this.f23780a + ", contents=" + Arrays.toString(this.f23781b) + "}";
    }
}
